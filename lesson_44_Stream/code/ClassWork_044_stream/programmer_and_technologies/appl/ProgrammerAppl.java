package ClassWork_044_stream.programmer_and_technologies.appl;
/*1. Кто из программистов знает больше всего языков (поименно)
   Ф И - > кол-во языков или кол-во языков -> программист
2. Какие языки пользуются популярностью среди наших программистов
   язык программирования -> сколько программистов его знают*/


import ClassWork_044_stream.programmer_and_technologies.dao.Pro;
import ClassWork_044_stream.programmer_and_technologies.dao.ProImpl;
import ClassWork_044_stream.programmer_and_technologies.model.Programmer;

import java.util.List;

public class ProgrammerAppl {

    public static void main(String[] args) {
        //data set
        Pro pro = new ProImpl();
        List<Programmer> programmers = pro.fillListProgrammers();
        // System.out.println(programmers);
        // drucken  die Liste aus
        programmers.forEach(System.out::println);


        //drucken die Liste aus
        pro.printTechnologies(programmers);
        System.out.println("************************* List  of  Technology *********************************");

        pro.printTechnologies(programmers);

        System.out.println("************************* Frequency popular Technology *********************************");

        //technology -> frequency
        pro.printTechnologiesByFrequency(programmers);

        System.out.println("************************* Frequency popular Technology, sorted *********************************");

        pro.printTechnologiesByFrequencySorted(programmers);

        System.out.println("************************* Technology rating *********************************");

        pro.printTechnologiesRating(programmers);
        //   ratingTechnologiesByFrequency(programmers);

        System.out.println("************************* Most Skilled Programmes *********************************");

        pro.printMostSkilledProgrammers(programmers);


    }//end of main


}//end of class
