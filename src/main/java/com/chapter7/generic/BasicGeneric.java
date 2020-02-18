package com.chapter7.generic;
import java.util.*;

/**
 * Author beck
 * Date 2020/2/18 22:52
 **/
public class BasicGeneric {
    public static void main(String[] args) {
        List<String> c = new ArrayList<String>();  //<String>定义传入的必须是String
        c.add("aaa");
        c.add("bbb");
        c.add("ccc");

        for(int i = 0; i < c.size(); i++) {
            String s = c.get(i);   //取得时候也是String，不是Object，不用向下强制转换
            System.out.println(s);
        }

        Collection<String> c2 = new HashSet<String>();
        c2.add("aaa");
        c2.add("bbb");
        c2.add("ccc");
        for(Iterator<String> it = c2.iterator(); it.hasNext();) {
            String s = it.next();
            System.out.println(s);
        }
    };
}


class MyName implements Comparable<MyName> {  //<MyName>只跟MyName对象做比较
    int age;

    public int compareTo(MyName mn) {   //不需要强制转换，直接比较
        if(this.age > mn.age) return 1;
        else if (this.age < mn.age) return -1;
        else return 0;
    }
}
