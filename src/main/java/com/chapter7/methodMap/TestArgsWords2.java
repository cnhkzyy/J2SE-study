package com.chapter7.methodMap;

import java.util.HashMap;
import java.util.Map;

/**
 * Author beck
 * Date 2020/2/18 22:43
 **/
public class TestArgsWords2 {
    private static final Integer ONE = new Integer(1);
    public static void main(String[] args) {
        Map m = new HashMap();
        for (int i = 0; i < args.length; i++) {
            //Integer freq = (Integer) m.get(args[i]);
            //自动打包和解包的写法
            int freq = (Integer) m.get(args[i]) == null ? 0: (Integer) m.get(args[i]);
            //m.put(args[i], (freq == null? ONE : new Integer(freq.intValue() + 1)));
            m.put(args[i], freq == 0 ? ONE : freq + 1);
        }
        System.out.println(m.size() + " distinct words detected");
        System.out.println(m);
    };
};


