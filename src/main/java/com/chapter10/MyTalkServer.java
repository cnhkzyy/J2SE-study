package com.chapter10;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Author beck
 * Date 2020/2/25 23:23
 **/
public class MyTalkServer {
    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(4900);
            Socket socket = server.accept();
            //读取客户端的输入
            DataInputStream dis = new DataInputStream(socket.getInputStream());
            //读取键盘输入
            BufferedReader sin = new BufferedReader(new InputStreamReader(System.in));
            //System.out.println(sin.readLine());
            String readLine = sin.readLine();
            //输出到客户端
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());

            //打印客户端内容
            System.out.println("Client: " + dis.readUTF());

//            while (!readLine.equals(null)) {
//
//                //将键盘输入作为客户端输出
//                dos.writeUTF(sin.readLine());
//            }
            dis.close();
            sin.close();
            socket.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
};