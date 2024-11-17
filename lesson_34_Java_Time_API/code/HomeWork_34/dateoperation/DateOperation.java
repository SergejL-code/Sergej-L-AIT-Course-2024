package HomeWork_34.dateoperation;
/*
Задача 1
В классе DateOperation из классной работы, реализовать метод getAge, принимающий дату рождения в виде стринга, и возвращающий возраст.

Задача 2
В классе DateOperation из классной работы, реализовать метод sortStringDates, принимающий массив дат в виде массива стрингов, и возвращающий отсортированный массив стрингов-дат.
Для проверки используйте класс DateOperationTest с юнит-тестами.*/

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Scanner;

public class DateOperation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Input your date of birth: ");
        String birthDate = scanner.next();

        System.out.println("Your age " + getAge(birthDate));

    }

    //  Этот метод принимает дату рождения в виде стринга, и возвращающий возраст.

    public static int getAge(String birthDate) {
        LocalDate date = LocalDate.parse(birthDate, DateTimeFormatter.ofPattern("[dd-MM-yyyy][dd/MM/yyyy][dd MM yyyy][dd.MM.yyyy][yyyy-MM-dd]"));
        return (int) ChronoUnit.YEARS.between(date, LocalDate.now());
    }


    public static String[] sortStringDates(String[] dates) {
        DateTimeFormatter df = DateTimeFormatter.ofPattern("[yyyy-MM-dd][dd-MM-yyyy][dd/MM/yyyy][dd MM yyyy][dd.MM.yyyy]");
        Arrays.sort(dates, (date1, date2) -> LocalDate.parse(date1, df).compareTo(LocalDate.parse(date2, df)));

        System.out.println(Arrays.toString(dates));
        return dates;
    }

}//end of class