package ClassWork_043.stream_primitives;
/*Возьмите список городов, отфильтруйте только те названия, которые начинаются с заданной буквы,
преобразуйте их в верхний регистр и выведите в алфавитном порядке.*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SityStream {
    public static void main(String[] args) {

        List<String> cityList = new ArrayList<>(Arrays.asList("Augsburg", "Munich", "berlin", "Heidelberg", "Worms", "Frankfurt am Main", "Bremen", "Bonn", "Braunschweig"));

        char firstLetter = 'b';

        List<String> result = filterCities(cityList, firstLetter);

        result.forEach(System.out::println);


    }

    private static List<String> filterCities(List<String> cityList, char firstLetter) {
        return cityList.stream()
                .filter(city -> city.toLowerCase().startsWith(String.valueOf(firstLetter)))//фильтруем к нижнем регистру
                .map(String::toUpperCase)

                .sorted()// сортируем по алфавиту
                .map(city -> new StringBuilder(city).reverse().toString()) // переворачиваем имена городов
                .toList()// собираем в лист
                .reversed();//разворачиваем лист

    }
}//end of Class
