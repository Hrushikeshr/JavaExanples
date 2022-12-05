package cj7;

import java.util.*;


public class TreeSetDemo
{
    public static void main(String arg[])
    {
        TreeSet tset = new TreeSet();
        tset.add(new StringBuffer("A"));
        tset.add(new StringBuffer("B"));
        tset.add(new StringBuffer("T"));
        tset.add(new StringBuffer("Z"));
        System.out.println(tset);
    }
}
