package HomeWork_7;

//On the first day the athlete ran s kilometers, and then every day he increased his mileage by 10% of previous value.
// Determine the number of the day for which the athlete’s mileage will be at least target kilometers.
// The program receives real numbers s and target as input and must output one natural number.

//В первый день спортсмен пробежал s километров, а затем он каждый день увеличивал пробег на 10 % от предыдущего значения.
// Определите номер того дня, на который пробег спортсмена составит не менее target километров.
// Программа получает на вход действительные числа s и target и должна вывести одно натуральное число.

import java.util.Scanner;

public class athlete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many kilometers did the athlete run on the first day? ");
        double  s = scanner.nextDouble(); //km
        System.out.println("How long should a runner run?:");
        double target = scanner.nextDouble(); //km
        int n_day = 0;
        while (s <= target ){
            s = s + s * 0.1; //every Day by 10%
            n_day++;
        }
        System.out.println("The athlete will run the required " + target +  " of kilometres  in " + n_day + " days." );
    }

}
