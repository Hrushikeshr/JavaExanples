package cj7;
import java.util.*;

public class ExampleOfArrayList {
    public static void main(String[] args)
    {
        ArrayList a = new ArrayList();
        a.add("Ashok");
        a.add(10);
        a.add("Ashok");
        a.add(null);
        System.out.println(a);//[Ashok, 10, Ashok, null]
        a.remove(2);
        System.out.println(a);//[Ashok, 10, null]
        a.add(2, "Vinod");
        a.add("Kimu");
        System.out.println(a);//[Ashok, 10, Vinod, null, Kimu]
    }
}
