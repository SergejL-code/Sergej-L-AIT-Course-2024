package HomeWork_14;

import java.util.Scanner;

// S rubles were deposited into a savings bank for a three-percent deposit.
// What will the deposit amount be in n years? Use the for loop.
//В сберкассу на трёхпроцентный вклад положили s рублей.
// Какой станет сумма вклада через n лет. Использовать цикл for

public class Prozent {
    public static void main(String[] args) {




                Scanner scanner = new Scanner(System.in);                       // Create a scanner object


                System.out.print("Input  deposit amount (s): ");    //amount of the deposit
                double s = scanner.nextDouble();

                System.out.print("Input the number of years (n): ");//the number of years
                int n = scanner.nextInt();


                double interestRate = 0.03;                         // rate


                for (int year = 0; year < n; year++) {              //  amount after n years
                    s += s * interestRate;
                }//end loop for


                System.out.printf("The amount of the deposit in " + n + " years were: " + s + "rub." );



            }//end of main
        }// end of class



