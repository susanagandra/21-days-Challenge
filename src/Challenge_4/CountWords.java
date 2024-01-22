package Challenge_4;

public class CountWords {

    public static int countingWords (String textInput) {

        String[] words = textInput.split("\\s+");

        int numWords = words.length;

        return numWords;
    }
}
