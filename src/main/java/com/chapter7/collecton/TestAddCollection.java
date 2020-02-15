package com.chapter7.collecton;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Author beck
 * Date 2020/2/15 16:25
 **/
public class TestAddCollection {

    public static void main(String[] args) {
        Collection c = new ArrayList();
        //可以放入不同类型的对象
        c.add("hello");
        c.add(new Name("f1", "l1"));
        c.add(new Integer(100));
        System.out.println(c.size());
        System.out.println(c);    //相当于调用了c.toString()
    }
}


class Name {
    private String firstName, lastName;

    public Name(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String toString() {
        return firstName + " " +lastName;
    }
}
