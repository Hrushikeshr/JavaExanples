package cj7;
 import java.util.*;
public class StackExample {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push("Ashok");
        stack.push("Vinod");
        stack.push("Naresh");
        System.out.println(stack);// [Ashok, Vinod, Naresh]
        System.out.println(stack.pop());// Naresh
        System.out.println(stack);// [Ashok, Vinod]
        System.out.println(stack.peek());// Vinod
        System.out.println(stack.search("Ashok"));// 2
        System.out.println(stack.search("Dillesh"));// -1
        System.out.println(stack.empty());// false

    }
}