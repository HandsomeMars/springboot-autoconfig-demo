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
@EnableConfigurationProperties(CustomProperties.class)
public class CustomAutoConfig {

    @Autowired
    CustomProperties customProperties;

    @Bean
    /**不存在实例才加载,避免重复*/
    @ConditionalOnMissingBean(CustomServer.class)
    /**classpath出现CustomServer才加载*/
    @ConditionalOnClass(CustomServer.class)
    /**配置enable true 默认true才加载*/
    @ConditionalOnProperty(prefix="custom", value="enable", matchIfMissing = true)
    public CustomServer customServer(){
        CustomServer testServer=new CustomServer(customProperties);
        return testServer;
    }

}
