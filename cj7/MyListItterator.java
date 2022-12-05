package cj7;

import java.util.LinkedList;
import java.util.ListIterator;


public class MyListItterator
{
    public static void main(String[] args)
    {
        LinkedList list = new LinkedList();
        list.add("Ashok");
        list.add("Vinod");
        list.add("Dillesh");
        list.add("Thiru");
        System.out.println(list);
        ListIterator itr = list.listIterator();
        while (itr.hasNext())
        {
            String s = (String) itr.next();
            if (s.equals("Vinod"))
            {
                itr.remove();
            }
        }
        System.out.println(list);
    }
}