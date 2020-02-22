package com.chapter9;

import java.util.Date;

/**
 * Author beck
 * Date 2020/2/22 16:37
 **/
public class TestInterrupt {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
        try {
            Thread.sleep(10000);  //主线程睡眠10s
        } catch (InterruptedException e) {};
        //让子线程中断结束，interrupt太粗暴，没有让子线程来得及保存
        thread.interrupt();
    };
}


class MyThread extends Thread {
    public void run() {
        while(true) {
            System.out.println("= = = " + new Date() + " = = =");
            try {
                sleep(1000);  //子线程每隔1s打印1次
            } catch (InterruptedException e) {
                return;  //线程结束
            }
        }
    }
}
