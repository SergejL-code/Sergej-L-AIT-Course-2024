package HomeWork_18.Library.modele;

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
