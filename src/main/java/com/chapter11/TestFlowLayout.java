package com.chapter11;

import java.awt.*;

/**
 * Author beck
 * Date 2020/2/29 22:23
 **/
public class TestFlowLayout {
    public static void main(String[] args) {
        Frame f = new Frame("Flow Layout");
        Button button1 = new Button("Ok");
        Button button2 = new Button("Open");
        Button button3 = new Button("Close");

        f.setLayout(new FlowLayout(FlowLayout.LEFT));  //默认居中;FlowLayout.LEFT,左对齐
        f.add(button1);
        f.add(button2);
        f.add(button3);
        f.setSize(100, 100);
        f.setVisible(true);
    };
}
