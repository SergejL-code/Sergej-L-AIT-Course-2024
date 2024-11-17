package HomeWork_22.arrays_random_100;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ArraysPlusMinusEvenNumbersTest {

    ArraysPlusMinusEvenNumbers arraysPlusMinusEvenNumbers;

    int[] musterArray;

    @BeforeEach
    void setUp() {
        musterArray = ArraysPlusMinusEvenNumbers.fillArray();
        arraysPlusMinusEvenNumbers = new ArraysPlusMinusEvenNumbers(musterArray);
        System.out.println(" positive Numbers: " + arraysPlusMinusEvenNumbers.countPositiveNumbers(musterArray) + ", negative numbers: " + arraysPlusMinusEvenNumbers.countNegativeNumbers(musterArray) + ", even numbers: " + arraysPlusMinusEvenNumbers.countEvenNumbers(musterArray) + ", zero numbers: " + arraysPlusMinusEvenNumbers.countZeroNumbers(musterArray));
    }

    @Test
    void countPositiveNumbers() {
        int expectedPositiveCount = 0;
        for (int number : musterArray) {
            if (number > 0) {
                expectedPositiveCount++;
            }
        }
        assertEquals(expectedPositiveCount, arraysPlusMinusEvenNumbers.countPositiveNumbers(musterArray));
        System.out.println(" positive Numbers: " + arraysPlusMinusEvenNumbers.countPositiveNumbers(musterArray));

    }


    @Test
    void countNegativeNumbers() {

        int expectedNegativeCount = 0;
        for (int number : musterArray) {
            if (number < 0) {
                expectedNegativeCount++;
            }
        }
        assertEquals(expectedNegativeCount, arraysPlusMinusEvenNumbers.countNegativeNumbers(musterArray));
        System.out.println(" negative numbers: " + arraysPlusMinusEvenNumbers.countNegativeNumbers(musterArray));
    }


    @Test
    void countEvenNumbers() {
        int expectedEvenCount = 0;
        for (int number : musterArray) {
            if (number % 2 == 0) {
                expectedEvenCount++;
            }
        }
        assertEquals(expectedEvenCount, arraysPlusMinusEvenNumbers.countEvenNumbers(musterArray));
        System.out.println(" even numbers: " + arraysPlusMinusEvenNumbers.countEvenNumbers(musterArray));
    }


    @Test
    void countZeroNumbers() {
        int expectedZeroCount = 0;
        for (int number : musterArray) {
            if (number == 0) {
                expectedZeroCount++;
            }
        }
        assertEquals(expectedZeroCount, arraysPlusMinusEvenNumbers.countZeroNumbers(musterArray));
        System.out.println("zero numbers: " +arraysPlusMinusEvenNumbers.countZeroNumbers(musterArray));
    }

}//end of class
