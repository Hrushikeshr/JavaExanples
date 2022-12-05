package cj7;

import java.util.LinkedHashSet;


public class MyLinkedHashSet
{
    public static void main(String args[]) {
// HashSet declaration
        LinkedHashSet<String> hset = new LinkedHashSet<String>();
// Adding elements to the HashSet
        hset.add("Ashok");
        hset.add("Vinod");
        hset.add("Dillesh");
        hset.add("Thiru");
        hset.add("Naresh");
        System.out.println(hset);
// Addition of duplicate elements
        System.out.println(hset.add("Ashok"));
        System.out.println(hset);
// Addition of null values
        hset.add(null);
        System.out.println(hset.add(null));
// Displaying HashSet elements
        System.out.println(hset);
    }

}
