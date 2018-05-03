package com.algorithm.offer.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by donghao on 2018/5/3.
 * 天气服务，实现被观察者
 */
public class WeatherServer implements Observerable {
    private List<Observer> list;
    public WeatherServer() {
        list = new ArrayList<Observer>();
    }
    @Override
    public void regisObserver(Observer observer) {
        list.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        if (!list.isEmpty()) {
            list.remove(observer);
        }
    }

    @Override
    public void notifyObserber() {
        for (Observer observer : list) {
            observer.update("明天下雨");
        }
    }
}
