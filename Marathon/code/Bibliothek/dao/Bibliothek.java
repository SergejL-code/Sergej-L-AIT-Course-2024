package Bibliothek.dao;

import Bibliothek.model.Buch;

public interface Bibliothek {


    boolean addBook(Buch buch);

    Buch removeBook(long isbn);

    int aktMengeBucher();

    void printBooks();

    Buch findBook(long isbn);
}
