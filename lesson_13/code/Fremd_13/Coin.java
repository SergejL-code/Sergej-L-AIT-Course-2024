package Fremd_13;

import java.util.Random;

public class Coin {

// code by Natalia Tikhomirova


        public static void main(String[] args) {

            int [] res = new int [2]; //  Создаем массив для хранения результатов [орлы, решки]
            Random random = new Random(); // создали генератор (датчик) случайных чисел

            // Симуляция подбрасывания монетки 100 раз

            for (int i = 0; i < 100; i++) {
                int toss = random.nextInt(2); // генерирует: 0 - орел, 1 - решка
                if (toss == 0){
                    res [0]++; // Увеличиваем счетчик орлов
                }else {
                    res [1]++; // Увеличиваем счетчик решек
                }

            } // end of for

            // print res

            System.out.println( " Орел выпал " + res [0] + " раз. ");
            System.out.println( " Решка выпала " + res [1] + " раза. ");

            // Расчет вероятности

            double probabilityHeads = (double) res [0] / 100 * 100; // делим на 100 бросков и умножаем на 100%
            double probabilityTails = (double) res [1] / 100 * 100; // делим на 100 бросков и умножаем на 100%


            // Вывод вероятностей

            System.out.println( "Вероятность выпадения орла: " + probabilityHeads  + "%");
            System.out.println( "Вероятность выпадения решки: " + probabilityTails  + "%");


        } // end of main
    }


