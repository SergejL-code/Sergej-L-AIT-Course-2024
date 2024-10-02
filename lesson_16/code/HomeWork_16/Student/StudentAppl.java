package HomeWork_16.Student;

import HomeWork_16.Student.model.Student;

public class StudentAppl {
    public static void main(String[] args) {

        //Create three student objects with unique IDs, names, birth years, and specialties

        Student number_1 = new Student(1, " A. ", " B. ", 1994, " Artificial Intelligence ");
        Student number_2 = new Student(2, " C. ", " D. ", 2015, " Clinical Psychology ");
        Student number_3 = new Student(3, " E. ", " F. ", 1980, " Media Production and Digital Design ");

        //Displaying information about students using the display method

        System.out.println("===================================================================================================");
        System.out.println(number_1.Display());
        System.out.println(number_2.Display());
        System.out.println(number_3.Display());

        System.out.println("====================================================================================================");

        System.out.println(number_3.Display_1());
        System.out.println(number_1.Display_1());
        System.out.println(number_2.Display_1());

        System.out.println("====================================================================================================");
            //Call of Metohods for Students
        number_1.exam();
        number_3.sleep();
        number_2.learn();

    }//end of main
}//end of class
