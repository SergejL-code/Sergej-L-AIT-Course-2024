package HomeWork_38.hauptStadt;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class GermanyAppl {
    public static void main(String[] args) {
        //// Initialize the LinkedList
        List<String> städte = new LinkedList<>(Arrays.asList("Stuttgart", "Munich", "Berlin", "Potsdam", "Schwerin", "Hanover", "Dresden", "Wiesbaden", "Magdeburg", "Hamburg", "Kiel", "Erfurt", "Mainz", "Düsseldorf", "Potsdam"));

        // Print the initial list
        for (String s : städte) {
            System.out.println(s);
        }
        System.out.println("**************** anfang **************************");
        //anfang
        städte.addFirst("Hamburg");
        städte.set(3, "Hamburg");
        // Print
        for (String anfang : städte) {
            System.out.println(anfang);
        }
        System.out.println("**************** mitte **************************");
        //mitte
        städte.add(städte.size() / 2, "Hamburg");
        // Print
        for (String mitte : städte) {
            System.out.println(mitte);
        }
        System.out.println("**************** ende **************************");
        //ende

        städte.addLast("Hamburg");
        // Print
        for (String ende : städte) {
            System.out.println(ende);
        }

        städte.size();
        // Print
        for (String s : städte) {
            System.out.println(s);
        }

        System.out.println("**************** sort reverse alpabetical **************************");
        Collections.sort(städte, Collections.reverseOrder());
        // Print
        for (String s : städte) {
            System.out.println(s);
        }
        System.out.println("**************** first and last City**************************");
        for (int i = 0; i < 1; i++) {
            System.out.println(städte.getFirst()+ " " + städte.getLast());
        }
        System.out.println("**************** clear **************************");
        städte.clear();
        for (String s : städte) {
            System.out.println(s);
        }
        System.out.println("--------------------------------------------");

        }

    }


