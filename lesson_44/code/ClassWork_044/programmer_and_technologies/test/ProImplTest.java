package ClassWork_044.programmer_and_technologies.test;

import ClassWork_044.programmer_and_technologies.model.Programmer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class ProImplTest {
    List<Programmer> programmers;
    @BeforeEach
    void setUp() {
        programmers = new ArrayList<>(
                List.of(
                        new Programmer("Peter", List.of("C++", "Python", "Java", "Kotlin")),
                        new Programmer("John", List.of("Python", "Java")),
                        new Programmer("Helen", List.of("Kotlin", "Scala", "Java", "JavaScript")),
                        new Programmer("Jakob", List.of("Python", "Go")),
                        new Programmer("Mike", List.of("Fortran", "Algol", "PL-1", "Python", "Go")) //
                ));
    }


    @Test
    void sortedMapTechnologiesTest() {
        Map<String, Long> map = programmers.stream()
                .map(Programmer::getTechnology)
                .flatMap(List::stream)
                .collect(Collectors.groupingBy(technology -> technology,     // ключ - название технологии
                        Collectors.counting())); // считаем количество каждой технологии))

        map.forEach((key, value) -> System.out.println(key + " : " + value));

        System.out.println("============================================");

        // Помещаем результат в TreeMap для сортировки по ключу
        Map<String, Long> sortedMap = new TreeMap<>(map);
        sortedMap.forEach((key, value) -> System.out.println(key + " : " + value));

    }


    @Test
    void sortedByTechnologies() {
        System.out.println("------------ technologies as is: --------------");
        printTest();

        System.out.println("------------ technologies collected: --------------");
        Map<String, Long> technologies = programmers.stream()
                .map(Programmer::getTechnology)  // получаем список технологий каждого программиста
                .flatMap(List::stream)           // объединяем списки в единый поток
                .collect(Collectors.groupingBy(   // группируем технологии по названию
                        technology -> technology, // ключ - имя программиста // название технологии
                        Collectors.counting()         // считаем количество каждой технологии
                ));
        System.out.println(technologies);
        // Преобразование в TreeMap
        Map<String, Long> sortedTechnologies = new TreeMap<>(technologies);
        sortedTechnologies.forEach((key, value) -> System.out.println(key + " : " + value));

        System.out.println("----------------------------------------------------------");
        // Map reversed: число - технологии
        Map<Long, List<String>> reversedTechnologies = technologies.entrySet().stream()
                .collect(Collectors.groupingBy(
                        Map.Entry::getValue,  // Значение из оригинальной карты будет ключом
                        Collectors.mapping(Map.Entry::getKey, Collectors.toList())  // Маппинг: ключ (технология) становится значением
                ));

        System.out.println(reversedTechnologies);

    }

    @Test
    void sortedMapFrequencyTest() {
        Map<Long, List<Programmer>> map = programmers.stream()
                .collect(Collectors.groupingBy(
                        programmer -> (long) programmer.getTechnology().size(), // Ключ: количество технологий у программиста
                        TreeMap::new,
                        Collectors.toList()
                ));
        map.forEach((key, value) -> System.out.println(key + " : " + value));

    }

    @Test
    void printTest() {
        programmers.forEach(System.out::println);
    }
}
