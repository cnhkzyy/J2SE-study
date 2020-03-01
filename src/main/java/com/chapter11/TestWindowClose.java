package com.chapter11;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Author beck
 * Date 2020/3/1 15:33
 **/
public class TestWindowClose {
    public static void main(String[] args) {
        new MyFrame55("MyFrame");
    };
}


class MyFrame55 extends Frame {
    MyFrame55(String s) {
        super(s);
        setLayout(null);
        setBounds(300, 300, 400, 300);
        this.setBackground(new Color(204, 204, 255));
        setVisible(true);
        //this.addWindowListener(new MyWindowMonitor());


        this.addWindowListener(
                new WindowAdapter() {    //匿名类
                    public void windowClosing(WindowEvent e) {
                    setVisible(false);
                    System.exit(-1);
            }
        });
    }
}


    //内部类的写法
//    class MyWindowMonitor extends WindowAdapter {
//        public void windowClosing(WindowEvent e) {
//            setVisible(false);
//            System.exit(0);   //存0是正常退出，-1是非正常退出
//        }
//    }

