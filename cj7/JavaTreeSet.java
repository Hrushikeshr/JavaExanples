package cj7;

import java.util.TreeSet;


public class JavaTreeSet
{
    public static void main(String args[])
    {
        // TreeSet of String Type
        TreeSet tset = new TreeSet();
        // Adding elements to TreeSet
        tset.add("Ashok");
        tset.add("Vinod");
        tset.add("Dillesh");
        tset.add("Thiru");
        tset.add("Mahesh");
        tset.add("Janaki");
        // Displaying TreeSet
        System.out.println(tset);
        // TreeSet of Integer Type
        TreeSet tset2 = new TreeSet();
        // Adding elements to TreeSet
        tset2.add(88);
        tset2.add(7);
        tset2.add(101);
        tset2.add(0);
        tset2.add(3);
        tset2.add(222);
        System.out.println(tset2);
    }
}
