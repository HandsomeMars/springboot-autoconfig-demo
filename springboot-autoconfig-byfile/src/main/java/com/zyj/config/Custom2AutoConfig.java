package com.zyj.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

/**
 * @author by zyj
 * @version V1.0
 * @Description:
 * @Date 2019/8/5 11:29
 */
/**类似@Import 加载属性文件（相当于属性文件@Component）*/
/**与下面@Autowired配合*/
@EnableConfigurationProperties(Custom2Properties.class)
public class Custom2AutoConfig {

    @Autowired
    Custom2Properties custom2Properties;

    @Bean
    /**不存在实例才加载,避免重复*/
    @ConditionalOnMissingBean(Custom2Server.class)
    /**classpath出现Custom2Server才加载*/
    @ConditionalOnClass(Custom2Server.class)
    /**配置enable才加载*/
    @ConditionalOnProperty(prefix="custom2", value="enable", matchIfMissing = true)
    public Custom2Server custom2Server(){
        Custom2Server testServer=new Custom2Server(custom2Properties);
        return testServer;
    }

}
