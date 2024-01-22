package Challenge_5;

import Challenge_1.NumberChecker;
import Challenge_2.Calculator;
import Challenge_3.Palindrome;
import Challenge_4.CountWords;
import Challenge_6.Converter;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> megaNumbersCreated = MegaNumbersGenerator.generateMegaNumbers();
        MegaNumbersGenerator.showMegaNumbers(megaNumbersCreated);

        scanner.close();
    }
}





