package HomeWork_18.Library.modele;

public class Book_1 {
    public long isbn_Number;
    public String title;
    public String author;
    public int yearOfPublishing;

    public Book_1(String author, long isbn_Number, String title, int yearOfPublishing) {
        this.author = author;
        this.isbn_Number = isbn_Number;
        this.title = title;
        this.yearOfPublishing = yearOfPublishing;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public long getIsbn_Number() {
        return isbn_Number;
    }

    public void setIsbn_Number(long isbn_Number) {
        this.isbn_Number = isbn_Number;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    @Override
    public String toString() {
        return "Book_1{" +
                "author='" + author + '\'' +
                ", isbn_Number='" + isbn_Number + '\'' +
                ", title='" + title + '\'' +
                ", yearOfPublishing=" + yearOfPublishing +
                '}';
    }
    public void display() {
        System.out.println("Book_1{" +
                "author='" + author + '\'' +
                ", isbn_Number='" + isbn_Number + '\'' +
                ", title='" + title + '\'' +
                ", yearOfPublishing=" + yearOfPublishing + '}');
    }

}//end of class