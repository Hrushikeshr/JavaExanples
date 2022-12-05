package cj7;

import java.util.*;


class MyEnumaretion
{
    public static void main(String arg[]) {
        Vector vector = new Vector();
        for (int i = 0; i <= 10; i++) {
            vector.addElement(i);
        }
        System.out.println(vector);
        Enumeration e = vector.elements();
        while (e.hasMoreElements()) {
            Integer i = (Integer) e.nextElement();
            if ((i % 2) == 0)
                System.out.println(i);
        }
        System.out.println(vector);
    }
}

