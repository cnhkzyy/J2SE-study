package com.chapter8;

import java.io.*;

/**
 * Author beck
 * Date 2020/2/20 22:40
 **/
public class TestObjectIO {
    public static void main(String[] args) throws Exception {
        T t = new T();
        t.k = 8;
        FileOutputStream fos = new FileOutputStream("E:\\java_workshop\\J2SE-study\\src\\main\\java\\com\\chapter8\\testobjectio.dat");
        ObjectOutputStream oos = new ObjectOutputStream(fos); //ObjectOutputStream，专门用来写Object的
        oos.writeObject(t);
        oos.flush();
        oos.close();

        FileInputStream fis = new FileInputStream("E:\\java_workshop\\J2SE-study\\src\\main\\java\\com\\chapter8\\testobjectio.dat");
        ObjectInputStream ois = new ObjectInputStream(fis);
        T tReaded = (T) ois.readObject();
        System.out.println(tReaded.i + " " + tReaded.j + " " + tReaded.d + " " + tReaded.k);
    }
}

class T implements Serializable {  //Serializable，标记化接口，没有方法，类可实现可序列化
    int i = 10;
    int j = 9;
    double d = 2.3;
    transient int k = 15; //transient k， 相当于k是透明的，在序列化时不予考虑，输出的是0
};
