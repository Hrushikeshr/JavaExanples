package roblemsoncollection;

import java.util.*;
import java.io.*;

public class MainRevArray {
    public static void main(String[] args)
    {
        RevArrayList obj = new RevArrayList();

        // Declaring arraylist without any initial size
        ArrayList<Integer> arrayli = new ArrayList<Integer>();


        // Appending elements at the end of the list
        arrayli.add(1);
        arrayli.add(2);
        arrayli.add(3);
        arrayli.add(4);
        System.out.print("Elements before reversing:");
        obj.printElements(arrayli);
        arrayli = obj.reverseArrayList(arrayli);
        System.out.print("\n Elements after reversing: ");
        obj.printElements(arrayli);
    }   }
