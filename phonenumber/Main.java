package phonenumber;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        NumberSaver obj = new NumberSaver();

        System.out.print("How many contact you have to save for a same person: 1 or 2? : ");
        int numberOfContact = sc.nextInt();

        System.out.print("Enter Name of the Person: ");
        String name = sc.next();

        System.out.print("Enter 1st Number pf the Person: ");
        int num1 = sc.nextInt();


        switch (numberOfContact) {
            case 1 -> obj.contactSaver(name, num1);
            case 2 -> {
                System.out.print("Enter 2nd Number of the same person: ");
                int num2 = sc.nextInt();
                obj.contactSaver(name, num1, num2);
            }
        }

    }
}