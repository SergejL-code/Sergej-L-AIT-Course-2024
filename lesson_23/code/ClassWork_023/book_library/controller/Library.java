package ClassWork_023.book_library.controller;

import ClassWork_023.book_library.model.Book;

public class Library {

    //fields
    private Book[] books;
    private int size; // aktualle Menge der Bücher


    //constructor

    public Library(int capacity) {
        this.books = new Book[capacity];
        this.size = 0;
    }


    // CRUD methods
    // boolean addBook(Book book)
    //site++
    // void printBooks


    // Book findBook(long isbn)
    public Book findBook(long isbn) {
        Book foundBook = null;

        return foundBook;
    }
    // boolean updateBook()


    // Book removeBook(long isbn)

    //size--
    // int size()

    public int size() {
        return size;
    }

}//end of class
