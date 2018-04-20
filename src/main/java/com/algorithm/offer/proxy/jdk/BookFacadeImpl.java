package com.algorithm.offer.proxy.jdk;

/**
 * Created by donghao on 2018/4/20.
 */
public class BookFacadeImpl implements BookFacade {
    @Override
    public void addBook() {
        System.out.println("添加图书");
    }
}
