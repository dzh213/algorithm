package com.algorithm.offer;

/**
 * Created by donghao on 2018/5/6.
 * 顺序输出01
 */
public class OrderPrint {
    public static void main(String[] args) {
        NumberHolder numberHolder = new NumberHolder(1);
        Thread t1 = new Thread(new Increase(numberHolder));
        Thread t2 = new Thread(new Decrease(numberHolder));
        Thread t3 = new Thread(new Increase(numberHolder));
        t1.start();
        t2.start();
        t3.start();
    }
}
class Increase implements Runnable{
    private NumberHolder numberHolder;
    public Increase(NumberHolder numberHolder) {
        this.numberHolder = numberHolder;
    }

    @Override
    public void run() {
        while (true){
            numberHolder.increase();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Decrease implements Runnable {
    private NumberHolder numberHolder;
    public Decrease(NumberHolder numberHolder) {
        this.numberHolder = numberHolder;
    }

    @Override
    public void run() {
        while (true) {
            numberHolder.decrease();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class NumberHolder{
    private int number;
    public NumberHolder(int number){
        this.number = number;
    }

    public synchronized void increase() {
        if (number == 0) {
            number++;
            System.out.println(number);
            notify();
        }else {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized void decrease() {
        if (number == 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }else {
            number--;
            System.out.println(number);
            notify();
        }
    }
}
