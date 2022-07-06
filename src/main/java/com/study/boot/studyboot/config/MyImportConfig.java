package com.study.boot.studyboot.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * 使用在组件上 , 将指定类型的组件导入 ，容器会自动调用无参构造器创建这个对象
 */
@Import(value = {Object.class})
@Configuration
public class MyImportConfig {


}
