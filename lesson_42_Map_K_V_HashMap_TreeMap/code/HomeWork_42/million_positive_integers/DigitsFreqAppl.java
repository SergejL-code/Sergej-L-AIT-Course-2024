package HomeWork_42.million_positive_integers;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.stream.IntStream;
public class DigitsFreqAppl {
    public static void main(String[] args) {


        Random random = new Random();
        IntStream numbers = random.ints(1_000_000, 100, 1001);

        // Создаем Map ,в которой будет храниться частота каждой цифры.
        Map<Integer, Integer> digitFrequency = new HashMap<>();

        // Process each number in the stream
        numbers.forEach(number -> {
            // Convert each number to a string, then process each character as a digit
            String numberStr = String.valueOf(number);
            for (char digitChar : numberStr.toCharArray()) {
                // Convert character to integer
                int digit = Character.getNumericValue(digitChar);
                // Update the frequency map
                digitFrequency.put(digit, digitFrequency.getOrDefault(digit, 0) + 1);
            }
        });

        // Print out the frequencies of each digit
        for (Map.Entry<Integer, Integer> entry : digitFrequency.entrySet()) {
            System.out.println("Digit: " + entry.getKey() + ", Frequency: " + entry.getValue());
        }
    }
}