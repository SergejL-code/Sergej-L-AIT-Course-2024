package HomeWork_17.Bank;


import HomeWork_17.Bank.model.IbanCode;


public class IbanAccountAppl {
    public static void main(String[] args) {

        IbanCode code_1 = new IbanCode("DE 1286 4556 2564 5655 5497");
        code_1.display();
        System.out.println("The number of characters in the coun:" + code_1.lengthCode());// ohne DE only Digits

        System.out.println("The sum of the ASCII codes of the first two characters: " + code_1.controlCode());

        System.out.println("The barcode for the correct number of characters:  " + code_1.isValid());// false, because with space
        System.out.println("========================================================================================");

        IbanCode code_2 = new IbanCode("DE34764315669789295847");
        code_2.display();
        System.out.println("The number of characters in the coun:" + code_2.lengthCode());// ohne DE only Digits

        System.out.println("The sum of the ASCII codes of the first two characters: " + code_2.controlCode() );

        System.out.println("The barcode for the correct number of characters:  " + code_2.isValid());




    }//end of main
}// end of class