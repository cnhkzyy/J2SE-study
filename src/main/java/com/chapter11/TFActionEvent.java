package com.chapter11;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Author beck
 * Date 2020/3/1 10:27
 **/
public class TFActionEvent {
    public static void main(String[] args) {
        new TFFrame();
    };
}

class TFFrame extends Frame {
    TFFrame () {
        TextField tf = new TextField();
        add(tf);     //tf被加入到Frame中
        tf.addActionListener(new TFActionListener());
        pack();
        setVisible(true);
    }
}


class TFActionListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        TextField tf = (TextField) e.getSource();    //拿到事件源，返回值是一个对象
        System.out.println(tf.getText());
        tf.setText("");   //读完之后将输入框的值设置空
    }
}