package com.chapter8;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

/**
 * Author beck
 * Date 2020/2/20 21:21
 * 字符转换流
 **/
public class TestTransForm1 {
    public static void main(String[] args) {
        try {
            OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("E:\\java_workshop\\J2SE-study\\src\\main\\java\\com\\chapter8\\char.txt"));
            osw.write("shakkshakjsjla");
            System.out.println(osw.getEncoding());  //拿到字符编码
            osw.close();
            osw = new OutputStreamWriter(new FileOutputStream("E:\\java_workshop\\J2SE-study\\src\\main\\java\\com\\chapter8\\char.txt", true), "ISO8859_1");  //true，从原来的内容上追加
            osw.write("shakkshakjsjla");
            System.out.println(osw.getEncoding());
            osw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    };
}
