package com.chapter11;

import java.awt.*;

/**
 * Author beck
 * Date 2020/3/1 12:13
 **/
public class TestPaint {
    public static void main(String[] args) {
        new PaintFrame().launchFrame();
    };
}


class PaintFrame extends Frame {

    public void launchFrame() {
        setBounds(200, 200, 640, 480);
        setVisible(true);
    }

    public void paint(Graphics g) {   //paint方法是重写的方法，是自动调用的。每次需要重画的时候，自动调用paint方法
        Color c = g.getColor();
        g.setColor(Color.RED);
        g.fillOval(50, 50, 30, 30);    //实心的椭圆，是方形的内切椭圆
        g.setColor(Color.GREEN);
        g.fillRect(80, 80, 40, 40);    //画个矩形
        g.setColor(c);     //恢复颜色
    }
}