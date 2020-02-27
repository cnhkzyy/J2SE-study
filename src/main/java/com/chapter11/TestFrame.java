package com.chapter11;

import java.awt.*;

/**
 * Author beck
 * Date 2020/2/27 23:02
 **/
public class TestFrame {
    public static void main(String[] args) {
        Frame f = new Frame("My First Test");
        f.setLocation(300, 300);     //窗口出现时，左上角坐标的位置，不指定默认为(0, 0)
        f.setSize(170, 100);  //宽和高的单位是像素
        f.setBackground(Color.blue);
        f.setResizable(false);  //不能改变大小
        f.setVisible(true);
    };
}
