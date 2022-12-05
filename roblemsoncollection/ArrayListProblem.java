package roblemsoncollection;
import java.util.*;

import java.util.ArrayList;

public class ArrayListProblem {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Ramesh");
        arrayList.add("Suresh");
        arrayList.add("Rishikesh");
        arrayList.add("Rishikesh");
        arrayList.add("Ramesh");
        arrayList.add("Manshi");
        arrayList.add(2, "Hrushikesh");

        System.out.println(arrayList);

        // Itterate using list Itterator
        ListIterator itr = arrayList.listIterator();
        // Adding element to the ArrayList using ListItterator.
        itr.add("Rakesh");
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // Sort in decending Order
        Collections.sort(arrayList, Collections.reverseOrder());
        System.out.println(arrayList);



        Collections.sort(arrayList, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.compareToIgnoreCase(s2);
            }
        });

        System.out.println(arrayList);

        // Replacing the element from a specific index.
        arrayList.set(2, "Mark");

        System.out.println(arrayList);

        // Searching the index of a specific element in the arrayList
        System.out.println(arrayList.indexOf("Mark"));

        // Removing an element from a specific index.
        arrayList.remove(4);
        System.out.println(arrayList);

        // Removing duplicate element from the array list.

        ArrayList<String> nonDupList = new ArrayList<String>();
        Iterator<String> dupIter = arrayList.iterator();

        while (dupIter.hasNext()){
            String dupWord = dupIter.next();
            if (nonDupList.contains(dupWord)){
                dupIter.remove();
            }else {
                nonDupList.add(dupWord);
            }
        }
        System.out.println(nonDupList);
        System.out.println("This is not a duplicate list.");
    }
}