package HomeWork_7;

// Enter a positive integer, find the sum of its digits.
// Вводится положительное целое число, найдите сумму его цифр. Пример: 1725, сумма цифр = 15

import java.util.Scanner;

public class PositvIntegrer {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input positive integer number:");
        int number = scanner.nextInt();
        int sum = 0;
        int number_1 = number;

        int count = 0;

        while (number_1 > 0) {
            number_1 = number_1/10;
            count++;
            System.out.println(number_1);
        }
        while( sum>0){
            sum=sum+sum % 10;
            System.out.println(sum);
        }

    }
}
