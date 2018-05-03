package com.algorithm.offer.observer;

/**
 * Created by donghao on 2018/5/3.
 * 被观察者接口
 */
public interface Observerable {
    void regisObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObserber();
}
