package cj7;

import java.util.LinkedList;

public class Ll {
//    private MyNode head;
//
//    class MyNode{
//        String data;
//        MyNode next;
//        MyNode(String data){
//            this.data = data;
//            this.next = null;
//        }
//    }
//
//    public void addFirst(String data){
//        MyNode newNode = new MyNode(data);
//        if (head == null){
//            head = newNode;
//            return;
//        }
//
//        newNode.next = head;
//        head = newNode;
//    }
//
//    public void addLast(String data){
//        MyNode newNode = new MyNode(data);
//        if (head == null){
//            head = newNode;
//            return;
//        }
//
//        MyNode currNode = head;
//        while (currNode.next != null){
//            currNode = currNode.next;
//
//        }
//    }
//
//    public static void main(String[] args) {
//        Ll obj = new Ll();
//        obj.addFirst("This");
//        obj.addFirst("is");
//
//
//    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add("Ashok");
        list.add(30);
        list.add(null);
        list.add("Ashok");
        System.out.println(list);// [Ashok, 10, null, Ashok]
        list.set(0, "Software");
        System.out.println(list);// [Software, 10, null, Ashok]
        list.set(0, "Vinod");
        System.out.println(list);// [Vinod, 10, null, Ashok]
        list.removeLast();
        System.out.println(list);// [Vinod, 10, null]
        list.addFirst("Dillesh");
        System.out.println(list);// [Dillesh, Vinod, 30, null]
    }
}
