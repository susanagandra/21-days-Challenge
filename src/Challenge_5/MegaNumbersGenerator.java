package Challenge_5;

import java.util.ArrayList;
import java.util.Random;

public class MegaNumbersGenerator {

    public static ArrayList<Integer> generateMegaNumbers() {

        ArrayList<Integer> randomNumbers = new ArrayList<>();

        Random random = new Random();

        while (randomNumbers.size() < 6) {
            int num = random.nextInt(60) + 1;

            // Verifica se o número já foi gerado

            if (!randomNumbers.contains(num)) {
                randomNumbers.add(num);
            }
        }
        return randomNumbers;
    }

    public static void showMegaNumbers(ArrayList<Integer> numbers) {
        System.out.println("Os seus números:");
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}
