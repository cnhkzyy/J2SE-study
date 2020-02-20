package com.chapter8;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

/**
 * Author beck
 * Date 2020/2/20 22:08
 **/
public class TestPrintStream1 {
    public static void main(String[] args) {
        PrintStream ps = null;

        try {
            FileOutputStream fos = new FileOutputStream("E:\\java_workshop\\J2SE-study\\src\\main\\java\\com\\chapter8\\log.dat");
            ps = new PrintStream(fos);
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (ps != null) {
            System.setOut(ps); //重新设置输出到文件
        }
        int ln = 0;
        for(char c = 0; c <= 60000; c++) {
            System.out.println(c + "");
            if (ln++ >= 100) {
                System.out.println();
                ln = 0;
            }
        }
    };
}
