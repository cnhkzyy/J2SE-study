package com.chapter9;

/**
 * Author beck
 * Date 2020/2/22 19:00
 **/
public class TT implements Runnable{
    int b = 100;

    public synchronized void m1() throws Exception{
        b = 1000;   //锁定整个线程，只是锁定当前方法的三句话，但另一个线程完全可以访问m2
        Thread.sleep(5000);
        System.out.println("b = " + b);
    }

    public void m2() {
        System.out.println(b);
    }

    public void run() {
        try {
            m1();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        TT tt = new TT();
        Thread t = new Thread(tt);
        t.start();

        try {
            Thread.sleep(1000);
        } catch (Exception e) {};
        tt.m2();
    }
}
