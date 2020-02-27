package com.chapter11;

import javafx.scene.layout.Pane;

import java.awt.*;

/**
 * Author beck
 * Date 2020/2/27 23:23
 **/
public class TestPanel {
    public static void main(String[] args) {
        Frame f = new Frame("Java Frame with Panel");
        Panel p = new Panel(null);
        f.setLayout(null);
        f.setBounds(300, 300, 500, 500);
        f.setBackground(new Color(0, 0, 102));
        p.setBounds(50, 50, 400, 400);  //距离frame左上角的点(50，50)
        p.setBackground(new Color(204, 204, 255));  //三原色红绿蓝，0-255范围
        f.add(p);
        f.setVisible(true);
    };
}
