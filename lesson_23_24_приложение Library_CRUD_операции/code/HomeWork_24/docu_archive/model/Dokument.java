package HomeWork_24.docu_archive.model;

import java.util.Objects;

public class Dokument {
    public static final int ID_LENGTH = 10; // Great constant variable

//fields

    private long id;
    private String titel;
    private String author;
    private String status;
    private int DateOfCreation;

    //constructors
    public Dokument(long id, String titel, String author, String status, int dateOfCreation) {
        this.id = checkId(id);
        this.titel = titel;
        this.author = author;
        this.status = status;
        DateOfCreation = dateOfCreation;
    }
    private long checkId(long id){
        if(countDigit(id)){
            return id;
        }
        return -1;
    }

    private  boolean countDigit (long id) {
        int count = 0;
        long temp = id;
        while (temp != 0) {
            temp = temp / 10;
            count++;
        }
        return count == ID_LENGTH;
    }

//Geter and Setter
 public long getId(){return id;}

    public void setId(long id) {
        if (checkId(id) > 0) {
            this.id = checkId(id);
        } else {
            System.out.println(id + "Identification Number is incorrect ");
        }
    }


    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getDateOfCreation() {
        return DateOfCreation;
    }

    public void setDateOfCreation(int dateOfCreation) {
        this.DateOfCreation = dateOfCreation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dokument dokument)) return false;
        return id == dokument.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Document ");
        sb.append("id = ").append(id);
        sb.append("; titel = ").append(titel);
        sb.append("; author = ").append(author);
        sb.append("; status = ").append(status);
        sb.append("; DateOfCreation = ").append(DateOfCreation);
        sb.append('.');
        return sb.toString();
    }
}//end of class
