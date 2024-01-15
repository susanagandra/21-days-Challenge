public class Calculator {

    public static int addNumbers (int num1, int num2) {
        return num1 + num2;
    }

    public static int subNumbers (int num1, int num2) {
        return num1 - num2;
    }

    public static int divNumbers (int num1, int num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            throw new ArithmeticException("Cannot divide by zero");
        }
    }

    public static int multiNumbers (int num1, int num2) {
        return num1 * num2;
    }

    public static int operation (int num1, int num2, String symbol) {

        switch (symbol) {
            case "+":
                return addNumbers(num1, num2);

            case "-":
                return subNumbers(num1, num2);

            case "/":
                return divNumbers(num1, num2);

            case "*":
                return multiNumbers(num1, num2);

            default:
                throw new IllegalArgumentException("Invalid operation symbol");
        }
    }

    }
