package HomeWork_18.Library.modele;

/*Create or take from a previous homework a Book class with fields: title - title author year of publication - year unique number - ISBN In the Book class, implement a constructor, getters and setters for all fields and display method, which displays information about the book. Create a Dictionary class that extends the Book class. Provide a set of fields for it and override the display method. In the BookAppl class, in the main method, create several dictionaries and display information about them to the console.*/

public class Book_1Appl {
    public static void main(String[] args) {


        //Dictonary
        Dictonary number_1 = new Dictonary("Сергей Иванович Ожегов ", 135465, "Explanatory Dictionary of the Russian Language", 1949,"Explanatory Dictionary","Printed Dictionary","rus");
Dictonary number_2 = new Dictonary("Н. Н. Василенко",111111,"Glossary of Scientific and Technical Terms",1959,"Special dictionaries","Electronic dictionaries","englich");

        //Call of method for displaying

        System.out.println(number_1);
        System.out.println("===========================================================================================");
        System.out.println(number_2);

    }//end of main
}//end of class
