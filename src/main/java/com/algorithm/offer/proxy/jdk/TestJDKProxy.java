package com.algorithm.offer.proxy.jdk;

/**
 * Created by donghao on 2018/4/20.
 * 参考：http://www.cnblogs.com/jqyp/archive/2010/08/20/1805041.html
 */
public class TestJDKProxy {
    public static void main(String[] args) {
        BookFacadeProxy proxy = new BookFacadeProxy();
        BookFacade bookFacade = (BookFacade) proxy.bind(new BookFacadeImpl());
        bookFacade.addBook();
    }
}
