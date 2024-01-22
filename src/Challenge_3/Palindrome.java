package Challenge_3;

public class Palindrome {

    public static boolean isPalindrome (String input) {

        String cleanInput = input.replaceAll("\\s", "").toLowerCase();

        String reversedInput = new StringBuilder(cleanInput).reverse().toString();
        return cleanInput.equals(reversedInput);

    }
}
