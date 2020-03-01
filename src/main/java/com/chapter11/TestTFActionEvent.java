package com.chapter11;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Author beck
 * Date 2020/3/1 10:27
 **/
public class TestTFActionEvent {
    public static void main(String[] args) {
        new Frame();
    };
}

class TFFrame extends Frame {
    TFFrame () {
        TextField tf = new TextField();
        add(tf);
        tf.addActionListener(new TFActionListener());
        pack();
        setVisible(true);
    }
}


class TFActionListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        TextField tf = (TextField) e.getSource();
        System.out.println(tf.getText());
        tf.setText("");

    }
}