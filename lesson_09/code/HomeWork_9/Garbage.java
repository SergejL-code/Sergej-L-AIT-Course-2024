package HomeWork_9;
// Write a bot program that helps throw garbage into bins of different colors:
//packaging in a yellow bin
//food waste in a brown bin
//paper in a green bin
//other waste in a black bin.
// Use numbers to encode options for actions.

//Написать программу-бот, который помогает выбрасывать мусор в баки разных цветов:
//упаковки в желтый бак
//пищевые отходы в коричневый бак
//бумага в зеленый бак
//прочие отходы в черный бак.
// Используйте цифры для кодирования вариантов действий.

import java.util.Scanner;

public class Garbage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What kind of garbage do you have?");


        System.out.println("1 ->  packaging  ");
        System.out.println("2 -> food waste  ");
        System.out.println("3 -> paper  ");
        System.out.println("4 -> other waste  ");
             int garbage = scanner.nextInt();

        switch (garbage){
            case 1 : garbage = 1 ;
            System.out.println("Throw the Garbage in the yellow bin! ");
            break;
            case 2 : garbage = 2;
            System.out.println("Throw the Garbage in the brown bin! ");
            break;
            case 3 : garbage = 3;
            System.out.println("Throw the Garbage in the green bin! ");
            break;
            case 4 : garbage = 4;
            System.out.println("Throw the Garbage in the black bin! ");
            break;
            default: System.out.println("Wrong input!");
            break;
        }//end of switch
    }//end of main
}//end of class
