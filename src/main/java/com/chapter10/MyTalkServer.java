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
            //定义读取客户端的内容
            String clientLine = null;
            //读取键盘输入
            BufferedReader sin = new BufferedReader(new InputStreamReader(System.in));
            //定义从键盘输入的内容
            String keyBoardLine = null;
            //输出到客户端
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());


            while ((clientLine = dis.readUTF()) != "bye") {
                //打印客户端内容
                System.out.println("客户端: " + clientLine);
                //读取从键盘的输入
                keyBoardLine = sin.readLine();
                //将键盘输入作为客户端输出
                dos.writeUTF(keyBoardLine);
                //keyBoardLine = sin.readLine();
            }


            dis.close();
            //sin.close();
            socket.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
};