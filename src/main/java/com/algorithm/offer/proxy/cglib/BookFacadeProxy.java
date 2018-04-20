package com.algorithm.offer.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by donghao on 2018/4/20.
 */
public class BookFacadeProxy implements MethodInterceptor {
    private Object target;

    public Object getInstance(Object target) {
        this.target = target;
        //增强器，动态代码生成器
        Enhancer enhancer = new Enhancer();
        //设置生成类的父类类型
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }
    @Override
    //回调方法
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        return methodProxy.invoke(target,objects);
    }
}
