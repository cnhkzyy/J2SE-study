package com.chapter9;

/**
 * Author beck
 * Date 2020/2/22 17:13
 **/
public class TestPriority {
    public static void main(String[] args) {
        Thread t1 = new Thread(new T1());
        Thread t2 = new Thread(new T2());
        t1.setPriority(Thread.NORM_PRIORITY + 3);    //t1优先级提高了3个等级
        t1.start();
        t2.start();
    };
}


class T1 implements Runnable {
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println("T1: " + i);
        }
    }
}


class T2 implements Runnable {
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println("------T2: " + i);
        }
    }
}
