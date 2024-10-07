package HomeWork_17.Bank.model;

/*The IBAN bank account number consists of Latin letters and numbers and has
 a strictly regulated length (in Germany 22 characters).
 Create an IbanCode class in which to define the necessary fields and implement methods:
lengthCode(String code), which returns the number of characters in the count
controlCode(String code), which returns the sum of the ASCII codes of the first two characters
isValid(String code), which checks the barcode for the correct number of characters */

/*Номер счета в банке IBAN состоит из букв латинского алфавита и цифр,
 имеет строго регламентированную длину (в Германии - 22 символа). Создать класс IbanCode,
 в котором определить необходимые поля и реализовать методы:
lengthCode(String code), который возвращает количество символов в счете
controlCode(String code), который возвращает сумму ASCII-кодов первых двух символов
isValid(String code), который проверяет штрих-код на правильное количество символов*/

public class IbanCode {

    // field
    public String code;

    // constuctor

    public IbanCode(String code) {
        this.code = code;
    }
//Getter and Setter

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

// Methods

    public int lengthCode() {
        String digits = code.replaceAll("\\D", "");
        return digits.length();
    }


    public int controlCode() {
       return  code.length() >=2 ? code.charAt(3)+code.charAt(4):0;
    }


    public boolean isValid() {
      int length = code.length();
      return  length==22;
    }



    //  method that outputs messages
    public void display() {
        System.out.println(" IBAN laut: " + code);
    }

}//end of class
