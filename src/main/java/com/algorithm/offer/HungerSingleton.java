package com.algorithm.offer;

/**
 * Created by donghao on 2018/4/23.
 * 饿汉式单例模式
 */
public class HungerSingleton {
    private static HungerSingleton hungerSingleton = new HungerSingleton();
    private HungerSingleton() {}
    public static HungerSingleton getInstance() {
        return hungerSingleton;
    }
}
