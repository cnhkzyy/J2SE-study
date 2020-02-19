package com.chapter8;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Author beck
 * Date 2020/2/19 23:35
 **/
public class TestFileWriter {
    public static void main(String[] args) {
        FileWriter fw = null;

        try {
            fw = new FileWriter("E:\\java_workshop\\J2SE-study\\src\\main\\java\\com\\chapter8\\unicode.dat");
            for(int c = 0; c <= 50000; c++) {
                fw.write(c);
            }
            fw.close();
        } catch (IOException e1) {
            e1.printStackTrace();
            System.out.println("文件写入错误");
            System.exit(-1);
        }
    };
}
