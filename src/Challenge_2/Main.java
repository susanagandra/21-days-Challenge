package Challenge_2;

import Challenge_1.NumberChecker;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number 1: ");
        int userNum1 = scanner.nextInt();

        System.out.print("Enter a number 2: ");
        int userNum2= scanner.nextInt();

        System.out.print("Enter the operation: ");
        String userOperation = scanner.nextLine();

        try {
            int result = Calculator.operation(userNum1, userNum2, userOperation);
            System.out.println("Result: " + result);
        } catch (IllegalArgumentException | ArithmeticException ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        scanner.close();
    }
}





