package HomeWork_6;

// Write a program for a car at a traffic light.
// What to do if the light is red, yellow or green. The color of the traffic light is set in the program, then from the keyboard.

// Напишите программу для машины на светофоре.
// Что делать водителю, если горит красный, жёлтый или зелёный свет. Цвет светофора задается в программе, затем с клавиатуры.

import java.util.Scanner;

public class Trafficlight {
    public static void main(String[] args) {
        int green = 1;
        int yellow = 2;
        int red = 3;
        Scanner scanner = new Scanner(System.in);
        System.out.println(" What color is on at the traffic light? " + green + " - green; " + yellow + " - yellow; " + red + " - red " );
        int colorTraficlight = scanner.nextInt();
        switch (colorTraficlight) {
            case 1 -> {
                System.out.println("You can go.");
            }
            case 2 -> {
                System.out.println("Please wait!");
            }
            case 3 -> {
                System.out.println("Please stand.");
            }

        }

    }//end of main


}//end of class
