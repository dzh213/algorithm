package com.algorithm.offer.observer;

/**
 * Created by donghao on 2018/5/3.
 */
public class User implements Observer {
    private String name;
    private String message;
    public User(String name) {
        this.name = name;
    }
    @Override
    public void update(String message) {
        System.out.println(name+"收到了通知消息，"+message);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
