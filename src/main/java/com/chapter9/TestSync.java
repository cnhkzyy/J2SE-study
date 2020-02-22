package com.chapter9;

import java.util.Timer;

/**
 * Author beck
 * Date 2020/2/22 17:59
 **/
public class TestSync implements Runnable{  //自身是一个线程类
    Timer1 timer = new Timer1();
    public static void main(String[] args) {
        TestSync test = new TestSync();
        Thread t1 = new Thread(test);
        Thread t2 = new Thread(test);
        t1.setName("t1");   //两个线程访问都是同样的timer对象
        t2.setName("t2");
        t1.start();
        t2.start();

    };


    public void run() {
        timer.add(Thread.currentThread().getName());
    }
}


class Timer1 {
    private static int num = 0;
    public void add(String name) {
        num ++;
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {}
        System.out.println(name + ", 你是第" + num + "个使用timer的线程");
    }
}
