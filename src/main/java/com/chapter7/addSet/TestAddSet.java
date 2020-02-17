package com.chapter7.addSet;

import java.util.HashSet;
import java.util.Set;

/**
 * Author beck
 * Date 2020/2/17 21:19
 **/
public class TestAddSet {
    public static void main(String[] args) {
        Set s = new HashSet();
        s.add("hello");
        s.add("world");
        s.add(new Name("f1", "f2"));
        s.add(new Integer(100));
        s.add(new Name("f1", "f2"));    //相同元素不会被加入，已经重写了equals方法
        s.add("hello");    //相同元素不会被加入
        System.out.println(s);
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


    //重写equals方法
    public boolean equals(Object obj) {
        if (obj instanceof Name) {
            Name name = (Name) obj;
            return (firstName.equals(name.firstName)) && (lastName.equals(name.lastName));
        }
        return super.equals(obj);
    }

    public int hashCode() {
        return firstName.hashCode();
    }
}
