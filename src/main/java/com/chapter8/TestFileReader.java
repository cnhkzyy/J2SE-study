package com.chapter8;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Author beck
 * Date 2020/2/19 23:32
 **/
public class TestFileReader {
    public static void main(String[] args) {
        FileReader fr = null;
        int c = 0;

        try {
            fr = new FileReader("E:\\java_workshop\\J2SE-study\\src\\main\\java\\com\\chapter8\\TestFileReader.java");
            int ln = 0;
            while ((c = fr.read()) != -1) {
                System.out.println((char) c);
            }
            fr.close();
        } catch (FileNotFoundException e) {
            System.out.println("找不到指定文件");
        } catch (IOException e) {
            System.out.println("文件读取错误");
        }
    };
}
