package HomeWork_6;
//Напишите программу расчета выдачи денег работнику с учётом надбавки за стаж, если базовая зарплата 500$.
// За 3 года работы надбавка 10%,
// за 5 лет работы надбавка 50%,
// за 10 лет работы надбавка 100%,
// за 15 лет работы надбавка 150%. Сколько лет проработал работник вводится с клавиатуры.

//Write a program for calculating the payment of money to an employee, taking into account the bonus for length of service,
// if the base salary is $500.
// For 3 years of work, a 10% bonus,
// for 5 years of work, a 50% bonus,
// for 10 years of work,a 100% bonus,
// for 15 years of work, a 150% bonus. How many years the employee has worked is entered from the keyboard.

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        double baseSalary = 500;  // Dollars
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many years has the employee worked?( 3,5,10,15) :");
        int years = scanner.nextInt();
        System.out.println("The employee worked " + years + " years ");


        if (years == 3) {
            double bonus = baseSalary * 0.1 + baseSalary;
            System.out.println("For 3 years of work " + bonus + " Dollars a bonus ");

        } else if (years < 3 ) {
            System.out.println(" You are paid the base salary. ");
        }

        if (years == 5) {
            double bonus = baseSalary * 0.5 + baseSalary;
            System.out.println("For 5 years of work " + bonus + " Dollars a bonus");
        }
        else if ( years > 3 && years < 5 ) {
        System.out.println(" You are paid the base salary. ");
    }
        if (years == 10) {
            double bonus = baseSalary  + baseSalary;
            System.out.println("For 10 years of work " + bonus + " Dollars a bonus");
        }
            else if (years > 5 && years < 10 ) {
        System.out.println(" You are paid the base salary. ");
    }
        if (years == 15) {
            double bonus = baseSalary * 1.25  + baseSalary;
            System.out.println("For 15 years of work " + bonus + " Dollars a bonus");
        }
             else if (years > 10 && years < 15 && years > 15) {
        System.out.println(" You are paid the base salary.");
    }

    }//end of main


}//end of class
