package com.algorithm.offer;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by donghao on 2018/5/1.
 * Lock Condition 实现生产者-消费者模式
 */
public class LockCondition {
    public static void main(String[] args) {
        Buffer buffer = new Buffer(10);
        Thread t1 = new Thread(new Producer(buffer));
        Thread t2 = new Thread(new Consumer(buffer));

        t1.start();
        t2.start();
    }
}

class Buffer {
    private Lock lock;
    private Condition notFull;
    private Condition notEmpty;
    private int maxSize;
    private List<Integer> store;
    Buffer(int size) {
        lock = new ReentrantLock();
        notFull = lock.newCondition();
        notEmpty = lock.newCondition();
        maxSize = size;
        store = new LinkedList<Integer>();
    }

    public void put(int value) {
        lock.lock();
        try {
            while (store.size() == maxSize) {
                System.out.println("满了");
                notFull.await();
            }
            store.add(value);
            System.out.println("生产");
            notEmpty.signal();
        }catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public Integer take() {
        lock.lock();
        try {
            while (store.size() == 0) {
                System.out.println("空了");
                notEmpty.await();
            }
            int value = ((LinkedList<Integer>)store).pop();
            System.out.println("消费");
            notFull.signal();
            return value;
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
        return null;
    }
}
class Producer implements Runnable {
    private Buffer buffer;
    Producer(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        while (true) {
            buffer.put(1);
        }
    }
}

class Consumer implements Runnable {
    private Buffer buffer;
    Consumer(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        while (true) {
            buffer.take();
        }
    }
}

