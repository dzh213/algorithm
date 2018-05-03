package com.algorithm.offer.observer;

/**
 * Created by donghao on 2018/5/3.
 */
public class ObserverMain {
    public static void main(String[] args) {
        WeatherServer weatherServer = new WeatherServer();

        User zhangsan = new User("zhangsan");
        User lisi = new User("lisi");
        User wanger = new User("wanger");

        weatherServer.regisObserver(zhangsan);
        weatherServer.regisObserver(lisi);
        weatherServer.regisObserver(wanger);

        weatherServer.notifyObserber();

        weatherServer.removeObserver(zhangsan);
        System.out.println("------------------------再次通知-----------------");
        weatherServer.notifyObserber();
    }
}
