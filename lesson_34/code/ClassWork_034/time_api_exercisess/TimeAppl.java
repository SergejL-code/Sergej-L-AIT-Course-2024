package ClassWork_034.time_api_exercisess;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class TimeAppl {
    public static void main(String[] args) {
        //How much time? -ISO format: YYYY-mm-DD
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        System.out.println("=============================Example of Gagarin======================================================");
        LocalDate gagarin = LocalDate.of(1961, 4, 12);
        System.out.println(gagarin);
        // Welcher Tag des Woche war es?
        System.out.println(gagarin.getDayOfWeek());
        System.out.println(gagarin.getDayOfYear());
        System.out.println(gagarin.lengthOfMonth());
        System.out.println(gagarin.lengthOfMonth());
        System.out.println("========================================== Is leap year?===============================");
        int year = 2024;
        System.out.println("Is year " + year + " leap: " + Year.isLeap(year));
        System.out.println("========================================================================================");
        System.out.println(gagarin.isBefore(localDate));//Logisches  true
        System.out.println(gagarin.isAfter(localDate));//false
        System.out.println("========================================================================================");
        long period = ChronoUnit.YEARS.between(gagarin, localDate);
        System.out.println(period);
        long days = ChronoUnit.DAYS.between(gagarin, localDate);
        System.out.println(days);
        System.out.println("================================DateTime Formatter========================================================");
        DateTimeFormatter df = DateTimeFormatter.ISO_LOCAL_DATE;// YYYY-mm-DD
        String date = gagarin.format(df); // LocalDate to String
        System.out.println(date);
        // выбираем другой формат
        df = DateTimeFormatter.BASIC_ISO_DATE;
        date = gagarin.format(df);
        System.out.println(date);

        //задаем собственный формат строки с датой
        System.out.println("=================================================================");
        df = DateTimeFormatter.ofPattern("dd/MMMM/YYYY");//делаем разные форматы
        String date1 = gagarin.format(df);
        System.out.println(date1);
        //задаем locale
        df = DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.CHINESE);
        date1 = gagarin.format(df);
        System.out.println(date1);

        // переводим LocalDate from String
        System.out.println("/////////=================//////==============/////=======================//////");

        String stringDate = "29:10:2024";
        LocalDate date2 = LocalDate.parse(stringDate, DateTimeFormatter.ofPattern("[dd:MM:yyyy][dd/MM/yyyy][dd-MM-yyyy"));
        System.out.println(date2);//ISO format


        String stringDate1 = "29/10:2024";// or 29-10-2024
        LocalDate date3 = LocalDate.parse(stringDate1, DateTimeFormatter.ofPattern("[dd:MM:yyyy][dd/MM/yyyy][dd-MM-yyyy"));
        System.out.println(date3);//ISO format





    }//end of main
}//end of class
