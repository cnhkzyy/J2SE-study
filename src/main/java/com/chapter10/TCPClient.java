package com.chapter10;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * Author beck
 * Date 2020/2/25 21:45
 * server端监听的端口是6666，client端的端口随机选一个
 **/
public class TCPClient {
    public static void main(String[] args) throws Exception {
        Socket s = new Socket("127.0.0.1", 6666);
        OutputStream os = s.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);
        Thread.sleep(3000);
        dos.writeUTF("hello server!");  //以UTF8的方式写一句话，UTF8比较省空间
        dos.flush();
        dos.close();
        s.close();
    };
}
