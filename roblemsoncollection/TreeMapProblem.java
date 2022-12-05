package roblemsoncollection;


import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapProblem {
    public static void main(String args[]){
        //Create TreeMap object.
        TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();

        //Add objects to the TreeMap.
        treeMap.put(4, "Roxy");
        treeMap.put(2, "Sunil");
        treeMap.put(5, "Sandy");
        treeMap.put(1, "Munish");
        treeMap.put(3, "Pardeep");

        //Print the TreeMap object.
        System.out.println("TreeMap elements:");
        System.out.println(treeMap);

        //Get iterator
        Set set=treeMap.entrySet();
        Iterator iterator=set.iterator();

        //Print the TreeMap elements using iterator.
        System.out.println("TreeMap elements using iterator:");
        while(iterator.hasNext()){
            Map.Entry mapEntry=(Map.Entry)iterator.next();
            System.out.println("Key: " + mapEntry.getKey() + ", " +
                    "Value: " + mapEntry.getValue());
        }
    }
}

