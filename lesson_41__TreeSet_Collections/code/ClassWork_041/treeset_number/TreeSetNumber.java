package ClassWork_041.treeset_number;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class TreeSetNumber {
    public static void main(String[] args) {
        List<Integer>num= new ArrayList<>(Arrays.asList(10,20,30,-80,-230,0));
        TreeSet<Integer>numbers= new TreeSet<>(num);
        System.out.println(numbers);

        System.out.println(numbers.size());

        numbers.add(13);
        numbers.add(100500);

        System.out.println(numbers);
        for (Integer number : numbers) {
            System.out.print(number +" ");
        }
        System.out.println();

        System.out.println(numbers.first() + numbers.last());

        System.out.println("*******************************************");
        System.out.println(numbers.ceiling(0));
        System.out.println(numbers.contains(5));
        System.out.println(numbers.floor(5));

        System.out.println(numbers.tailSet(5,true));

        System.out.println(numbers.subSet(0,true,100500,false));



    }
}
