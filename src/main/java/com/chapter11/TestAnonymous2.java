package com.chapter11;

import javax.xml.soap.Text;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Author beck
 * Date 2020/3/1 15:52
 **/
public class TestAnonymous2 {
    Frame f = new Frame("Test");
    TextField tf = new TextField(10);
    Button b1 = new Button("Start");

    public TestAnonymous2() {
        f.add(b1, "North");
        f.add(tf, "South");

        b1.addActionListener(new ActionListener() {    //在按钮上添加了一个ActionListener
            private int i;
            public void actionPerformed(ActionEvent e) {
                tf.setText(e.getActionCommand() + ++i);
            }
        });


        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        

        f.pack();
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new TestAnonymous2();
    };
}
