package HomeWork_40.treeSet;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExsampelString {
    public static void main(String[] args) {

        TreeSet<String> str = new TreeSet<>();
        str.add("Иван");
        str.add("Петр");
        str.add("Юлия");
        str.add("Елена");
        str.add("Николай");

        str.add("Юлия");
        System.out.println("TreeSet " + str);


        System.out.println("Contains Иван? " + str.contains("Иван"));
        System.out.println("Contains  Алекс? " + str.contains(" Алекс"));

        System.out.println(" First: " + str.first());
        System.out.println(" Last: " + str.last());


        System.out.println(str.higher("Петр"));
        System.out.println("*************************************************");
        System.out.println(str.lower("Юлия"));
        System.out.println("--------------------------------------------------");
        System.out.println(str.lower("Петр"));
        System.out.println("----------------------------------------------------");
        System.out.println(str.higher("Юлия"));
        System.out.println("*******************************************************");

        System.out.println(str.pollFirst());
        System.out.println("==================================================");
        System.out.println(str);
        System.out.println("*******************************************************");
        TreeSet<String>subset = new TreeSet<>( str.subSet("Николай","Юлия"));
        System.out.println(subset);
        str.add("Елена");
        System.out.println(str.size());
        System.out.println(str);

        System.out.println(str.isEmpty());

        NavigableSet<String> subset_1 = str.subSet("Иван", false, "Николай", true);
        System.out.println("Subset from Иван to  Николай inclusive: " + subset_1);
    }


}
