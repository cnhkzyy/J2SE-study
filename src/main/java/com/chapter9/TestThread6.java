package com.chapter9;

/**
 * Author beck
 * Date 2020/2/22 17:42
 **/
public class TestThread6 {
    public static void main(String[] args) {
        Thread t = new Runner6();
        t.start();

        for (int i = 0; i < 50; i++) {
            System.out.println("MainThread: " + i);
        }

    };
}


class Runner6 extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().isAlive());   //currentThread() 拿到当前的线程
        for(int i = 0; i < 50; i++) {
            System.out.println("SubThread: " + i);
        }
    }
}