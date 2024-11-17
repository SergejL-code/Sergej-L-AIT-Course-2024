package ClassWork_041.treeSet_fluss;

import java.util.Arrays;
import java.util.TreeSet;

public class TreeSetFluss {
    public static void main(String[] args) {
        TreeSet<String>rivers=new TreeSet<>(Arrays.asList("Volga","Lech","Elbe","Neva","Dunau","Isar"));

        System.out.println(rivers.size());
        System.out.println(rivers);

        for (String river : rivers) {
            System.out.println(river);
        }


    }
}
