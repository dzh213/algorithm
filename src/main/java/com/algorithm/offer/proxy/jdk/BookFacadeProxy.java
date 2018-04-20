package com.algorithm.offer.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by donghao on 2018/4/20.
 */
public class BookFacadeProxy implements InvocationHandler{
    private Object target;

    public Object bind(Object target) {
        this.target = target;
        //获取代理对象
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(target,args);
    }
}
