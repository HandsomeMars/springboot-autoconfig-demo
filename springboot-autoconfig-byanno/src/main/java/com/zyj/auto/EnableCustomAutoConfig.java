package com.zyj.auto;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @author by zyj
 * @version V1.0
 * @Description:
 * @Date 2019/8/5 11:26
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
/**如果使用注解则引入CustomAutoConfigSelect*/
@Import(CustomAutoConfigSelect.class)
public @interface EnableCustomAutoConfig {
}
