package cj7;

import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[100];
        System.out.println("Enter 10 numbers");
        for (int i = 0; i <= 10; i++){
            arr[i]= scanner.nextInt();
        }for (int i = 0; i <= 10; i++){
            System.out.println(arr[i]);
        }
    }
}
