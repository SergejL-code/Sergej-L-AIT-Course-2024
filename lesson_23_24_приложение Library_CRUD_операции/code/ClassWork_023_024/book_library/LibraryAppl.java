package ClassWork_023_024.book_library;

import ClassWork_023_024.book_library.controller.Library;
import ClassWork_023_024.book_library.model.Book;

public class LibraryAppl {
    public static void main(String[] args) {
        Book[]books = new Book[6];
        books[0] = new Book("1984", "Orwell", 1_111_111_111_110L, 2010);
        books[1] = new Book("T1", "A1", 1_111_111_111_111L, 2011);
        books[2] = new Book("T2", "A2", 1_111_111_111_112L, 2009);
        books[3] = new Book("T3", "A3", 1_111_111_111_113L, 2005);

        Library library = new Library(6);

        for (int i = 0; i < 4; i++) {
            library.addBook(books[i]);
        }
        library.printBooks();
        System.out.println(library.size());
        Book newBook = new Book("War and Peace","L.N Tolstoi",1_111_111_111_115L,1890);
        System.out.println("=======================================================================================");
        library.addBook(newBook);
        library.printBooks();
        System.out.println(library.size());
        System.out.println("=======================================================================================");
        library.removeBook(1_111_111_111_110L);
        library.printBooks();
        System.out.println(library.size());
        System.out.println("=======================================================================================");



           }

}//end of class
