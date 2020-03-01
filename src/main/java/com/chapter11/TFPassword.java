package com.chapter11;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Author beck
 * Date 2020/3/1 11:23
 **/
public class TFPassword {
    public static void main(String[] args) {
        new TFFrame2();
    };
}


class TFFrame2 extends Frame {
    TFFrame2() {
        TextField tf = new TextField();
        add(tf);
        tf.addActionListener(new TFActionListener2());
        tf.setEchoChar('*');   //设置回显字符
        pack();
        setVisible(true);
    }
}



class TFActionListener2 implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        TextField tf = (TextField) e.getSource();
        System.out.println(tf.getText());
    }
}
