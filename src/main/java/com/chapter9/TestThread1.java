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
        //Thread t = new Thread(r);
        //t.start();

        //方法二：本身就是一个Thread方法了，不需要new Thread，直接r.start()就行了
        r.start();


        for (int i = 0; i < 10000; i++) {
            System.out.println("Main Thread: ------" + i);
        }

    };
}


//线程类：实现了Runnable中的run方法
//方法一使用接口方法比较好，因为实现了接口还可以实现另外的接口，还可以从其他类继承，比较灵活，而继承了Thread类就不能再继承其他类
//方法一：class Runner1 implements Runnable {

//方法二：从Thread继承
class Runner1 extends Thread {
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println("Runner1: " + i);
        }
    }
}
