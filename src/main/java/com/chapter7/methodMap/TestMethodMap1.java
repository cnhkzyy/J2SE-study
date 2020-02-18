package com.chapter7.methodMap;

import java.util.HashMap;
import java.util.Map;

/**
 * Author beck
 * Date 2020/2/18 22:16
 **/
public class TestMethodMap1 {
    public static void main(String[] args) {
        Map m1 = new HashMap();
        Map m2 = new HashMap();
        m1.put("one", new Integer(1));
        m1.put("two", new Integer(2));
        m1.put("three", new Integer(3));

        m2.put("A", new Integer(1));
        m2.put("B", new Integer(2));

        System.out.println(m1.size());
        System.out.println(m1.containsKey("one"));
        System.out.println(m2.containsValue(new Integer(1)));
        if(m1.containsKey("two")) {
            int i = ((Integer) m1.get("two")).intValue();   //get返回的是Object对象，所以先向下转换一下，最后转为int类型2
            System.out.println(i);
        }

        Map m3 = new HashMap(m1);   //先拷贝m1到m3
        m3.putAll(m2);   //m2添加到m3上
        System.out.println(m3);
    };
}
