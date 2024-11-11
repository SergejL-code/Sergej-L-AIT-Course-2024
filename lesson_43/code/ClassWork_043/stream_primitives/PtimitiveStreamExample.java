package ClassWork_043.stream_primitives;
/* **Задание 1.**
 Стримы примитивов Integer, Long, Double
 - получить случайные целые числа в интервале от min 1 до max 10 в нужном количестве
 - получение простейших статистических данных с помощью summaryStatistics
 - моделирование лотереи 6 из 49*/

import java.util.IntSummaryStatistics;
import java.util.Random;
import java.util.stream.Stream;

public class PtimitiveStreamExample {
    private static final int MIN = 1;
    private static final int MAX = 10;
    private static final int N_NUMBERS = 20;

    public static void main(String[] args) {
        Stream<Integer> numbers = getRandomNumbers(MIN, MAX + 1, N_NUMBERS);
        // numbers.forEach(System.out::println);
        // numbers.forEach(n -> System.out.print(n + " "));
        //   System.out.println(numbers.forEach(String.format("%d,number)));


        System.out.println("**************************** sum of numbers *******************");
        int sum = numbers
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Sum = " + sum);

        System.out.println("**************************** Summary Statistics *******************");
        IntSummaryStatistics intSummaryStatistics = getRandomNumbers(MIN, MAX, N_NUMBERS)
                .mapToInt(Integer::intValue)
                .summaryStatistics();
        System.out.println(intSummaryStatistics);
        System.out.println("Min value: " + intSummaryStatistics.getMin());
        System.out.println("Max value: " + intSummaryStatistics.getMax());
        System.out.println("Averege value: " + intSummaryStatistics.getAverage());
        System.out.println("Count value: " + intSummaryStatistics.getCount());
        System.out.println("Sum value: " + intSummaryStatistics.getSum());

        System.out.println("**************************** Lotto 6 aus 49 *******************");
        Stream<Integer>lottoryNumbers= getRandomNumbers(1,50)
                .distinct()//удаляем дубликаты
                .limit(6);
        lottoryNumbers.forEach(System.out::println);



    }

    private static Stream<Integer> getRandomNumbers(int min, int max) {
        return new Random()
                .ints( min, max)
                .boxed();

    }


    /*Методы .ints(), .doubles(), и аналогичные в классе java.util.Random используются для генерации потоков случайных чисел различных типов, таких как int, double, и long. Эти методы полезны для получения последовательностей случайных чисел, которые можно обработать как потоки (Stream), что особенно удобно для работы с большими наборами данных.*/
    private static Stream<Integer> getRandomNumbers(int min, int max, int nNumbers) {
        return new Random()
                .ints(nNumbers, min, max)
                .boxed();

    }
}
