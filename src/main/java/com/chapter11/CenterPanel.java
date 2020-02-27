package com.chapter11;

import java.awt.*;

/**
 * Author beck
 * Date 2020/2/27 23:42
 **/
public class CenterPanel {
    public static void main(String[] args) {
        new MyFrame3("Center Panel", 300, 300, 400, 400);
    };
}


class MyFrame3 extends Frame {
    private Panel p;
    MyFrame3(String s, int x, int y, int w, int h) {
        super(s);
        setLayout(null);
        p = new Panel(null);
        p.setBounds(w/4, h/4, w/2, h/2);
        p.setBackground(Color.YELLOW);
        add(p);
        setBounds(x, y, w, h);
        setBackground(Color.BLUE);
        setVisible(true);
    }

}