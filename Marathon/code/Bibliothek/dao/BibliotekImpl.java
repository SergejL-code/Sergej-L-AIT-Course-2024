package Bibliothek.dao;

import Bibliothek.model.Buch;

public class BibliotekImpl implements Bibliothek{
    Buch[] bucher;
    int aktMengeBucher ;

    public BibliotekImpl(int capacity) {
        this.bucher = new Buch[capacity];
        this.aktMengeBucher = aktMengeBucher;
    }

    @Override
    public boolean addBook(Buch buch) {
        if (buch == null) {
            return false;
        }
        if (aktMengeBucher== bucher.length) {
            return false;
        }
        if (!(findBook(buch.getIsbn()) == null)) {
            return  false;
        }
        //positv case
        bucher[aktMengeBucher] = buch; //ставим книгу в конец массива, первое свободное место
        aktMengeBucher++;
        return true;

    }

    @Override
    public Buch removeBook(long isbn) {
        for (int i = 0; i < aktMengeBucher; i++) {
            if (bucher[i].getIsbn() == isbn) {
                Buch victim = bucher[i];
                bucher[i] = bucher[aktMengeBucher- 1];//last book put instead victim
                bucher[aktMengeBucher - 1] = null; //затираем последний элемент массива
                aktMengeBucher--;
                return victim;
            }
        }
        return null;
    }



    @Override
    public int aktMengeBucher() {
        return aktMengeBucher;
    }

    @Override
    public Buch findBook(long isbn) {
        for (int i = 0; i < aktMengeBucher; i++) {
            if (bucher[i].getIsbn() == isbn) {
                return bucher[i];
            }
        }
        return null;
    }



    @Override
    public void printBooks() {
        for (int i = 0; i < aktMengeBucher; i++) {
            System.out.println(bucher[i]);
        }
    }
}
