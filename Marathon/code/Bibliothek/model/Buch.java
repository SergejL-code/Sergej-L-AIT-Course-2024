package Bibliothek.model;

import java.util.Objects;


public class Buch{

    public static final int ISBN_LENGTH = 13;
    long isbn;
    String author;
    String title;
    String genre;
    int yearOfCreation;

    //constructor
    public Buch(long isbn, String author, String title, String genre, int yearOfCreation) {
        this.isbn = checkIsbn(isbn);
        this.author = author;
        this.title = title;
        this.genre = genre;
        this.yearOfCreation = yearOfCreation;
    }

    //methode проверки  isbn
    private long checkIsbn(long isbn) {
        if (countDigit(isbn)) {
            return isbn;
        }
       return -1;
    }
    //проверяем длину isbn
    private boolean countDigit(long isbn) {
        //String.valueOf(isbn).length() == 13;
        /*можно циклом fori так как известно сколько раз он должен отработать*/
        int count = 0;
        long temp = isbn;//переложили isbn, чтобы не испортить значения
        while (temp != 0) {
            temp=temp/10;
            count++;
        }
        return count == ISBN_LENGTH;
    }

    //getter and setter

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        if(checkIsbn(isbn)>0){
        this.isbn = checkIsbn(isbn);}
        else{
            System.out.println("The given isbn " + "( " + " ) " + isbn + " is not found ");}
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getYearOfCreation() {
        return yearOfCreation;
    }

    public void setYearOfCreation(int yearOfCreation) {
        this.yearOfCreation = yearOfCreation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Buch buch)) return false;
        return isbn == buch.isbn && Objects.equals(author, buch.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn, author);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Bucher ");
        sb.append("isbn=").append(isbn);
        sb.append(", author='").append(author).append('\'');
        sb.append(", title='").append(title).append('\'');
        sb.append(", genre='").append(genre).append('\'');
        sb.append(", yearOfCreation=").append(yearOfCreation);
        sb.append(' ');
        return sb.toString();
    }
}//end of class
