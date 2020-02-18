package cn.how2j.javaBase;

/**
 * Author beck
 * Date 2020/2/18 23:24
 * 属性的作用域在方法中，参数的作用域也在方法中，如果属性和参数命名相同了的话？ 那么到底取哪个值？
 **/
public class HelloWorld2 {
    int i = 1;
    public void method1(int i) {
        System.out.println(i);
    }

    public static void main(String[] args) {
        new HelloWorld2().method1(5);  //传入的是5.打印的是5
    };
}
