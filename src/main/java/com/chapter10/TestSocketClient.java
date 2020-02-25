package com.chapter10;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * Author beck
 * Date 2020/2/25 22:41
 **/
public class TestSocketClient {
    public static void main(String[] args) {
        InputStream is = null;
        OutputStream os = null;
        try {
            Socket socket = new Socket("localhost", 5888);
            //客户端先写后读
            is = socket.getInputStream();
            os = socket.getOutputStream();
            DataInputStream dis = new DataInputStream(is);
            DataOutputStream dos = new DataOutputStream(os);
            dos.writeUTF("hey");
            String s = null;
            if ((s = dis.readUTF()) != null) {
                System.out.println(s);
                dos.close();
                dis.close();
                socket.close();
            }
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    };
}
