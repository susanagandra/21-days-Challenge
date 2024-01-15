import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int userInput = scanner.nextInt();

        // Call the checkNumber method from the NumberChecker class
        NumberChecker.checkNumber(userInput);



        System.out.print("Enter a number 1: ");
        int userNum1 = scanner.nextInt();

        System.out.print("Enter a number 2: ");
        int userNum2= scanner.nextInt();

        System.out.print("Enter the operation: ");
        String userOperation = scanner.next();

        try {
            int result = Calculator.operation(userNum1, userNum2, userOperation);
            System.out.println("Result: " + result);
        } catch (IllegalArgumentException | ArithmeticException ex) {
            System.out.println("Error: " + ex.getMessage());
        }


        scanner.close();



    }
}





