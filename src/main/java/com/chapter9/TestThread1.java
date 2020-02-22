package com.chapter9;

/**
 * Author beck
 * Date 2020/2/22 16:04
 **/
public class TestThread1 {
    public static void main(String[] args) {
        Runner1 r = new Runner1();
        //r.run();   方法调用，子线程Runner1方法先执行完，再执行主线程main

        //t.start();  线程启动，产生另外一个新的分支，main方法继续执行，两个交替运行，并行运行
        Thread t = new Thread(r);
        t.start();


        for (int i = 0; i < 100; i++) {
            System.out.println("Main Thread: ------" + i);
        }

    };
}


//线程类：实现了Runnable中的run方法
class Runner1 implements Runnable {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Runner1: " + i);
        }
    }
}
