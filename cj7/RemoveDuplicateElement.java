package cj7;

import java.util.*;

public class RemoveDuplicateElement {
    public static int removeDupEle(int[] arr, int n){
        int[] temp = new int[n];
        int j = 0;
        for (int i=0; i<n-1; i++){
            if (arr[i] != arr[i+1]){
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[n-1];
        // Changing original array
        for (int i=0; i<j; i++){
            arr[i] = temp[i];
        }
        return j;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of element you want to store in the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the element of array");
        for (int i = 0; i< n; i++){
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);

        n = removeDupEle(arr, n);
        for (int i=0; i< n; i++){
            System.out.println(arr[i]);
        }
    }
}
