package com.algorithm.offer;

import java.util.LinkedList;

/**
 * Created by donghao on 2018/4/10.
 * 非阻塞实现消费生产者
 */
public class NonBlocking {
    private LinkedList list = new LinkedList();

    public static void main(String[] args) {
        NonBlocking noBlock = new NonBlocking();
        Produce produce = noBlock.new Produce();
        Consume consume = noBlock.new Consume();

        Thread t1 = new Thread(produce);
        Thread t2 = new Thread(consume);
        t1.start();
        t2.start();
    }
    class Produce implements Runnable {

        @Override
        public void run() {
            while (true) {
                synchronized (list) {
                    while (list.size() >= 10) {
                        System.out.println("满了。等待中");
                        try {
                            list.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    list.add(1);
                    System.out.println("添加1个");
                    list.notify();
                }
            }

        }
    }

    class Consume implements Runnable {

        @Override
        public void run() {
            while (true) {
                synchronized (list) {
                    while (list.size() == 0) {
                        try {
                            System.out.println("空了，等待中");
                            list.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    list.remove();
                    System.out.println("消费1个");
                    list.notify();
                }
            }

        }
    }
}
