package com.chapter10;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * Author beck
 * Date 2020/2/25 23:39
 **/
public class MyTalkClient {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("127.0.0.1", 4900);
            //读取键盘输入
            BufferedReader ins = new BufferedReader(new InputStreamReader(System.in));
            //输出到服务端
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
            //读取服务端内容
            DataInputStream dis = new DataInputStream(socket.getInputStream());
            String readLine = ins.readLine();

            while (!readLine.equals(null)) {
                //将键盘输入作为服务端输出内容
                dos.writeUTF(readLine);
                //打印服务端内容
                System.out.println("Server: " + dis.readUTF());
            }
            ins.close();
            dos.close();
            socket.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    };
}
