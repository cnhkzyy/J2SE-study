package com.chapter10;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Author beck
 * Date 2020/2/25 22:35
 **/
public class TestSocketServer {
    public static void main(String[] args) {
        InputStream in = null;
        OutputStream out = null;
        try {
            ServerSocket ss = new ServerSocket(5888);
            Socket socket = ss.accept();
            //输入输出管道全都包装好
            //服务器先读后写
            in = socket.getInputStream();
            out = socket.getOutputStream();
            DataOutputStream dos = new DataOutputStream(out);
            DataInputStream dis = new DataInputStream(in);
            String s = null;
            if ((s = dis.readUTF()) != null) {
                System.out.println(s);
                System.out.println("from: " + socket.getInetAddress());
                System.out.println("Port: " + socket.getPort());
            }
            dos.writeUTF("hi, hello");
            dis.close();
            dos.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    };
}
