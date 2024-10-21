package Archive.model;

import java.util.Objects;

public class Doku {


    private String id; // DOI
    private String author;
    private String title;
    private int year;

    public Doku(String id, String author, String title, int year) {
        this.id = id;
        this.author = author;
        this.title = title;
        this.year = year;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Doku doku)) return false;
        return Objects.equals(id, doku.id) && Objects.equals(author, doku.author) && Objects.equals(title, doku.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, author, title);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Doku{");
        sb.append("id='").append(id).append('\'');
        sb.append(", author='").append(author).append('\'');
        sb.append(", title='").append(title).append('\'');
        sb.append(", year=").append(year);
        sb.append('}');
        return sb.toString();
    }
}//end of class
