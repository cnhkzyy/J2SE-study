package com.chapter8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Author beck
 * Date 2020/2/20 21:31
 **/
public class TestTransForm2 {
    public static void main(String[] args) {
        InputStreamReader isr = new InputStreamReader(System.in);  //System.in接收键盘输入，按照字符流读
        BufferedReader br = new BufferedReader(isr);  //BufferedReader有按行读取的方法
        String s = null;
        try {
            s = br.readLine();
            while (s != null) {
                if(s.equalsIgnoreCase("exit")) break;
                System.out.println(s.toUpperCase());
                s = br.readLine();
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    };
}
