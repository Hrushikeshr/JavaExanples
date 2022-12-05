package cj7;

import java.util.*;

public class VectorClassExample {
    public static void main(String[] args) {
        Vector v = new Vector<>();

        for (int i = 0; i<=10; i++){
            v.addElement(i);
        }
        System.out.println(v.capacity());
        System.out.println(v);

    }
}
