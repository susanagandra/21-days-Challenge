package Challenge_7;

import java.util.Scanner;

import static Challenge_7.Timer.timer;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Choose 'P' for progressive counting or 'R' for countdown: ");
        char choice = scanner.next().toUpperCase().charAt(0);

        if (choice == 'P') {
            System.out.print("Enter the total seconds for progressive counting: ");
            int totalSeconds = scanner.nextInt();
            timer(totalSeconds, false);
        } else if (choice == 'R') {
            System.out.print("Enter the total seconds for countdown: ");
            int totalSeconds = scanner.nextInt();
            timer(totalSeconds, true);
        } else {
            System.out.println("Invalid choice. Please select 'P' or 'R'.");
        }

        scanner.close();

    }
}
