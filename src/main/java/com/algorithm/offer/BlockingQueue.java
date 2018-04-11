package com.algorithm.offer;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * Created by donghao on 2018/4/10.
 * 使用阻塞队列实现消费生产
 */
public class BlockingQueue {
    private ArrayBlockingQueue queue = new ArrayBlockingQueue(10);

    public static void main(String[] args) {
        BlockingQueue test = new BlockingQueue();
        Producer producer = test.new Producer();
        Consumer consumer = test.new Consumer();

        Thread t1 = new Thread(producer);
        Thread t2 = new Thread(consumer);

        t1.start();
        t2.start();
    }
    class Producer implements Runnable{

        @Override
        public void run() {
            try {
                while (true) {
                    System.out.println("add");
                    queue.put(1);

                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    class Consumer implements Runnable{

        @Override
        public void run() {
            try {
                while (true) {
                    System.out.println("remove");
                    queue.take();

                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
