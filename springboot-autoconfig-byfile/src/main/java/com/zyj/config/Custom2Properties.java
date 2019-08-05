package com.zyj.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author by zyj
 * @version V1.0
 * @Description:
 * @Date 2019/8/5 14:35
 */
/**解析spring配置文件中custom2开头的配置信息*/
@ConfigurationProperties(prefix="custom2")
public class Custom2Properties {
    private boolean enable;

    private String test;

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    public boolean isEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }


    @Override
    public String toString() {
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append("[");
        stringBuilder.append("enable:"+enable);
        stringBuilder.append(",");
        stringBuilder.append("test:"+test);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
