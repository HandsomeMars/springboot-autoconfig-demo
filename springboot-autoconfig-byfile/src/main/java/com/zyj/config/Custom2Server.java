package com.zyj.config;

/**
 * @author by zyj
 * @version V1.0
 * @Description:
 * @Date 2019/8/5 14:11
 */
public class Custom2Server {


    /**
     * 初始化
     * @param custom2Properties
     */
    public Custom2Server(Custom2Properties custom2Properties) {
        System.out.println(this.getClass().getName()+"初始化了:打印配置"+ custom2Properties.toString());
    }

}
