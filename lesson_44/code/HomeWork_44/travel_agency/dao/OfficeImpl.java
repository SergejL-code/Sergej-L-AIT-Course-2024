package HomeWork_44.travel_agency.dao;

import HomeWork_44.travel_agency.model.Tourist;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class OfficeImpl implements Office {

  private static List<Tourist>tourists;
//заполняем лист
    @Override
    public List<Tourist> fillListTourist() {
        return List.of(
                new Tourist("Olesia", List.of("Iran","Kyrgystan","United Arab Emirates","France","Italy","Portugal", "Spain")),
                new Tourist("Bilbo Baggins",List.of("Italy","Spain","Turkey")),
                new Tourist("Tatyana",List.of( "Italy", "Spain", "Italy", "Greece", "Turkey")),
                new Tourist("Anton",List.of("Germany", "Nederland", "Turkey", "Georgia")),
                new Tourist("Sergei_B", List.of("Tunis", "Turkey", "China", "Vietnam")),
                new Tourist("Galina",List.of("Italy","France", "Italy")),
                new Tourist("Anatoly", List.of("Montenegro", "Albania", "Greece", "Italy")),
                new Tourist("Andrii", List.of("UK", "Ireland", "Spain")),
                new Tourist("Liubov", List.of("Croatien", "Slovenien", "Spain", "France", "Egypt")),
                new Tourist("Liam", List.of("Spain", "Portugal", "Morocco", "Cyprus")),
                new Tourist("Emma", List.of("Greece", "Turkey", "Croatia", "Montenegro")),
                new Tourist("Mia",List.of("Italy", "Malta", "Spain", "Turkey")),
                new Tourist("Noah",List.of("Turkey", "Greece", "Italy", "Croatia")),
                new Tourist("Olivia", List.of("Croatia", "Montenegro", "Albania", "Greece")),
                new Tourist("Lucas",List.of("Portugal", "Spain", "France", "Italy")),
                new Tourist("Amelia",List.of("Greece", "Cyprus", "Spain", "Italy")),
                new Tourist("Oliver", List.of("Spain", "Italy", "Turkey", "Greece")),
                new Tourist("Isabella", List.of("France", "Spain", "Italy", "Greece")),
                new Tourist("Ethan",List.of("Italy", "Greece", "Spain", "Croatia")),
                new Tourist("Ava", List.of("Greece", "Turkey", "Spain", "Italy")),
                new Tourist("Liam", List.of("Spain", "Italy", "Morocco", "Greece")),
                new Tourist("Sophia", List.of("Italy", "Spain", "Turkey", "Greece")),
                new Tourist("Jackson", List.of("Greece", "Spain", "Italy", "Croatia")),
                new Tourist("Olivia", List.of("Croatia", "Greece", "Italy", "Montenegro")),
                new Tourist("Logan", List.of("Spain", "Greece", "Italy", "Turkey")),
                new Tourist("Emma",List.of( "Greece", "Italy", "Spain", "Cyprus")),
                new Tourist("Aiden", List.of("Italy", "Greece", "Spain", "Turkey")));
    }

    //Which of the customers visited the largest number of countries?
    @Override
    public void printMostPopularCountry(List<Tourist>tourists) {

                Map < Integer, List < Tourist>>popularCountry = tourists.stream()
                .collect(Collectors.groupingBy(t -> t.getCountry().size()));
        popularCountry.forEach((key, value) -> System.out.println(key + " : " + value));
        //suche Max
        int max = popularCountry.keySet().stream()
                .max(Integer::compareTo).orElse(0);
        List<Tourist> champ = tourists.stream()
                .filter(turist->turist.getCountry().size() == max)
                .toList();
        System.out.println("========================== Campion ============================");
        System.out.println(champ);
    }


    @Override
    public void printCountryRating(List<Tourist>tourists) {//Which countries are the most popular?
            Map<String, Long> technologiesByFrequency = tourists.stream()
                    .map(Tourist::getCountry)  // получаем список технологий каждого программиста
                    .flatMap(List::stream)           // объединяем списки в единый поток
                    .collect(Collectors.groupingBy(   // группируем по названию технологии
                            country -> country,     // ключ - название технологии
                            Collectors.counting()         // считаем количество каждой технологии
                    ));
//            technologiesByFrequency.entrySet().stream()
//                    .sorted((entry1, entry2) -> Long.compare(entry2.getValue(), entry1.getValue())) //
//                    .forEach(entry -> System.out.printf("Technology: %s, Frequency: %d%n", entry.getKey(), entry.getValue()));
    }
}

