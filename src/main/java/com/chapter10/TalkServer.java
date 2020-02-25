package com.chapter10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Author beck
 * Date 2020/2/25 22:52
 **/
public class TalkServer {
    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(4700);
            Socket socket = server.accept();
            //读
            BufferedReader is = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            //写
            PrintWriter os = new PrintWriter(socket.getOutputStream());
            //从窗口读取
            BufferedReader sin = new BufferedReader(new InputStreamReader(System.in));
            String line = sin.readLine();

            while (!line.equals("bye")) {
                os.println(line);
                os.flush();
                System.out.println("Server: " + line);
                System.out.println("Client: " + is.readLine());
                //从键盘再读一行
                line = sin.readLine();
            }
            is.close();
            os.close();
            socket.close();
            server.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    };
}
