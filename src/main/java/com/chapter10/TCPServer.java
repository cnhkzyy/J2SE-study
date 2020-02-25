package com.chapter10;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Author beck
 * Date 2020/2/25 21:45
 **/
public class TCPServer {
    public static void main(String[] args) throws Exception{
        ServerSocket ss = new ServerSocket(6666);

        while (true) {
            Socket s = ss.accept();   //server端接收连接，accept返回Socket类型
            DataInputStream dis = new DataInputStream(s.getInputStream());
            System.out.println(dis.readUTF());
            dis.close();
            s.close();
            //System.out.println("A client connect!");
        }
    };
}
