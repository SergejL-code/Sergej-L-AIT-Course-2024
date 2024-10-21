package Bibliothek.test;

import Bibliothek.dao.BibliotekImpl;
import Bibliothek.dao.Bibliothek;
import Bibliothek.model.Buch;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class BibliotekImplTest {
Bibliothek bibliothek;
Buch [] bucher;

    @BeforeEach
    void setUp() {
        bibliothek = new BibliotekImpl(5);
        bucher = new Buch[5];
        bucher[0] = new Buch(9783608938265L, "A1", "T1", "fantasy", 1980);
        bucher[1] = new Buch(9783089382686L, "A2", "T2", "fantasy", 1981);
        bucher[2] = new Buch(9783608382677L, "A3", "T3", "fantasy", 1982);
        bucher[3] = new Buch(9783608938268L, "A4", "T4", "fantasy", 1983);

        for (int i = 0; i < bucher.length-1; i++) {
            bibliothek.addBook(bucher[i]);
        }
    }

    @Test
    void addBookTest() {
//not null
        assertFalse(bibliothek.addBook(null));
        // not duplikat
        assertFalse(bibliothek.addBook(bucher[0]));
        //add new Book
        Buch newBook = new Buch(9783608938269L, "A9", "T5", "fantasy", 1989);
        assertTrue(bibliothek.addBook(newBook));
        assertEquals(5,bibliothek.aktMengeBucher());
        // do not add more than the library(capacity) can hold
Buch nextBook = new Buch(9783608938263L, "A7", "T8", "fantasy", 1990);
assertFalse(bibliothek.addBook(nextBook));
    }

    @Test
    void removeBookTest() {
        //remove existed book
        assertEquals(bucher[0], bibliothek.removeBook(978_360_893_826_5L));
        assertEquals(3,bibliothek.aktMengeBucher());
        //remove absent book
        assertNull(bibliothek.removeBook(978_360_893_826_14L));
    }

    @Test
    void aktMengeBucherTest() {
        assertEquals(4,bibliothek.aktMengeBucher());
    }

    @Test
    void printBooksTest() {
        System.out.println("==========================================");
        bibliothek.printBooks();
    }

    @Test
    void findBookTest() {
        //  bucher[1] = new Buch(9783089382686L, "A2", "T2", "fantasy", 1981);
        assertEquals(bucher[1], bibliothek.findBook(978_308_938_268_6L));//find existed book
        assertNull(bibliothek.findBook(111_111_111_111_9L));// find absent book
    }
}//end of class