package com.chapter9;

/**
 * Author beck
 * Date 2020/2/22 17:01
 **/
public class TestYield {
    public static void main(String[] args) {
        //两个线程，都在执行run()方法
        MyThread3 t1 = new MyThread3("t1");
        MyThread3 t2 = new MyThread3("t2");
        t1.start();
        t2.start();
    };
}



class MyThread3 extends Thread {
    MyThread3(String s) {
        super(s);
    }

    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(getName() + ": " + i);
            if (i % 10 == 0) {
                yield();   //能够被10整除时，就让一下别人
            }
        }
    }
}
