package com.chapter8;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Author beck
 * Date 2020/2/19 23:50
 **/
public class TestBufferStream1 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("E:\\java_workshop\\J2SE-study\\src\\main\\java\\com\\chapter8\\HelloWorld.java");
            BufferedInputStream bis = new BufferedInputStream(fis);
            int c = 0;
            System.out.println(bis.read());
            System.out.println(bis.read());
            System.out.println();
            bis.mark(100);  //直接从第100个字符往外读
            for (int i = 0; i < 10 && (c = bis.read()) != -1; i++) {
                System.out.println(c + " ");
            }
            System.out.println();
            bis.reset();  //回到刚刚mark的第100个点
            for (int i = 0; i <= 10 && (c =bis.read()) != -1; i++) {
                System.out.println(c + " ");
            }
            bis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    };
}
