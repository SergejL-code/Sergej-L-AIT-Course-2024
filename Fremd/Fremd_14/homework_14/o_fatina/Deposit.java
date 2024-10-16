package Fremd14.homework_14.o_fatina;
//В сберкассу на трёхпроцентный вклад положили s евро.
// Какой станет сумма вклада через n лет. Использовать цикл for.
import java.util.Scanner;

public class Deposit {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter your deposit: ");
        double s= scanner.nextDouble();

        System.out.println("Number of years: ");
        int x= scanner.nextInt();

        double rate =3.0/100;

        for (int year = 1; year <= x; year++){
            s += s*rate;
        }
        System.out.println("Your deposit after " +x +" years will be: " + s);
    }
}
