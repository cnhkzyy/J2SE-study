package com.chapter8;

import java.io.*;
import java.util.Map;

/**
 * Author beck
 * Date 2020/2/20 21:50
 **/
public class TestDataStream {
    public static void main(String[] args) {
        ByteArrayOutputStream baos = new ByteArrayOutputStream(); //ByteArray，字节数组
        DataOutputStream dos = new DataOutputStream(baos);

        try {
            dos.writeDouble(Math.random()); //double占8个字节
            dos.writeBoolean(true);   //boolean占1个字节
            ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());  //总共9个字节
            System.out.println(bais.available());  //bais中有多少个字节可供我们读
            DataInputStream dis = new DataInputStream(bais);
            System.out.println(dis.readDouble()); //先写的先读，是队列，不然读取的boolean会是double 8个字节中的1个
            System.out.println(dis.readBoolean());
            dos.close();
            dis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    };
}
