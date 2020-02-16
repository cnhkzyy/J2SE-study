package com.chapter7.nextIterator;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/**
 * Author beck
 * Date 2020/2/16 11:27
 **/
public class TestNextIterator {
    public static void main(String[] args) {
        Collection c = new HashSet();
        c.add(new Name("f1", "l1"));
        c.add(new Name("f2", "l2"));
        c.add(new Name("f3", "l3"));
        Iterator i = c.iterator();
        while(i.hasNext()) {
            //next()的返回值为Object类型，需要转换为相应类型
            Name n = (Name) i.next();
            System.out.println(n.getFirstName() + " ");
        }
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

