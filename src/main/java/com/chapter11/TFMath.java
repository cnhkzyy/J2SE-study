package com.chapter11;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Author beck
 * Date 2020/3/1 11:29
 **/
public class TFMath {
    public static void main(String[] args) {
        new TFFrame3().launchFrame();
    };
}


class TFFrame3 extends Frame {
    TextField num1, num2, num3;
    public void launchFrame() {
        num1 = new TextField(10);    //设置宽度
        num2 = new TextField(10);
        num3 = new TextField(15);
        Label lblPlus = new Label(("+"));
        Button btnEqual = new Button("=");
        btnEqual.addActionListener(new MyMonitor(this));
        setLayout(new FlowLayout());
        add(num1);
        add(lblPlus);
        add(num2);
        add(btnEqual);
        add(num3);
        pack();
        setVisible(true);
    }
}


class MyMonitor implements ActionListener {
//    TextField num1, num2, num3;
//
//    public MyMonitor(TextField num1, TextField num2, TextField num3) {
//        this.num1 = num1;
//        this.num2 = num2;
//        this.num3 = num3;
//    }

    TFFrame3 tf = null;

    public MyMonitor(TFFrame3 tf) {
        this.tf = tf;
    }

    public void actionPerformed(ActionEvent e) {
        int n1 = Integer.parseInt(tf.num1.getText());
        int n2 = Integer.parseInt(tf.num2.getText());
        tf.num3.setText("" + (n1 + n2));
    }
}
