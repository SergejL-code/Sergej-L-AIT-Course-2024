package ClassWork_023_024.book_library.controller;
/*Book - Librarry. Реализовать методы:
        - печать списка всех книг в библиотеке;
        - получение кол-ва книг в библиотеке;
        - поиска книги по ISBN;
        - добавление книги в библиотеку с учетом требований:
        - не добавлять null
        - не добавлять дубликат
        - не добавлять больше, чем может вместить в себя библиотека.
        - удаление книги из библиотеки.*/

import ClassWork_023_024.book_library.model.Book;

public class Library {

    //fields
    private Book[] books;
    private int size; // aktuelle Menge der Bücher


    //constructor

    public Library(int capacity) {
        this.books = new Book[capacity];
        this.size = 0;
    }


    // CRUD methods
    // boolean addBook(Book book)
    public boolean addBook(Book book) {
        //negative case

        if (book == null) {
            return false;
        }
        if (size == books.length) {
            return false;
        }
        if (!(findBook(book.getIsbn()) == null)) {
return  false;
        }
        //positv case
        books[size] = book; //ставим книгу в конец массива, первое свободное место
        size++;
        return true;
    }


    // void printBooks
    public void printBooks() {
        for (int i = 0; i < size; i++) {
            System.out.println(books[i]);
        }
    }

    // Book findBook(long isbn)
    public Book findBook(long isbn) {
        for (int i = 0; i < size; i++) {
            if (books[i].getIsbn() == isbn) {
                return books[i];
            }
        }
        return null;
    }
    // boolean updateBook()


    // Book removeBook(long isbn)
    public Book removeBook(long isbn) {
        for (int i = 0; i < size; i++) {
            if (books[i].getIsbn() == isbn) {
                Book victim = books[i];
                books[i] = books[size - 1];//last book put instead victim
                books[size - 1] = null; //затираем последний элемент массива
                size--;
                return victim;
            }
        }
        return null;
    }

    public int size() {
        return size;
    }

}//end of class
