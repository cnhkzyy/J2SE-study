package com.chapter10;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;

/**
 * Author beck
 * Date 2020/2/26 23:31
 **/
public class TestUDPClient {
    public static void main(String[] args) throws Exception{
        //写一个long类型数据给服务器
        long n = 10000L;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();   //内存中有一个字节数组
        DataOutputStream dos = new DataOutputStream(baos);
        dos.writeLong(n);
        byte[] buf = baos.toByteArray();
        //byte[] buf = (new Long(10000000).toString()).getBytes();
        //byte[] buf = (new String("Hello")).getBytes();
        DatagramPacket dp = new DatagramPacket(buf, buf.length, new InetSocketAddress("127.0.0.1", 5678));   //UDP本身没有连接，但是UDP得告诉路由将这个东西发到哪里去
        DatagramSocket ds = new DatagramSocket(9999);   //client本身占了9999端口
        ds.send(dp);
        ds.close();
    }
};
