package com.algorithm.offer.factory;

/**
 * Created by donghao on 2018/5/6.
 */
public class CarFactory {
    public static Car productCar(String type) {
        Car car = null;
        switch (type) {
            case "benchi":
                car = new BenChi();
                break;
            case "baoma":
                car = new BaoMa();
                break;
            default:
                break;
        }
        return car;
    }
}
