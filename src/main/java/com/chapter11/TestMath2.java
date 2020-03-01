package com.chapter11;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Author beck
 * Date 2020/3/1 11:51
 **/
public class TestMath2 {
    public static void main(String[] args) {
        new TFFrame6().launchFrame();
    }
}


class TFFrame6 extends Frame {
    TextField num1, num2, num3;

    public void launchFrame() {
        num1 = new TextField(10);    //设置宽度
        num2 = new TextField(10);
        num3 = new TextField(15);
        Label lblPlus = new Label(("+"));
        Button btnEqual = new Button("=");
        btnEqual.addActionListener(new MyMonitor2());
        setLayout(new FlowLayout());
        add(num1);
        add(lblPlus);
        add(num2);
        add(btnEqual);
        add(num3);
        pack();
        setVisible(true);
    }


    //内部类，可以直接访问外部包装类的成员变量或成员方法
    private class MyMonitor2 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int n1 = Integer.parseInt(num1.getText());
            int n2 = Integer.parseInt(num2.getText());
            num3.setText("" + (n1 + n2));
        }
    }
}





