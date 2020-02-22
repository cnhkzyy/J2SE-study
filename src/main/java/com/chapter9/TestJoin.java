package com.chapter9;

/**
 * Author beck
 * Date 2020/2/22 16:53
 **/
public class TestJoin {
    public static void main(String[] args) {
        MyThread2 t1 = new MyThread2("abcde");
        t1.start();
        try {
            t1.join();   //合并t1，把t1合并在一起一块执行。t1执行完了再执行main方法，相当于方法调用
        } catch (InterruptedException e) {

        }
        for (int i = 1; i <= 10; i++) {
            System.out.println("i am main thread");
        }
    };
}


class MyThread2 extends Thread {
    MyThread2(String s) {
        super(s); //相当于调用了父类的某一构造方法，给这个类的对象起个名字
    }

    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("i am " + getName());  //调用了Thread的getName方法
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                return;
            }
        }
    }
}
