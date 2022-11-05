package com.zy.spring.ioc;

import com.zy.spring.ioc.entity.Apple;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApplication {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        //从IoC容器中获取bean
        Apple sweetApple = context.getBean("apple4", Apple.class);
        System.out.println(sweetApple.getTitle());
        //从IoC容器中获取bean
        Apple apple2 =(Apple)context.getBean("apple2");
        System.out.println(apple2.getTitle());

    }
}
