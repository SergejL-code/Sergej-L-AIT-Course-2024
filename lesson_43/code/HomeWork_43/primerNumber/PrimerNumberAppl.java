package HomeWork_43.primerNumber;

import java.math.BigInteger;
import java.util.List;
import java.util.stream.Collectors;

public class PrimerNumberAppl {
    public static void main(String[] args) {
        // Набор целых чисел
        List<Integer> numbers = List.of(10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);

        // Фильтрация простых чисел с использованием stream()
        List<Integer> primes = numbers.stream()//numbers.stream() - создает поток из списка чисел.
                .filter(PrimerNumberAppl::isPrime)//.filter(PrimeFilterApp::isPrime) - создаем метод isPrime, который проходится по каждому числу и отбирает только те, которые возвращают true
                .collect(Collectors.toList());

        // Выводим список простых чисел
        System.out.println("Primes: " + primes);//Простые числа: 11, 13, 17, 19
    }

    // Метод для проверки, является ли число простым
    private static boolean isPrime(int number) {
        return BigInteger.valueOf(number).isProbablePrime(1); // Проверка простоты с использованием BigInteger

//    private static boolean isPrime(int number) {
//        if (number < 2) return false;
//        return IntStream.rangeClosed(2, (int) Math.sqrt(number))//проверяем, делится ли оно на любое число от 2 до его квадратного корня.
//                .allMatch(n -> number % n != 0);
        // private static boolean isPrime(int number) {
        //        if (number < 2) return false;
        //        for (int i = 2; i <= Math.sqrt(number); i++) {//Внутри цикла проверяем, делится ли число на i от 2 до sqrt(number). Если оно делится без остатка, возвращаем false (число не является простым).
        //            if (number % i == 0) return false; //Если ни одно число не делит number, возвращаем true — число простое.
        //        }
        //        return true;

//        private static boolean isPrime(int number) {// исключаем числа <= 1 (непростые) и отдельно обрабатываем числа 2 и 3 (они простые).
//            if (number <= 1) return false;
//            if (number <= 3) return true;
//            if (number % 2 == 0 || number % 3 == 0) return false;//Если число делится на 2 или 3, оно не является простым.
//
//            //Проверяем делимость только для чисел вида 6k ± 1 (5, 7, 11, 13, и т.д.). Это исключает делимость на четные числа и делители кратные 3, тем самым сокращая количество проверок.
//            for (int i = 5; i * i <= number; i += 6) {
//                if (number % i == 0 || number % (i + 2) == 0) return false;
//            }
//            return true;
    }
}
