package ClassWork_038.linked_list_test;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/*// заполнить список случайными целыми числами
// проверить работу методов LinkedList*/
public class LinkedListAppl {
    private static final int N_NUMBERS = 10;
    private static final Random random = new Random();
    private static final int MIN = 10;
    private static final int MAX = 20;

    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();//определяем имплементацию ArrayList or LinkedList

        fillList(list);//creation
        print(list);//reading

        System.out.println(list.size());
        System.out.println(list.get(0));// первай элемент
        System.out.println(list.get(list.size() - 1)); //последний элемент
        System.out.println("*************************** index of element *********************************************");
        System.out.println(list.indexOf(10));
        System.out.println("*************************** input number to index *********************************************");
        list.set(0, 50);
        list.set(N_NUMBERS - 1, 100);
        System.out.println(list);
        list.set(5, 200);
        print(list);
        System.out.println("*************************** remove number *********************************************");
        //удалить 15, если оно есть в списке
  /*      for (Integer num : list) {
            if (num == 15){
                list.remove(num);
        }
    }*/
        System.out.println(list);
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer num = iterator.next();
            if (num.equals(15)) {
                iterator.remove();//удаление в позиций курсора итератора
            }
        }
        print(list);

        System.out.println("----------------------------------------------------------------------------");

        list.remove(list.indexOf(100));
        print(list);
        System.out.println("*************************** remove with Lamda,Predicat *********************************************");
        //удаление по условию (предикат,лямдa)
        //удалим все элементы , кратные 3
        list.removeIf(e -> e % 3 == 0);
        print(list);
      //  print(list.indexOf(200));


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
