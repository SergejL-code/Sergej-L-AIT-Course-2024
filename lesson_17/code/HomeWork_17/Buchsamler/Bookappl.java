package HomeWork_17.Buchsamler;

import HomeWork_17.Buchsamler.model.Book;

public class Bookappl {
    public static void main(String[] args) {

        Book number_001 = new Book("145-8532-6454","The Master and Margarita","Mikhail Bulgakov",1966, "Fantasy, Satire");
        Book number_002 = new Book("544-532-54","Crime and Punishment","Fyodor Dostoevsky",1844, "Psychological Novel");

        // without isbn

        Book number_003 = new Book("1984","George Orwell",1949, "Dystopian, Political Satire");
        Book number_004 = new Book("1755-862-6454","To Kill a Mockingbird","Harper Lee",1960, "Social Drama");

        //only autor, titel,genre

        Book number_005 = new Book("The War of the Worlds","H.G. Wells", "Science Fiction");

//Call of method for displaying
        number_001.display();
        System.out.println("========================================================================================");
        number_002.display();
        System.out.println("=======================================================================");
        number_003.display();
        System.out.println("=======================================================================");
        number_004.display();
        System.out.println("======================================================================");
        number_005.display();

    }//end of main
}//end of class
