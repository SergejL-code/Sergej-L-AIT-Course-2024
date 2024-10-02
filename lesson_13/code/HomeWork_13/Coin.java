package HomeWork_13;

//Flip a coin 100 times and count how many times heads and tails have fallen.
// Write the results to an array.
// Calculate the probability of getting heads and tails.
//Подбросьте монетку 100 раз и подсчитайте, сколько раз выпал орел и сколько решка.
// Запишите результаты в массив. Рассчитайте вероятность выпадения орла и решки.

import java.util.Random;

public class Coin {
    public static void main(String[] args) {
        Random random = new Random();
        int flips = 100;  // Количество подбрасываний
        int eagls = 0;   // Счетчик для орла
        int nuss = 0;    // Счетчик для решки
        int[] resultat = new int[flips];// Массив для хранения результатов


        // Подбрасываем монетку 100 раз
//       for (int i = 0; i < flips; i++) {
//           if (random.nextBoolean()) { // nextBoolean возвращает true или false
//               eagls++;               // true == орел
//                resultat[i] = 1;        // Записываем "орел" как 1
//            } else {
//                nuss++;               // false == решка
//                resultat[i] = 0;        // Записываем "решка" как 0
//            }
        for (int i = 0; i < flips; i++) {
            resultat[i] = random.nextInt(2);  // 0 - Орел, 1 - Решка
            if (resultat[i] == 0) {
                eagls++;
            } else {
                nuss++;
            }

        }

        // Выводим результаты
       System.out.println("Орел выпал: " + eagls + " раз.");
        System.out.println("Решка выпала: " + nuss + " раз.");

        // Рассчитываем вероятности
       double headsProbability = (double) eagls / flips;
        double tailsProbability = (double) nuss / flips;

        System.out.println("Вероятность орла: " + headsProbability);
        System.out.println("Вероятность решки: " + tailsProbability);

    }//end of main

}//end of class
