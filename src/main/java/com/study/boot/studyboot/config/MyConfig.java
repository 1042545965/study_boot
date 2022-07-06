package com.study.boot.studyboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 这个就是之前的beans.xml的文件 , MyConfig 本身也是一个组件
 * proxyBeanMethods 这个属性能保存testObj属性的单实例 ，这个是springboot2 的最大的更新
 * proxyBeanMethods = false 解决的是组件依赖 。更轻量级 。启动过程会很快
 * 所以如果这个组件没有什么依赖关系 ，那么可以将该参数设置为 false 启动快 ， 不会去坚持唯一性
 *
 */
@Configuration(proxyBeanMethods = true)
public class MyConfig {

    /**
     * testObj 将 Object 这个对象放到容器当中
     * 外界对组件内的多次调用 ，是单实例对象
     */
    @Bean
    public Object testObj(){
        return new Object();
    }

}
