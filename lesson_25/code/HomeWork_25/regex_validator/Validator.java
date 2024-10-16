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

    // DateFormatEU - dd-MM-yyyy(?)
    public static boolean checkDateFormatEU(String str){
         //^ start of text
        // check Day 0[1-9] or(|) [1 2] tens  from 1(10) or 2(20) ones [0-9] (from 10 to 29) or 3 [0 1] ones (from 30 to 31) (\\.) as separator
        //  check month 0[1-9] 0(from 01 to 09)ones 1(tens)[0-2]ones separator
        // check years \\d decimal digit with exsactly 4 times
        //$ end of text
        return str.matches("^(0[1-9]|[1-2][0-9]|3[0-1])\\.(0[1-9]|1[0-2])\\.\\d{4}$");

    }

    // DateFormatUS - yyyy-MM-dd
    public static boolean checkDateFormatUS(String str){

       //return str.matches("^\\d{4}\\-(0[1-9]|1[0-2])\\-(0[1-9}|[1-2][0-9]|3[0-1])$");
        return str.matches("\\d{4}\\-(0[1-9]|1[0-2])\\-(0[1-9]|[1-2][0-9]|3[0-1])$");
    }
    public static boolean checkDateFormatUSVariant_2(String str){

       return str.matches("^(0[1-9]|1[0-2])\\/(0[1-9]|[1-2][0-9]|3[0-1])\\/\\d{4}$");
    }
    // PhoneNumber
    public static boolean checkPhoneNumber(String str){

            // return str.matches("^\\+08\\(01\\)d{4}\\-\\d{4}$");
        return  str.matches("^\\+08\\(01\\)\\d{4}\\-\\d{4}$");
    }

    // LessEquals255
    public static boolean checkLessEquals255(String str){
        // \\d from 0 to 9
        // \\ [1-9] from 1 to 9 and \\d any decimal digit
        // 1\\d\\d  first digit is 1(100-199) next digits any
        // 2\\ from 200 to 255 2-200 , [0-5] tens, [0-5] ones
        //return str.matches("^([0-9]|[1-9][0-9]|[1-2][1-5][1-5]$)");
        //return  str.matches("^(\\d|[1-9]\\d|1\\d\\d|2[0-4]\\d|25[0-5])$");
        return  str.matches("^(\\d|[1-9]\\d|1\\d\\d|(2[0-5][0-5]))$");
    }
}//end of class
