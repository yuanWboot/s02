package com.zy.spring.ioc.factory;

import com.zy.spring.ioc.entity.Apple;

//基于静态工厂实例化
public class AppleStaticFactory {
    //通过静态方法创建对象，隐藏创建对象细节
    public static Apple createSweetApple() {
        Apple apple = new Apple();
        apple.setTitle("青苹果");
        apple.setColor("青色");
        apple.setOrigin("中亚");
        apple.setPrice(66f);
        return apple;
   }
}
