package com.chapter10;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Author beck
 * Date 2020/2/25 22:23
 **/
public class TestServer {
    public static void main(String[] args) {
        try {
            ServerSocket s = new ServerSocket(8888);
            while (true) {
                Socket s1 = s.accept();
                OutputStream os = s1.getOutputStream();  //server往客户端写
                DataOutputStream dos = new DataOutputStream(os);
                dos.writeUTF("Hello, " + s1.getInetAddress() + "port#" + s1.getPort() +" bye-bye!");  //拿的是客户端的地址，拿到是客户端的端口号，是客户端随便写的，不是8888
                dos.close();
                s1.close();
            }
            } catch (IOException e) {
            e.printStackTrace();
            System.out.println("程序运行出错: " + e);
        }
    };
}
