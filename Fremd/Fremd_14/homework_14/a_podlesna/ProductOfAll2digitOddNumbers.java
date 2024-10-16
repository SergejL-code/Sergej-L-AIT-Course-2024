package Fremd14.homework_14.a_podlesna;

//  Найти произведение всех двузначных нечетных чисел кратных 17.
// {17,34,51,68,85} => {17,51,85}

import java.util.Random;

public class ProductOfAll2digitOddNumbers
{
    public static void main(String[] args)
    {
        int multiplesOf17 = 1;

        System.out.print("Numbers satisfying the conditions: ");

        for (int i = 17; i < 100; i = i + 17)
        {
            if ((i % 17 == 0) && (i % 2) != 0)
            {
                multiplesOf17 = multiplesOf17 * i;
                System.out.print(i + " ");
            }
        }

        System.out.println("\nThe product of all two-digit odd numbers that are multiples of 17 = " + multiplesOf17);
    }
}
