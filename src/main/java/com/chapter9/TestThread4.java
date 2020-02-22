package com.chapter9;

/**
 * Author beck
 * Date 2020/2/22 17:30
 **/
public class TestThread4 {
    public static void main(String[] args) {
        Runner4 r = new Runner4();
        Thread t = new Thread(r);
        t.start();
        for (int i = 0; i < 100000; i++) {
            if (i % 10000 == 0 & i > 0) {
                System.out.println("in thread main i=" + i);
            }
        }
        System.out.println("Thread main is over");
        r.shutDown();    //怎么正确的让一个正在运行的线程停止
    };
}


class Runner4 implements Runnable {
    private boolean flag = true;

    public void run() {
        int i = 0;
        while (flag == true) {
            System.out.println(" " + i++);
        }
    }

    public void shutDown() {
        flag = false;
    }
}
