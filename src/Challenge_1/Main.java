package Challenge_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int userInput = scanner.nextInt();

        // Call the checkNumber method from the Challenge_1.NumberChecker class
        NumberChecker.checkNumber(userInput);

        scanner.close();
    }
}





