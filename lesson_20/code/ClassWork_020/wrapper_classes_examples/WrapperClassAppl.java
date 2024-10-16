package ClassWork_020.wrapper_classes_examples;

import java.math.BigInteger;

public class WrapperClassAppl {
    public static void main(String[] args) {
        int k = 1234567890;
        System.out.println(k);
        System.out.println("---------------------------------------------------------------------");

        Integer myInt = Integer.parseInt("1234567890");
        System.out.println(myInt);
        myInt = myInt + 100;
        System.out.println(myInt);
        int value1 = 123;
        Integer a = new Integer(value1);
        System.out.println(value1);
        System.out.println("=======================================================================");
        //автоупаковка

        Integer x = 5;
        System.out.println(x * 10);

        //автораспоковка
        myInt = 7;
        int z = x + myInt;
        System.out.println(z);
        System.out.println("============================================================================");

        BigInteger myBigInt = new BigInteger("12345678901234567890123456789123456789123456789123456789");
        System.out.println(myBigInt);

        // количество цифр в числе variant 2

        int c = 1234567890;
        Integer cInt = c;
        //упаковали int in Integer
        //смена типа на String
        String str = cInt.toString(); // числу сменили тип на String
        System.out.println(str);
        int l = str.length();
        System.out.println("Number: " + c + " contains " + l + " digits.");

        System.out.println("=====================================================================================================");
        //перевод String в число

        String str1 = "0098765432100";
        long num = Long.parseLong(str1);
        System.out.println(num);

        System.out.println("=====================================================================================================");
        System.out.println("Max value of int: " + cInt.MAX_VALUE);
        System.out.println("Min value of int: " + cInt.MIN_VALUE);
        Double d = 0.0;
        System.out.println("Max value of int: " + d.MAX_VALUE);
        System.out.println("Min value of int: " + d.MIN_VALUE);

        //матиматические вычисления
        int n = 20;                             //
        Integer m = 10;                           // упаковали int in Integer
        m = m + n;
        System.out.println(m);
        n = n + m;                                    // автоупакова
        System.out.println(n + 1);

        Double pi = 3.14;
        double circleLenth = 2 * pi * 10;
        System.out.println(circleLenth);

        System.out.printf("Leghth of circle : %.2f", circleLenth);
        System.out.println();
        System.out.println("=======================================================================");
        //NaN and Infinite

        double p = 20 / 0.0; // Double можно поставить сразу, тогда в Double обертке
        if (Double.isNaN(p) || Double.isInfinite(p)) {
            System.out.println("wrong operation, division bei zero");
        } else System.out.println(p);


    }//end of main

}//end of class
