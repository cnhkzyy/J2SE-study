package com.chapter9;

/**
 * Author beck
 * Date 2020/2/22 17:20
 **/
public class TestThread2 {
    public static void main(String[] args) {
        //同样一个线程对象，可以用来启两个线程
        Runner2 r = new Runner2();
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        t1.start();
        t2.start();
    };
}


class Runner2 implements Runnable {
    public void run() {
        for (int i = 0; i < 30; i++) {
            System.out.println("No. " + i);
        }
    }
}
