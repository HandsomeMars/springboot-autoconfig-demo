package com.zyj.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author by zyj
 * @version V1.0
 * @Description:
 * @Date 2019/8/5 14:35
 */
@ConfigurationProperties(prefix="custom")
public class CustomProperties {
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
