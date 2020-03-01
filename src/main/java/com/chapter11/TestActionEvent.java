package com.chapter11;

import javax.management.monitor.Monitor;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Author beck
 * Date 2020/3/1 10:33
 **/
public class TestActionEvent {
    public static void main(String[] args) {
        Frame f = new Frame("Test");
        Button b = new Button("Press Me!");
        Monitor1 bh = new Monitor1();   //监听器
        b.addActionListener(bh);        //把监听器添加到button上面
        f.add(b, BorderLayout.CENTER);
        f.pack();
        f.setVisible(true);


    };
}


class Monitor1 implements ActionListener {   //Monitor1实现了ActionListener接口，重写了接口中的actionPerformed方法
    public void actionPerformed(ActionEvent e) {   //重写什么，button添加监听器就调什么
        System.out.println("a button has been pressed");   //什么时候发生的，谁发生的，都封装在事件对象e上
    }
}
