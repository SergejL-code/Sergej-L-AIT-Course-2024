package HomeWork_11;

//The shooter has 10 attempts to hit the target.
// Simulate 10 shots using a random number sensor.
//Answer the question, how many points did the shooter score? Did he ever hit the center of the target?
//У стрелка есть 10 попыток поразить мишень.
// Смоделируйте 10 выстрелов с помощью датчика случайных чисел.
// Ответьте на вопрос, сколько очков набрал стрелок? Попал ли он хоть раз в центр мишени?

import java.util.Random;

public class Arrows {
    public static void main(String[] args) {
        Random random = new Random();
        int[] schuss = new int[10];
        int sum = 0;

        for (int i = 0; i < schuss.length; i++) {
            schuss[i]=random.nextInt(11);
            sum = sum + schuss[i]; // how many points did the shooter score?

            System.out.print(schuss[i] + "  ");//prints where the arrow hit

        }System.out.println();
        System.out.print("the shooter dialed  " + sum + " points" );
        System.out.println();

        // Did he ever hit the center of the target?
        for (int i = 0; i < schuss.length; i++)
            if(schuss[i]==10){
                System.out.print(" hit the bull's eye !  ");
            }else  {
            System.out.print("  ");
        }
       System.out.println();
    }//end of main
}//end of class
