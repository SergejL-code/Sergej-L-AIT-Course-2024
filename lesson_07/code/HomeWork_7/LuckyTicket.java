package HomeWork_7;

import java.util.Scanner;

public class LuckyTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a six-digit number to determine if is a ``Lucky`` number  ");
        int number = scanner.nextInt();
        int firstPart =number / 1000;
        // System.out.println(firstPart);
        int lastPart = number % 1000;
        // System.out.println(lastPart);
        int sumFirstPart = 0;
        int sumLastPart = 0;

        sumFirstPart = sumDigits(firstPart); // call methods
        sumLastPart = sumDigits(lastPart); // call methods

        if (sumFirstPart == sumLastPart){
            System.out.println("This ticket is Lucky");
        }
        else {
            System.out.println("This ticket is not Lucky");
        }
    }

    private static int sumDigits(int number) {
        int sumDigits = 0;
        while (number !=0){
            sumDigits += number % 10;
            number /=10;
        }
        return sumDigits;
    }
}
