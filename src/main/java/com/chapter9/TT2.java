package com.chapter9;

/**
 * Author beck
 * Date 2020/2/22 20:47
 **/
public class TT2 implements Runnable{
    int b = 100;

    public synchronized void m1() throws Exception{
        b = 1000;
        Thread.sleep(5000);
        System.out.println("b = " + b);  //打印的是2000，因为m2没有加锁，所以修改了b的值
    }

    //public synchronized void m2() throws Exception{    //为了保证b是1000，可以修改m2加锁
    public void m2() throws Exception{
        Thread.sleep(2500);
        b = 2000;
    }

    public void run() {
        try {
            m1();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) throws Exception {
        TT2 tt = new TT2();
        Thread t = new Thread(tt);
        t.start();

        tt.m2();

        System.out.println(tt.b);  //打印的是1000，tt.m2先执行，t后执行
    }
}
