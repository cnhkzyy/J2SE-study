package com.chapter7.removeIterator;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/**
 * Author beck
 * Date 2020/2/16 11:32
 **/
public class TestRemoveIterator {
    public static void main(String[] args) {
        //Iterator对象的remove方法是在迭代过程中删除元素的唯一的安全方法
        Collection c = new HashSet();
        c.add(new Name("fff1", "1111"));
        c.add(new Name("f2", "l2"));
        c.add(new Name("fff3", "lll3"));

        for (Iterator i = c.iterator(); i.hasNext(); ) {
            Name name = (Name) i.next();
            if (name.getFirstName().length() < 3) {
                i.remove();
                //如果换成c.remove(name);   会产生例外
            }
        }
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
