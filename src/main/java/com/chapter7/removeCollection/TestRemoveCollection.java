package com.chapter7.removeCollection;

import java.util.Collection;
import java.util.HashSet;

/**
 * Author beck
 * Date 2020/2/15 16:53
 **/
public class TestRemoveCollection {
    public static void main(String[] args) {
        Collection c = new HashSet();
        c.add("hello");
        c.add(new Name("f1", "l1"));
        c.add(new Integer(100));
        c.remove("hello");
        c.remove(new Integer(100));
        System.out.println(c.remove(new Name("f1", "l1")));  //没有被去掉，没有重写equals方法，指向的不是同一对象
        System.out.println(c);
    };
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

