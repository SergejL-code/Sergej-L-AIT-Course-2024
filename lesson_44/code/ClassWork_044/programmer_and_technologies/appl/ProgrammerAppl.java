package ClassWork_044.programmer_and_technologies.appl;
/*1. Кто из программистов знает больше всего языков (поименно)
   Ф И - > кол-во языков или кол-во языков -> программист
2. Какие языки пользуются популярностью среди наших программистов
   язык программирования -> сколько программистов его знают*/


import ClassWork_044.programmer_and_technologies.model.Programmer;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class ProgrammerAppl {

    private static List<Programmer> programmers;

    public static void main(String[] args) {
        //data set

        List<Programmer> programmers = fillListProgrammers();//  new Objekt  programmers , aber hat drin neu programmer und programmer hat die Liste der feldern.
        // System.out.println(programmers);
        programmers.forEach(System.out::println);// drucken  die Liste aus
        //drucken die Liste aus
        printTechnologies(programmers);
        System.out.println("************************* List  of  Technology *********************************");
        printTechnologies(programmers);

        System.out.println("************************* Frequency popular Technology *********************************");
        //technology -> frequency
        printTechnologiesByFrequancy(programmers);

        System.out.println("************************* Frequency popular Technology, sorted *********************************");
        printTechnologiesByFrequencySorted(programmers);

        System.out.println("************************* Technology rating *********************************");
        printTechnologiesRating(programmers);
        //   ratingTechnologiesByFrequency(programmers);

        System.out.println("************************* Most Skilled Programmes *********************************");
        printMostSkilledProgrammers(programmers);


    }//end of main

    private static void printTechnologiesRating(List<Programmer> programmers) {
        Map<String, Long> technologiesByFrequency = programmers.stream()
                .map(Programmer::getTechnology)  // получаем список технологий каждого программиста
                .flatMap(List::stream)           // объединяем списки в единый поток
                .collect(Collectors.groupingBy(   // группируем по названию технологии
                        technology -> technology,     // ключ - название технологии
                        Collectors.counting()         // считаем количество каждой технологии
                ));
        technologiesByFrequency.entrySet().stream()
                .sorted((entry1, entry2) -> Long.compare(entry2.getValue(), entry1.getValue())) //
                .forEach(entry -> System.out.printf("Technology: %s, Frequency: %d%n", entry.getKey(), entry.getValue()));

    }

    private static void printMostSkilledProgrammers(List<Programmer> programmers) {
        Map<Integer, List<Programmer>> skilledProgrammers = programmers.stream()
                .collect(Collectors.groupingBy(p -> p.getTechnology().size()));
        skilledProgrammers.forEach((key, value) -> System.out.println(key + " : " + value));
        //suche Max
        int max = skilledProgrammers.keySet().stream()
                .max(Integer::compareTo).orElse(0);
        List<Programmer> champ = programmers.stream()
                .filter(programmer -> programmer.getTechnology().size() == max)
                .toList();
        System.out.println("========================== Campion ============================");
        System.out.println(champ);
    }

//    private static void printTechnologiesRating(List<Programmer> programmers) {
//        Map<String,Long>technologiesRating = programmers.stream()
//                .sorted(Map.Entry.<String, Long>comparingByValue().reversed()// сортируем по значению в убывающем порядке
//                .collect(Collectors.toMap(
//                        Map.Entry::getKey,
//                        Map.Entry::getValue,
//                        (e1, e2) -> e1,               // обработка коллизий, хотя они не должны возникнуть
//                        LinkedHashMap::new            // используем LinkedHashMap для сохранения порядка
//                ));
//    }

    private static void printTechnologiesByFrequencySorted(List<Programmer> programmers) {
        List<String> technologies = programmers.stream()
                .map(Programmer::getTechnology)
                .flatMap(List::stream)
                .distinct()
                .sorted().toList();
        technologies.forEach(System.out::println);
    }
//    private static void ratingTechnologiesByFrequency(List<Programmer> programmers) {
//        //Map frequency -> technology
//        Map<String,Long>technologiesByFrequancy = programmers.stream()
//                .map(Programmer::getTechnology)
//                .flatMap(List::stream)
//                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(e1,e2)->e1,
//
//                        technology-> technology,// ключ - название технологии
//                        Collectors.counting()));// считаем количество каждой технологии
//        System.out.println(technologiesByFrequancy);

    private static void printTechnologiesByFrequancy(List<Programmer> programmers) {
        //Map frequency -> technology
        Map<String, Long> technologiesByFrequancy = programmers.stream()
                .map(Programmer::getTechnology)// получаем список технологий каждого программиста
                .flatMap(List::stream) // объединяем списки в единый поток
                .collect(Collectors.groupingBy(// группируем по названию технологии
                        technology -> technology,// ключ - название технологии, лямда которая говорит что войди в технологию и подсчитай сколько раз она встречалась technology
                        Collectors.counting()));// считаем количество каждой технологии

        System.out.println(technologiesByFrequancy);
    }

    private static void printTechnologies(List<Programmer> programmers) {
        List<String> technologiesList = programmers.stream()
                .map(Programmer::getTechnology)//die Liste mit der Sprache genommen
                .flatMap(List::stream)// alle Liste  mit der Sprache zusammengestellt, damit mit  neuem Stream arbeiten
                //.distinct()
                .sorted()//  oder  .sorted(String::compareTo)
                .toList();
        System.out.println(technologiesList);
        //zweite Variante die Duplicate entfernen
        StreamSupport.stream(technologiesList.spliterator(), false)
                .distinct()
                .forEach(System.out::println);
    }

    private static List<Programmer> fillListProgrammers() {
        return List.of(
                new Programmer("Peter", List.of("C++", "Python", "Java", "Kotlin")),
                new Programmer("John", List.of("Python", "Java")),
                new Programmer("Helen", List.of("Kotlin", "Scala", "Java", "JavaScript")),
                new Programmer("Jakob", List.of("Python", "Go")),
                new Programmer("Mike", List.of("Fortran", "Algol", "PL-1"))
        );
    }
}//end of class
