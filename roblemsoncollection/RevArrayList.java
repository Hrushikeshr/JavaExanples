package roblemsoncollection;

import java.util.*;
class RevArrayList {

    public ArrayList<Integer> reverseArrayList(ArrayList<Integer> alist)
    {

        ArrayList<Integer> revArrayList = new ArrayList<Integer>();
        for (int i = alist.size() - 1; i >= 0; i--) {


            revArrayList.add(alist.get(i));
        }

        // Return the reversed arraylist
        return revArrayList;
    }

    // Iterate through all the elements and print
    public void printElements(ArrayList<Integer> alist)
    {
        for (int i = 0; i < alist.size(); i++) {
            System.out.print(alist.get(i) + " ");
        }
    }
}

//public class GFG {
//
//}

