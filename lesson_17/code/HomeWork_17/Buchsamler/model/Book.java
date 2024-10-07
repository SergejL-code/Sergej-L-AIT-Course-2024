package HomeWork_17.Buchsamler.model;
//Create a Book class with fields:unique ISBN number, title title, author, year of publication, genre.
//In the Book class, implement a constructor, getters and setters for all fields, and a display method that displays information about the book. Create a constructor that does not have an ISBN field. Create a constructor that only has the title, author, and genre fields.
//------------------------------------------------------------------------------------------------------
//Создайте класс Book с полями:уникальный номер ISBN, название title, автор author, год издания yearOfPublishing, жанр genre, В классе Book реализуйте конструктор, геттеры и сеттеры на все поля и метод display, который выводит информацию о книге. Создайте конструктор, в котором нет поля ISBN.
// Создайте конструктор, в котором есть только поля title, author и genre.

public class Book {

    public String isbn_Number;
    public String title;
    public String author;
    public int yearOfPublishing;
    public String genre;

    //constructor with all fields
    public Book(String isbn_Number, String title, String author, int yearOfPublishing, String genre) {
        this.isbn_Number = isbn_Number;
        this.title = title;
        this.author = author;
        this.yearOfPublishing = yearOfPublishing;
        this.genre = genre;
    }
    //constructor ohne ISBN

    public Book(String title, String author, int yearOfPublishing, String genre) {
        this.title = title;
        this.author = author;
        this.yearOfPublishing = yearOfPublishing;
        this.genre = genre;
    }
    //constructor only the title, author and genre fields

    public Book(String title, String author, String genre) {
        this.title = title;
        this.author = author;
        this.genre = genre;
    }

    public String getIsbn_Number() {
        return isbn_Number;
    }

    public void setIsbn_Number(String isbn_Number) {
        this.isbn_Number = isbn_Number;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    //method that outputs messages

    public void display() {
        System.out.println("You have selected a book by an author: " + author + " with a title ( " + title + " ) year of release: " + yearOfPublishing + ", genre of the book " + genre + ", ISBN number; " + isbn_Number);
    }
}//end of class
