package com.chapter11;

import javax.management.monitor.Monitor;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Author beck
 * Date 2020/3/1 10:55
 **/
public class TestActionEvent2 {
    public static void main(String[] args) {
        Frame f = new Frame("Test");
        Button b1 = new Button("Start");   //b1没有设置ActionCommand，默认的是Label名字Start
        Button b2 = new Button("Stop");
        Monitor2 bh = new Monitor2();
        b1.addActionListener(bh);    //一个监听器对象监听了两个按钮
        b2.addActionListener(bh);
        b2.setActionCommand("game over");
        f.add(b1, "North");
        f.add(b2, "Center");
        f.pack();
        f.setVisible(true);
    };
}


class Monitor2 implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        System.out.println("a button has been pressed, " + "the relative info is : \n " + e.getActionCommand());
    }
}
