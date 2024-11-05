package ClassWork_033.coffee_maschine;

import java.util.Scanner;

public class CoffeeAppl {
    public static void main(String[] args) {


        Coffee[] coffees = Coffee.values();
        System.out.println("Welcome to CoffeeCafe!");
        boolean flag = true;
        Scanner scanner = new Scanner(System.in);
        //start of loop

        while (flag) {
            System.out.println("Input your choice:  Press 1 for Espresso, 2 for Americano,3 for Capuccino,4 for Latte,5 for exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1,2,3,4 -> {
                    System.out.println("Your choice is: " + coffees[choice - 1].getTitle());
                    System.out.println("Please,make payment " + coffees[choice - 1].getPrice());
                }

                case 5 -> flag = false;
                default -> System.out.println("Wrong choice");
            }
        }//end of while

    }//end of main
}//end of class
