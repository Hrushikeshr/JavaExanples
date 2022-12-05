package javageneric;

import java.util.*;

public class ExampleOfGenerics {

    public static void main(String arg[]) {
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("A");
        list1.add("B");
        list1.add("C");
        list1.add("D");
        m1(list1);
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list2.add(10);
        list2.add(20);
        list2.add(30);
        list2.add(40);
        m1(list2);
    }
    public static void m1(ArrayList<?> list) {
// list.add("D"); C.E: Because we can't expect what type of value will come
        list.remove(1);
        list.add(null);
        System.out.println(list);
    }
}
