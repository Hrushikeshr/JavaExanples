package cj7;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class MyHashMap
{
    public static void main(String[] args)
    {
        HashMap hMap = new HashMap();
        hMap.put("Ashok", 500);
        hMap.put("Vinod", 800);
        hMap.put("Dillesh", 700);
        hMap.put("Naresh", 500);
        System.out.println(hMap);
        System.out.println(hMap.put("Ashok", 1000));
        Set s = hMap.keySet();
        System.out.println(s);
        Collection c = hMap.values();
        System.out.println(c);
        Set s1 = hMap.entrySet();
        System.out.println(s1);
        Iterator itr = s1.iterator();
        while (itr.hasNext())
        {
            Map.Entry m1 = (Map.Entry) itr.next();
            System.out.println(m1.getKey() + "......" + m1.getValue());
            if (m1.getKey().equals("Ashok"))
            {
                m1.setValue(1500);
            }
        }
        System.out.println(hMap);
    }
}
