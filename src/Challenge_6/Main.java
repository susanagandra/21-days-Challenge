package Challenge_6;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolhe a conversão:" +
                "\n1. Quilômetros para Milhas;" +
                "\n2. Milhas para Quilômetros;" +
                "\n3. Metros para Pés;" +
                "\n4. Pés para Metros" +
                "\n5. Celsius para Fahrenheit" +
                "\n6. Fahrenheit para Celsius");

        int convert = scanner.nextInt();

        System.out.print("Value to convert: ");
        int numToConvert = scanner.nextInt();

        try {
            int resultConvertion = Converter.operation(convert, numToConvert);
            System.out.println("Result: " + resultConvertion);
        } catch (IllegalArgumentException | ArithmeticException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        scanner.close();
    }
}





