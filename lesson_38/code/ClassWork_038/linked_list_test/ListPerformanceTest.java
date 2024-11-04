package ClassWork_038.linked_list_test;

import java.util.*;

public class ListPerformanceTest {
//будем суммировать в циклах случаиные числа из списка
    private static final int N_NUMBERS = 500_000;
    private static final Random random = new Random();
    private static final int MIN = 10;
    private static final int MAX = 20;


    public static void main(String[] args) {
List<Integer>list=new LinkedList<>();
fillList(list);
        System.out.println("**********************************  for each loop  ********************************");
        long t1= System.currentTimeMillis();
        int sum =0;
        for (Integer num : list) {
            sum+=num;
        }

         long t2=System.currentTimeMillis();
        System.out.println("Sum = " + sum);
        System.out.println("Time = " + (t2-t1));

        System.out.println("********************************** Iterator  ********************************");

        t1= System.currentTimeMillis();
        sum =0;
        Iterator<Integer>iterator= list.iterator();
        while (iterator.hasNext()){
            sum += iterator.next();
        }

         t2=System.currentTimeMillis();
        System.out.println("Sum = " + sum);
        System.out.println("Time = " + (t2-t1));

        System.out.println("********************************** fori loop  ********************************");

        t1= System.currentTimeMillis();
        sum =0;
        for (int i = 0; i <list.size() ; i++) {
            sum+= list.get(i);//получаем элемент по индексу
        }
        t2=System.currentTimeMillis();
        System.out.println("Sum = " + sum);
        System.out.println("Time = " + (t2-t1));

    }//end of main

    private static void print(List<Integer> list) {
        for (Integer o : list) {
            System.out.print(o + " ");
        }
        System.out.println();
        System.out.println("************************************************************************");
    }

    private static void fillList(List<Integer> list) {
        for (int i = 0; i < N_NUMBERS; i++) {
            list.add(random.nextInt(MIN, MAX));
        }

    }
}