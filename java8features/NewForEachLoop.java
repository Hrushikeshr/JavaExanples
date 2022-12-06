package java8features;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class NewForEachLoop {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(5);
        list.add(4);
        list.add(2);
        list.add(6);
        list.add(8);

        list.forEach(integer -> System.out.println(integer));
    }
}
