package com.chapter9;

/**
 * Author beck
 * Date 2020/2/22 21:41
 **/
public class ProducerConsumer {
    public static void main(String[] args) {
        SyncStack ss = new SyncStack();
        Producer p = new Producer(ss);
        Consumer c = new Consumer(ss);
        new Thread(p).start();
        new Thread(c).start();
    };
}


class WoTou {
    int id;
    WoTou(int id) {
        this.id = id;
    }

    public String toString() {
        return "WoTou: " + id;
    }
}


//栈，先进后出
class SyncStack {
    int index = 0;
    WoTou[] arrayWT = new WoTou[6];

    public synchronized void push(WoTou wt) {
        if (index == arrayWT.length) {   //篮子满了需要wait
            try {
                this.wait();     //当前的，正在锁定这个对象的线程的wait，一wait,我锁丢了
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
            this.notify();   //叫醒一个正在当前对象上的线程
            arrayWT[index] = wt;
            index++;   //如果有多个线程同时扔窝头，比如A师傅扔的过程中,index还没准备加，此时B师傅准备扔，打断了A师傅，所以这个index永远等于0，不断被覆盖
            //唯一的办法是保证扔的方法不会被打断，要连续，所以需要加锁
    }

    public synchronized WoTou pop() {
        if (index == 0) {
            try {
                this.wait();           //篮子空了，当前线程也要wait
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.notify();
        index --;     //同理多个人要拿馒头，也要保证拿的过程的连续性，所以也要加锁
        return arrayWT[index];
    }
}


class Producer implements Runnable {   //师傅是线程，因为有多个大师傅同时生成窝头
    SyncStack ss = null;    //定义扔窝头的框
    Producer(SyncStack ss) {
        this.ss = ss;
    }

    public void run() {
        //每个师傅生产20个馒头，生产方法
        for (int i = 0; i < 20; i++) {
            WoTou wt = new WoTou(i);
            ss.push(wt);
            System.out.println("生产了: " + wt);
            try {
                Thread.sleep(Math.round(Math.random() * 1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}



//消费者
class Consumer implements Runnable {   //师傅是线程，因为有多个大师傅同时生成窝头
    SyncStack ss = null;    //定义扔窝头的框
    Consumer(SyncStack ss) {
        this.ss = ss;
    }

    public void run() {
        //每个人最多吃20个馒头
        for (int i = 0; i < 20; i++) {
            WoTou wt = ss.pop();
            System.out.println(wt);
            try {
                Thread.sleep(Math.round(Math.random() * 1000));
                System.out.println("消费了: " + wt);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
