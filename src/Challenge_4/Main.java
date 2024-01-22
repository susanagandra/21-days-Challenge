package Challenge_4;

import Challenge_1.NumberChecker;
import Challenge_2.Calculator;
import Challenge_3.Palindrome;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word or phrase: ");
        String inputText = scanner.nextLine();

        int result = CountWords.countingWords(inputText);
        System.out.println(result);

        scanner.close();
    }
}





