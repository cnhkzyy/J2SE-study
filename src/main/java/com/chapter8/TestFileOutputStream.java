package com.chapter8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Author beck
 * Date 2020/2/19 23:22
 **/
public class TestFileOutputStream {
    public static void main(String[] args) {
        int b = 0;
        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream("E:\\java_workshop\\J2SE-study\\src\\test\\java\\cn\\how2j\\javaBase\\HelloWorld.java");
            out = new FileOutputStream("E:\\java_workshop\\J2SE-study\\src\\main\\java\\com\\chapter8\\HelloWorld.java");
            while((b = in.read()) != -1) {
                out.write(b);
            }
            in.close();
            out.close();
        } catch (FileNotFoundException e2) {
            System.out.println("找不到指定文件");
            System.exit(-1);
        } catch (IOException e) {
            System.out.println("文件复制错误");
            System.exit(-1);
        }
        System.out.println("文件已复制");
        }
    };

