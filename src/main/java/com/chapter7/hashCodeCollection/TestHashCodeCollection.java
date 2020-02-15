package com.chapter7.hashCodeCollection;

import java.util.Collection;
import java.util.HashSet;

/**
 * Author beck
 * Date 2020/2/15 17:34
 * 内容一样，hashCode必须一样
 **/
public class TestHashCodeCollection {
    public static void main(String[] args) {
        Collection c = new HashSet();
        c.add("hello");
        c.add(new Name("f1", "l1"));
        c.add(new Integer(100));
        c.remove("hello");
        c.remove(new Integer(100));
        System.out.println(c.remove(new Name("f1", "l1")));  //重写了equals方法，这时候可以去除了
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
        return firstName + " " + lastName;
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
