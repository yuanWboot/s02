package com.zy.spring.ioc.factory;

import com.zy.spring.ioc.entity.Apple;

//工厂实例化创建对象是指：ioC容器对工厂类进行实例化并调用相关实例方法创建对象的进程
public class AppleFactoryInstance {
    public Apple createSweetApple() {
        Apple apple = new Apple();
        apple.setTitle("红苹果");
        apple.setColor("红色");
        apple.setOrigin("中亚");
        apple.setPrice(88f);
        return  apple;
    }
}
