package cn.how2j.javaBase;

/**
 * Author beck
 * Date 2020/2/18 23:15
 * 分别为如下值，找到合适的类型来定义
 * 3.14
 * 2.769343
 * 365
 * 12
 * '吃'
 * false
 * "不可描述"
 **/
public class Variable {
    double a = 3.14;
    double b = 2.769343;
    int c = 365;
    int d = 12;
    char e = '吃';
    boolean f = false;
    String g = "不可描述";
}

class Variable2 {
    byte b = 1;
    short s = 10;
    int i = 100;
    long l = 100000;
    float f = 3.14f;
    double d = 3.14;
    char c = 'a';
    String str = "yes";
}


class Variable3 {
    short a = 1;
    short b = 2;
    int c = a + b;  //两个short相加是int，类型提升

}
