package com.algorithm.offer.observer;

/**
 * Created by donghao on 2018/5/3.
 * 观察者接口
 */
public interface Observer {
    //观察者观察到通知后做出反应
    void update(String message);
}
