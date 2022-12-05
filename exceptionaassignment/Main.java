package exceptionaassignment;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your emp id sir: ");
        int empId = scanner.nextInt();
        Projo projo = new Projo();
        String massage = projo.checkEmployeeDetails(empId);
        System.out.println(massage);
    }
}
