package exceptionaassignment;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.RandomAccess;

public class NewArraylist {

    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        LinkedList linkedList = new LinkedList();
        System.out.println(arrayList instanceof Serializable); // true
        System.out.println(linkedList instanceof Cloneable); // true
        System.out.println(arrayList instanceof RandomAccess); // true
        System.out.println(linkedList instanceof RandomAccess); // false
    }
}
