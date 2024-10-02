package HomeWork_6;

import java.util.Scanner;

public class Calk {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);

        System.out.println("Enter the first number:");
        int number1 = scanner.nextInt();

        System.out.println("Enter the second number:");
        int number2 = scanner.nextInt();

        System.out.println("Select operation: ");
        System.out.println("operation 1 => + ");
        System.out.println("operation 2 => -");
        System.out.println("operation 3 => *");
        System.out.println("operation 4 => /");
        System.out.println("operation 5 => %");


        //int operation= scanner.nextInt();
char ch = scanner.next().charAt(0);
        switch (ch){
            case '+'->{
                System.out.println("Result: "+ (number1 + number2));
                break;
            }
            case  '-' ->{
                System.out.println("Result: "+ (number1 - number2));
                break;
            }
            case  '/'->{
                System.out.println("Result: "+ (number1 * number2));
                break;
            }
            case '*'->{
                if ( number1!=0){
                    System.out.println("Result: "+ (number1 / number2));
                }else {
                    System.out.println("Error. You can't divide by zero.");
                }
                break;
            }
            default -> {
                System.out.println("Wrong operation");
            }
        }
    }
}
