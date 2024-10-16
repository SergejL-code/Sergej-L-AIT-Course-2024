package Fremd14.homework_14.a_podlesna;

// В сберкассу на трёхпроцентный вклад положили s рублей.
// Какой станет сумма вклада через n лет. Использовать цикл for.

import java.util.Scanner;

public class SavingsBank
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        double s;
        int n;

        System.out.print("Input the deposit amount in RUB: ");
        s = scanner.nextDouble();
        System.out.print("For how many years do you open a deposit? ");
        n = scanner.nextInt();

        while ((n <= 0) || (n > 100))
        {
            System.out.println("Enter a value from 1 year to 100 years or contact another bank!");
            n = scanner.nextInt();
        }

        for (int i = 1; i <= n; i++)
        {
            s = s * 1.03;
        }
        System.out.printf("After %d years your deposit will be %.2f RUB", n, s);
    }
}
