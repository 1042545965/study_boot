package com.study.boot.studyboot.config;

import com.study.boot.studyboot.beans.Pet;
import com.study.boot.studyboot.beans.User;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * 使用在组件上 , 将指定类型的组件导入 ，容器会自动调用无参构造器创建这个对象
 */
@Configuration
public class MyConditionalConfig {

    @Bean
    public Pet testPet(){
        return new Pet();
    }

    // 这顺序还不能调换 ， 调换那么实例化 tomObj 的时候还没实例化 testPet 那么 ConditionalOnBean 判断生效
    @Bean
    @ConditionalOnBean(name = "testPet" )
    public User tomObj(Pet pet){
        User user = new User();
        user.setPet(pet);
        return user;
    }

}
