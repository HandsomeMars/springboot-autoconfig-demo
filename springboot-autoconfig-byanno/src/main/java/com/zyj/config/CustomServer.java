package com.zyj.config;

/**
 * @author by zyj
 * @version V1.0
 * @Description:
 * @Date 2019/8/5 14:11
 */
public class CustomServer {

    /**
     * 初始化
     * @param customProperties
     */
    public CustomServer(CustomProperties customProperties) {
        System.out.println(this.getClass().getName()+"初始化了:打印配置"+ customProperties.toString());
    }

}
