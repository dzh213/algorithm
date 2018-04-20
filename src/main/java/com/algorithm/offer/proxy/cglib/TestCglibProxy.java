package com.algorithm.offer.proxy.cglib;

/**
 * Created by donghao on 2018/4/20.
 */
public class TestCglibProxy {
    public static void main(String[] args) {
        BookFacadeProxy proxy = new BookFacadeProxy();
        BookFacadeImpl bookFacade = (BookFacadeImpl) proxy.getInstance(new BookFacadeImpl());
        bookFacade.addBook();
    }
}
