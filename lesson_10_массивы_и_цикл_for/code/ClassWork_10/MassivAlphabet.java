package ClassWork_10;
//Создайте массив и заполните его символами латинского алфавита от A до Z.
//Раcпечатайте полученный массив.

public class MassivAlphabet {

    public static void main(String[] args) {
        char[] buchstabe = new char[26];

        for (int i = 0; i < buchstabe.length; i++) {
            buchstabe [i] = (char)(65+i);
            System.out.print(buchstabe[i] + " ");

        }//end of for

    }//end of main
}//end of class
