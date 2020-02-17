package com.chapter7.methodList;

import java.util.LinkedList;
import java.util.List;

/**
 * Author beck
 * Date 2020/2/17 21:45
 **/
public class TestMethodList1 {
    public static void main(String[] args) {
        List l1 = new LinkedList();
        for(int i = 0; i <= 5; i++) {
            l1.add("a" + i);
        }
        System.out.println(l1);    //[a0, a1, a2, a3, a4, a5]
        l1.add(3, "a100");
        System.out.println(l1);    //[a0, a1, a2, a100, a3, a4, a5]
        l1.set(6, "a200");
        System.out.println(l1);    //[a0, a1, a2, a100, a3, a4, a200]
        System.out.println((String)l1.get(2) + " ");    //a2
        System.out.println(l1.indexOf("a3"));           //4
        l1.remove(1);
        System.out.println(l1);     //[a0, a2, a100, a3, a4, a200]
    };
}
