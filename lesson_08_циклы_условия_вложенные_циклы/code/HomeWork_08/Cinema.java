package HomeWork_08;

//The cinema has different types of tickets: standard, student (-10%) and for pensioners (-25%).
// Each type of ticket has its own cost.
// The client can also choose a seat in the VIP area, which will increase the ticket price by 25%.
// Create a calculateTicketPrice method that accepts the customer's age, student status and a VIP seat flag,
// and returns the total cost of the ticket.
// Implement a bot-application that asks the necessary questions and announces the cost of the ticket.

// В кинотеатре есть разные типы билетов: стандартный, студенческий (-10%) и для пенсионеров(-25%).
// Каждый тип билета имеет свою стоимость. Клиент может также выбрать место в VIP-зоне, что увеличит стоимость билета на 25%.
// Создайте метод calculateTicketPrice, который принимает возраст клиента, статус студента и флаг VIP-места,
// а возвращает итоговую стоимость билета.
// Реализуйте приложение-бот, которое задает необходимые вопросы и объявляет стоимость билета.

import java.util.Scanner;

public class Cinema {

    static int stand = 1;
    static int stud = 2;
    static int senior = 3;
    static int yes = 4;
    static int no = 5;


    //
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How old are you?");
        int age = scanner.nextInt();

        //check correct Age
        while (age <= 16) {
            System.out.println("Wrong input!");
            age = scanner.nextInt();
        }

        System.out.println(" What kind of ticket do you want to buy?" + " Standard -  " + stand + " / " + " student - " + stud + " / " + " senior -  " + senior);
        int ticketTyp = scanner.nextInt();


        System.out.println("Do you want a VIP seat? " + " Yes - " + yes + " or " + " No -  " + no + " ? ");
        int vipQuestion = scanner.nextInt();

        double ticketPrice = calculateTicketPrice(age, ticketTyp, vipQuestion);
        System.out.println("You have chosen ticket type " + ticketTyp + " with VIP option " + vipQuestion + ". Your ticket price is " + ticketPrice + " Euro.");


    } //end of main

    public static double calculateTicketPrice(int age, int ticketTyp, int vipQuestion) {
        double ticketPriceStandart = 20; //Euro
        double ticketPrice = ticketPriceStandart;
        switch (ticketTyp) {


            case 1 ->//Standart
                    ticketPrice = ticketPriceStandart;
            case 2 -> //Student
                    ticketPrice = ticketPriceStandart - (ticketPriceStandart * 10) / 100;
            case 3 -> //Senior
                    ticketPrice = ticketPriceStandart - (ticketPriceStandart * 25) / 100;

            default -> System.out.println("Invalid ticket type selected!");

        }
        if( vipQuestion == yes){
            ticketPrice = ticketPrice*1.25;
        }
        return  ticketPrice;
    }


}



