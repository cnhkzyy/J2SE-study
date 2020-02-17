package com.chapter7.methodList;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Author beck
 * Date 2020/2/17 22:00
 **/
public class TestMethodList2 {
    public static void main(String[] args) {
        List l1 = new LinkedList();
        List l2 = new LinkedList();
        for(int i = 0; i <= 9; i++) {
            l1.add("a" + i);
        }
        System.out.println(l1);
        //随机排列
        Collections.shuffle(l1);
        System.out.println(l1);
        //逆序排列
        Collections.reverse(l1);
        System.out.println(l1);
        //排序
        Collections.sort(l1);
        System.out.println(l1);
        //折半查找
        System.out.println(Collections.binarySearch(l1, "a5"));

    };
}
