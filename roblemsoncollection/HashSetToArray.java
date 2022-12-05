package roblemsoncollection;


import java.io.*;
import java.util.*;

public class HashSetToArray {

    // Java program to convert HashSet to array



        public static void main(String[] args)
        {
            HashSet<String> set = new HashSet<String>();
            set.add("1");
            set.add("13");
            set.add("27");
            set.add("87");
            set.add("19");

            System.out.println("Hash Set Contains :" + set);
            String arr[] = new String[set.size()];


            int i=0;

            // iterating over the hashset
            for(String suman:set){
                arr[i++] = suman;
            }

            for (String n : arr)
                System.out.println(n);
        }
}


