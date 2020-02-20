package com.chapter8;

import java.io.*;
import java.util.Date;

/**
 * Author beck
 * Date 2020/2/20 22:24
 **/
public class TestPrintStream3 {
    public static void main(String[] args) {
        String s = null;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            FileWriter fw = new FileWriter("E:\\java_workshop\\J2SE-study\\src\\main\\java\\com\\chapter8\\logfile.log", true);  //true, 追加
            PrintWriter log = new PrintWriter(fw);
            while ((s = br.readLine()) != null) {
                if (s.equalsIgnoreCase("exit")) break;
                System.out.println(s.toUpperCase());
                log.println("-----");
                log.println(s.toUpperCase());
                log.flush();
            }
            log.println("= = = " + new Date() + "= = =");
            log.flush();
            log.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
};

