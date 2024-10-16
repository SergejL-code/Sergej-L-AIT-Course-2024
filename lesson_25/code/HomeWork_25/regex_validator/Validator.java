package HomeWork_25.regex_validator;
/*
a) Credit card number (8-16 digits)
b) Date (Format: DD.MM.YYYY)
c) Date (Format: YYYY-MM-DD)
d) Phone Number (Format: +99(99)9999-9999)
e) Number less and equals 255 (positive)*/

public class Validator {

    // CreditCardNumber
    public static boolean checkCreditCardNumber(String str){
        return str.matches("\\d{8,16}");
    }

    //DateFormatEU - dd-MM-yyyy(?)
    public static boolean checkDateFormatEU(String str){
        // TODO Homework checkDateFormatEU

        return str.matches("");
    }

    // DateFormatUS - yyyy-MM-dd
    public static boolean checkDateFormatUS(String str){
        // TODO Homework checkDateFormatUS
        return false;
    }

    // PhoneNumber
    public static boolean checkPhoneNumber(String str){
        // TODO Homework checkPhoneNumber
        return false;
    }

    // LessEquals255
    public static boolean checkLessEquals255(String str){
        // TODO Homework checkLessEquals255
        return false;
    }
}
