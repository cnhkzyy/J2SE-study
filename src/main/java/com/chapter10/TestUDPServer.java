package com.chapter10;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * Author beck
 * Date 2020/2/26 23:23
 * 说明：对于UDP来说，不存在客户端，服务端一说
 **/
public class TestUDPServer {
    public static void main(String[] args) throws Exception{
        byte buf[] = new byte[1024];
        DatagramPacket dp = new DatagramPacket(buf, buf.length);  //这个包裹是接收udp发来的东西，这个东西存在buf中
        DatagramSocket ds = new DatagramSocket(5678);  //数据包，这是udp的5678端口，和tcp的5678端口不同
        while (true) {
            ds.receive(dp);
            System.out.println(Long.parseLong(new String(buf, 0, dp.getLength())));  //dp.getLength()是包袱里收了多少个字节。这里调用了String的构造方法
        }
    };
}
