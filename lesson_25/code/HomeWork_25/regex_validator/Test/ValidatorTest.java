package HomeWork_25.regex_validator.Test;

import HomeWork_25.regex_validator.Validator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidatorTest {

    @Test
    void checkCreditCardNumber() {
        assertTrue(Validator.checkCreditCardNumber("12345678")); // 8 digits
        assertTrue(Validator.checkCreditCardNumber("1234567887654321")); // 16 digits
        assertTrue(Validator.checkCreditCardNumber("1234567890"));// 10 digit
        assertFalse(Validator.checkCreditCardNumber("1234567")); // 7 digit
        assertFalse(Validator.checkCreditCardNumber("12345678876543210")); // 17 digits
        assertFalse(Validator.checkCreditCardNumber("12345678A")); // symbol
    }

    @Test
    void checkDateFormatEU() {
        assertTrue(Validator.checkDateFormatEU("26.10.2023"));//
        assertTrue(Validator.checkDateFormatEU("05.10.2023"));//
        assertTrue(Validator.checkDateFormatEU("31.02.2023"));//
        assertFalse(Validator.checkDateFormatEU("32.02.2023"));//  Day not existiert
        assertFalse(Validator.checkDateFormatEU("15.13.2023"));// Monat not existiert
        assertFalse(Validator.checkDateFormatEU("26/02/2023"));//
        assertFalse(Validator.checkDateFormatEU("05.10.2023"));//
    }

    @Test
    void checkDateFormatUS() {
        assertTrue(Validator.checkDateFormatUS("2023-10-26"));
        assertTrue(Validator.checkDateFormatUS("2023-10-05"));
        assertTrue(Validator.checkDateFormatUS("2023-02-31"));
        assertFalse(Validator.checkDateFormatUS("2023-02-32"));
        assertFalse(Validator.checkDateFormatUS("2023-13-15"));
        assertTrue(Validator.checkDateFormatUS("2023-02-26"));
        assertTrue(Validator.checkDateFormatUS("2023-10-05"));


    } @Test
    void checkDateFormatUSVariant_2() {
        assertFalse(Validator.checkDateFormatUS("10/26/2024"));
        assertFalse(Validator.checkDateFormatUS("10/05/2024"));
       // assertFalse(Validator.checkDateFormatUS("02/31/2024"));
        assertFalse(Validator.checkDateFormatUS("02/32/2024"));
        assertFalse(Validator.checkDateFormatUS("13/15/2024"));
       // assertTrue(Validator.checkDateFormatUS("02/26/2024"));
        assertFalse(Validator.checkDateFormatUS("10/05/2024"));


    }

    @Test
    void checkPhoneNumber() {
        assertTrue(Validator.checkPhoneNumber("+08(01)1234-5678"));

        assertFalse(Validator.checkPhoneNumber("08(01)1234-5678"));//absent +
        assertFalse(Validator.checkPhoneNumber("+108(01)1234-5678"));// +108 must +08
        assertFalse(Validator.checkPhoneNumber("+8(01)1234-5678"));//absent 0
        assertFalse(Validator.checkPhoneNumber("+08(1)1234-5678"));//absent 0
        assertFalse(Validator.checkPhoneNumber("+08(01)123-5678"));//absent digit 4
        assertFalse(Validator.checkPhoneNumber("+08(01)1234-56789"));//too many digits
    }

    @Test
    void checkLessEquals255() {
        assertTrue(Validator.checkLessEquals255("0"));
        assertTrue(Validator.checkLessEquals255("5"));
        assertTrue(Validator.checkLessEquals255("58"));
        assertTrue(Validator.checkLessEquals255("199"));
        assertTrue(Validator.checkLessEquals255("255"));
        assertFalse(Validator.checkLessEquals255("256"));
        assertFalse(Validator.checkLessEquals255("-5"));
        assertFalse(Validator.checkLessEquals255("b5"));
    }


}//end of class
