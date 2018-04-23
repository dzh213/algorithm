package com.algorithm.offer;

/**
 * Created by donghao on 2018/4/23.
 * 懒汉式单例模式
 */
public class LazySingleton {
    private LazySingleton() {}
    private static volatile LazySingleton lazySingleton = null; //阻止指令重排
    public static LazySingleton getInstance() {
        if (lazySingleton == null) {
            synchronized (LazySingleton.class) {
                if (lazySingleton == null) {    //双重检测
                    lazySingleton = new LazySingleton();
                }
            }
        }
        return lazySingleton;
    }
}
