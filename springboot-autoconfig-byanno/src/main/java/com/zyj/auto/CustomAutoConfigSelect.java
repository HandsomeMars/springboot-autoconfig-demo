package com.zyj.auto;

import com.zyj.config.CustomAutoConfig;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author by zyj
 * @version V1.0
 * @Description:
 * @Date 2019/8/5 11:28
 */
public class CustomAutoConfigSelect implements ImportSelector{
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        /** 打印springboot使用的注解annotationMetadata.getAnnotationTypes().forEach(System.out::println);*/
        if(annotationMetadata.getAnnotationTypes().contains(EnableCustomAutoConfig.class.getName())){
            //配置自动配置需要加载的类
            return new String[]{CustomAutoConfig.class.getName()};
        }else{
            //没有自动配置则不加载
            return new String[0];
        }

    }
}
