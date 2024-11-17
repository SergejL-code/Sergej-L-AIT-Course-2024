package HomeWork_33.weekDay;
/* Задать ENUM weekDay - дни недели. Опробовать на нем методы: .values() .toString .ordinal() .valueOf()

Реализуйте метод, позволяющий прибавлять дни к выбранному дню недели, получая правильный день недели. Пример: Monday + 10 days = Thursday (понедельник + 10 дней = четверг) Проверьте работу метода с помощью теста.*/


import java.util.Scanner;

public class WeekDayAppl {
    public static void main(String[] args) {
        WeekDay[] wochentag = WeekDay.values();
        System.out.println("=======================values of Enum======================");
        for (int i = 0; i <wochentag.length; i++) {
          //  System.out.println(wochentag[i]);
            System.out.println(wochentag[i].getDay() + "  :  " + wochentag[i].getName());
        }

        // for each
        for (WeekDay tag : wochentag) {
            System.out.println(tag.getName());
           System.out.println("------------============================================");
           System.out.println(tag.getDay());

       }
       System.out.println("====================toString()=========================");
        String str = WeekDay.SAT.toString();
        System.out.println(str);



                System.out.println("====================ordinal()=========================");
      // gives the index
       int num = WeekDay.FRI.ordinal();
       System.out.println(num);
        num = WeekDay.TUE.ordinal();
       System.out.println(num);

    System.out.println("====================valueOf()=========================");

       WeekDay s = WeekDay.valueOf("WED");
        System.out.println(s);
        WeekDay se= WeekDay.valueOf("SUN");
        System.out.println(se);
        System.out.println("=============================================");


        //Finding the day of the week

        Scanner scanner = new Scanner(System.in);
        System.out.println("Would you like to know what day of the week it is at ....?Input the number: ");
        int k = scanner.nextInt();

        WeekDay m = WeekDay.MON;
        System.out.println("Today's day of the week " + m.getName());
        m = m.findDay(k);
        System.out.println("After the added days " + k + " will be " + m.getName());


    }//end of main
}//end of class
