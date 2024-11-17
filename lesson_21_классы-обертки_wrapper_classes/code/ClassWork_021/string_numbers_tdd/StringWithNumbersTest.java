package ClassWork_021.string_numbers_tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringWithNumbersTest {
    StringWithNumbers stringWithNumbers;  // object , das testen wird

    @BeforeEach
    void setUp() {
        stringWithNumbers = new StringWithNumbers("123 456 987 333"); // soll sum = 1899 return
    }

    @Test
    void sumOfNumbersInString() {

        String str = "123 456 987 333";
        int expected = 1899;
        int actual = stringWithNumbers.sumOfNumbersInString(str);
    assertEquals(expected,actual);

    }

}//end of class