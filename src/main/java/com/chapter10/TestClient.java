package com.chapter10;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ConnectException;
import java.net.Socket;

/**
 * Author beck
 * Date 2020/2/25 22:28
 **/
public class TestClient {
    public static void main(String[] args) {
        try {
            Socket s1 = new Socket("127.0.0.1", 8888);
            InputStream is = s1.getInputStream();  //这个InputStream是服务器写的
            DataInputStream dis = new DataInputStream(is);
            System.out.println(dis.readUTF());
            dis.close();
            is.close();
        } catch (ConnectException connExc) {
            connExc.printStackTrace();
            System.err.println("服务器连接失败! ");
        } catch (IOException e) {
            e.printStackTrace();
        }
    };
}
