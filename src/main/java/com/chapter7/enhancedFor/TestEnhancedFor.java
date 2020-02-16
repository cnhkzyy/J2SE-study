package com.chapter7.enhancedFor;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Author beck
 * Date 2020/2/16 11:43
 **/
public class TestEnhancedFor {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5};
        for(int i : arr) {
            System.out.println(i);
        }

        Collection c = new ArrayList();
        c.add(new String("aaa"));
        c.add(new String("bbb"));
        c.add(new String("ccc"));

        for (Object o: c) {
            System.out.println(o);
        }
    };
}
