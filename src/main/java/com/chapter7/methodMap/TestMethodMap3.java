package com.chapter7.methodMap;

import java.util.HashMap;
import java.util.Map;

/**
 * Author beck
 * Date 2020/2/18 23:03
 **/
public class TestMethodMap3 {
    public static void main(String[] args) {
        Map<String, Integer> m1 = new HashMap<String, Integer>();  //改为泛型
        Map<String, Integer> m2 = new HashMap<String, Integer>();  //改为泛型
        m1.put("one", 1);  //自动打包
        m1.put("two", 2);
        m1.put("three", 3);

        m2.put("A", 1);
        m2.put("B", 2);

        System.out.println(m1.size());
        System.out.println(m1.containsKey("one"));
        System.out.println(m2.containsValue(1));
        if(m1.containsKey("two")) {
            //int i = (Integer) m1.get("two");
            int i = m1.get("two");  //自动解包，用了泛型不用强制转换
            System.out.println(i);
        }

        Map m3 = new HashMap(m1);
        m3.putAll(m2);
        System.out.println(m3);
    };
}
