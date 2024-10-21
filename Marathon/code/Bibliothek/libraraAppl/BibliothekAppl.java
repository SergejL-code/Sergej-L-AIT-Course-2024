package Bibliothek.libraraAppl;

import Bibliothek.model.Buch;

public class BibliothekAppl {
    public static void main(String[] args) {
        Buch[]bucher = new Buch[5];
        bucher[0] = new Buch(978_3_608_93826_5L,"A1","T1","fantasy",1980);
        bucher[1] = new Buch(978_3_608_93826_6L,"A2","T2","fantasy",1981);
        bucher[2] = new Buch(978_3_608_93826_7L,"A3","T3","fantasy",1982);
        bucher[3] = new Buch(978_3_608_93826_8L,"A1","T4","fantasy",1983);

        for (int i = 0; i <bucher.length-1; i++) {
            System.out.println(bucher[i]);
        }


    }

}
