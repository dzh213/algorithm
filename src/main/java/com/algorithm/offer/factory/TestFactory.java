package com.algorithm.offer.factory;

/**
 * Created by donghao on 2018/5/6.
 */
public class TestFactory {
    public static void main(String[] args) {
        Car car = CarFactory.productCar("benchi");
        car.product();
        Car car2 = CarFactory.productCar("baoma");
        car2.product();
    }
}
