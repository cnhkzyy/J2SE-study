package com.chapter11;

import javax.management.monitor.Monitor;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Author beck
 * Date 2020/3/1 12:49
 **/
public class MyMouseAdapter {
    public static void main(String[] args) {
        new MyFrame6("drawing...");
    };
}


class MyFrame6 extends Frame {
    ArrayList points = null;
    MyFrame6(String s) {
        super(s);
        points = new ArrayList();
        setLayout(null);
        setBounds(300, 300, 400, 300);
        this.setBackground(new Color(204, 204, 255));
        setVisible(true);
        this.addMouseListener(new Monitor6());
    }


    public void paint(Graphics g) {
        Iterator i = points.iterator();
        while(i.hasNext()) {
            Point p = (Point) i.next();
            g.setColor(Color.BLUE);
            g.fillOval(p.x, p.y, 10, 10);   //画个实心圆
        }
    }


    public void addPoint(Point p) {
        points.add(p);   //每点一下，把点new出来，把点加到points ArrayList中
    }
}


class Monitor6 extends MouseAdapter {   //MouseAdapter实现了MouseListener接口，如果直接继承MouseListener接口，那么MouseListener的5个方法都得实现
    public void mousePressed(MouseEvent e) {
        MyFrame6 f = (MyFrame6) e.getSource();
        f.addPoint(new Point(e.getX(), e.getY()));  //Point封装了一个点对象
        f.repaint();   //让frame强制进行重画,repaint没有画笔，但update有画笔
    }
}
