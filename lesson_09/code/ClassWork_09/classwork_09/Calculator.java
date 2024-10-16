package classwork_09;

// Доработать калькулятор так, чтобы он продолжал работать после выполнения одного действия с парой чисел.

import java.util.Scanner;

public class Calculator {

    static int num1, num2, action;
    static int result;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // start here
        boolean flag = true;

        while (flag) {

            System.out.println("Continue? y/n");
            char ch = scanner.next().charAt(0); // take 1st symbol

            if(ch == 'y') {

                System.out.println("Input 1st number");
                num1 = scanner.nextInt();
                System.out.println("Input 2nd number");
                num2 = scanner.nextInt();
                System.out.println("Input action");
                System.out.println("1 -> '+'");
                System.out.println("2 -> '-'");
                System.out.println("3 -> '*'");
                System.out.println("4 -> '/'");
                System.out.println("5 -> '%'");
                System.out.println("0 -> exit");

                action = scanner.nextInt(); // 1 2 3

                switch (action) {
                    case 1 -> result = sum(num1, num2);
                    case 2 -> result = deduct(num1, num2);
                    case 3 -> result = multiplay(num1, num2);
                    case 4 -> result = division(num1, num2);
                    case 5 -> result = restOfDivision(num1, num2);
                    case 0 -> flag = false;
                    default -> System.out.println("Wrong input!");
                }

                System.out.println("Result = " + result);

            } else {
                flag = false;
            }

        }// start again
    }

    private static int sum(int num1, int num2){
        return num1 + num2;
    }

    private static int deduct(int num1, int num2){
        return num1 - num2;
    }

    private static int multiplay(int num1, int num2){
        return num1 * num2;
    }

    private static int division(int num1, int num2){
        return num1 / num2;
    }

    private static int restOfDivision(int num1, int num2){
        return num1 % num2;
    }

}
