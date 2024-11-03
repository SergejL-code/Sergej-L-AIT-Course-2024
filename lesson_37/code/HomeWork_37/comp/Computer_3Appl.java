package HomeWork_37.comp;
/* Based on the Computer class:

create your own ArrayList;
add at least 6 elements to it;
sort the list by brand;
sort the list by RAM size, then by SSD size if RAM is equal;
calculate the total volume and average SSD value.*/

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Computer_3Appl {
    public static void main(String[] args) {

        List<Computer_3> computer_3List = new ArrayList<>();
        computer_3List.add(new Computer_3(123_456_71L, "Dell", "XPS 8930", 16, 256));
        computer_3List.add(new Computer_3(123_456_72L, "HP", "Pavilion 15", 8, 512));
        computer_3List.add(new Computer_3(123_456_73L, "Lenovo", "ThinkCentre M720", 16, 1024));
        computer_3List.add(new Computer_3(123_456_75L, "Dell", "XPS 8930", 32, 256));
        computer_3List.add(new Computer_3(123_456_74L, "Dell", "XPS 8930", 16, 512));
        computer_3List.add(new Computer_3(123_456_76L, "HP", "XPS 8930", 16, 256));

        //print sourse List
        for (Computer_3 computer : computer_3List) {
            System.out.println(computer);
        }
        //Great Comparator


        // sort the list by brand(default);
        computer_3List.sort(Computer_3::compareTo);
        System.out.println("===============================================================================");
        //print sort the list by brand
        for (Computer_3 computer : computer_3List) {
            System.out.println(computer);
        }
        System.out.println("===============================================================================");
        // sort the list by RAM size and SSD
        computer_3List.sort(Comparator.comparingInt(Computer_3::getRam)
                .thenComparingInt(Computer_3::getSsd));
        System.out.println("===============================Sort by RAM and SSd================================================");

        for (Computer_3 computer : computer_3List) {
            System.out.println(computer);
        }
 //calculate the total volume and average SSD value

        int totalSsd = 0;
        for (Computer_3 computer : computer_3List) {
            totalSsd += computer.getSsd();
        }
        double avrSsd = (double) totalSsd / computer_3List.size();
        System.out.println("===============================================================================");
        System.out.println("the total volume SSD: " + totalSsd + " GB");
        System.out.println("average SSD value: " + avrSsd + " GB");

    }//end of main
}//end of class
