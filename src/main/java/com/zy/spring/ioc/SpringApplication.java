package com.zy.spring.ioc;

import com.zy.spring.ioc.entity.Apple;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApplication {
    public static void main(String[] args) {
       // ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        //从IoC容器中获取bean
//        Apple sweetApple = context.getBean("apple4", Apple.class);
//        System.out.println(sweetApple.getTitle());
//        //从IoC容器中获取bean
//        Apple apple2 =(Apple)context.getBean("apple2");
//        System.out.println(apple2.getTitle());

        //将配置文件的顺序调整，后面的apple2的bean会覆盖前面的bean
        String[] configLocations = new String[]{"classpath:applicationContext.xml","classpath:applicationContext-1.xml"};
        ApplicationContext context = new ClassPathXmlApplicationContext(configLocations);
        Apple apple3 = context.getBean("apple3", Apple.class);
        Apple apple7 = context.getBean("apple7", Apple.class);
        System.out.println(apple3.getTitle());
        System.out.println(apple7.getTitle());

    }
}
