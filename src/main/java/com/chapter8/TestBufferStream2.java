package com.chapter8;

import java.io.*;

/**
 * Author beck
 * Date 2020/2/19 23:58
 **/
public class TestBufferStream2 {
    public static void main(String[] args) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("E:\\java_workshop\\J2SE-study\\src\\main\\java\\com\\chapter8\\dat2.txt"));
            BufferedReader br = new BufferedReader(new FileReader("E:\\java_workshop\\J2SE-study\\src\\main\\java\\com\\chapter8\\HelloWorld.java"));
            String s = null;
            for (int i = 1; i <= 100; i++) {
                s = String.valueOf(Math.random());
                bw.write(s);
                bw.newLine();  //每往外写一个字符串，换一个新行
            }
            bw.flush();
            while ((s = br.readLine()) != null) {  //readLine() 读一行
                System.out.println(s);
            }
            bw.close();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


