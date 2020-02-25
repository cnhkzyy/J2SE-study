package com.chapter10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * Author beck
 * Date 2020/2/25 23:09
 **/
public class TalkClient {
    public static void main(String[] args) {

        try {
            Socket socket = new Socket("127.0.0.1", 4700);
            //从窗口读
            BufferedReader sin = new BufferedReader(new InputStreamReader(System.in));
            //写
            PrintWriter os = new PrintWriter(socket.getOutputStream());
            //读
            BufferedReader is = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String line = sin.readLine();

            while (!line.equals("bye")) {
                os.println(line);
                os.flush();
                System.out.println("Client: " + line);
                System.out.println("Server: " + is.readLine());
                //从键盘再读一行
                line = sin.readLine();
            }
            os.close();
            is.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
};

