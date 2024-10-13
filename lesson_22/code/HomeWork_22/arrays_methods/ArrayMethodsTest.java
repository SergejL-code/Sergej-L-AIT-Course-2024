package HomeWork_22.arrays_methods;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
// Declare a reference for the ArrayMethods class
class ArrayMethodsTest {
    ArrayMethods arrayMethods;

    // Example of an array for tests
   int[]probe={1, 4, 1, 5, -5, 4, 2, 5};

    @BeforeEach
    void setUp() {
        arrayMethods = new ArrayMethods(probe);// Initialize ArrayMethods with array probe
    }

    @Test
    void sumOfAllElementsWithOddIndexValid() {
        int expectedSum=18;                                                   //Expected sum of elements with odd indices (4 + 5 + 4 + 5) = 18
        int actual =ArrayMethods.sumOfAllElementsWithOddIndex(probe);        // Call a method from the ArrayMethods
        assertEquals(18,actual);                                    // Verification that the actual result is equal to the expected result
    }

    @Test
    void searchValidInArray() {
        int actual = ArrayMethods.searchInArray(probe);
        assertEquals(-5, actual);                                   // Check the index of element 5 (must be -5)

    }

}//end of class