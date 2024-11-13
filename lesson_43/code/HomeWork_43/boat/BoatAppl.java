package HomeWork_43.boat;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BoatAppl {
    public static void main(String[] args) {
        List<Boat> boats = Arrays.asList(new Boat("Sunseeker", "UK", 2020, 24.5, "metal", 3500000),
                new Boat("Azimut", "Italy", 2018, 30.0, "wood", 4000000),
                new Boat("Benetti", "Italy", 2019, 45.0, "plastic", 10000000),
                new Boat("Feadship", "Netherlands", 2022, 60.0, "metal", 50000000),
                new Boat("Azimut", "UK", 2017, 28.0, "wood", 4500000),
                new Boat("Sunseeker", "Italy", 2021, 32.0, "metal", 5500000));

        //отобразить все яхты;
        printBoats(boats);

        //отобразить яхты, сделанные из указанного материала корпуса;
        String material = "metal";
        List<Boat> metalBoats = findBoatsOfMaterial(boats, material);
        printBoats(metalBoats);

        //отобразить яхты дороже указанной цены;
        int price = 4500000;
        printBoatsWithPriceMoreThan(boats, price);

        //отобразить яхты, чей год выпуска находится в заданном диапазоне;
        int yearFrom = 2019;
        int yearTo = 2021;
        System.out.println("--------------------Boats form year " + yearFrom + " to year " + yearTo + "------------------------");
        List<Boat> boatsOfYear = findBoatsOfYearFromTo(boats, yearFrom, yearTo);
        printBoats(boatsOfYear);

        //отсортировать яхты в порядке убывания стоимости;
        List<Boat> sortedByPrice = sortByPrice(boats);
        printBoats(sortedByPrice);

        //получить среднюю стоимость яхты из созданного набора;
        double avgPrice = calcAvgPrice(boats);
        System.out.println("Average price of boats is " + avgPrice + "$");

        //сколько и конкретно какие яхты под каким флагом стоят в порту.
        Map<String, List<Boat>> boatsUnderFlags = calcBoatsUnderFlags(boats);
        for (String key : boatsUnderFlags.keySet()) {
            System.out.println("There are " + boatsUnderFlags.get(key).size() + " boats under flag of " + key + ": ");
            printBoats(boatsUnderFlags.get(key));
        }
    }

    private static Map<String, List<Boat>> calcBoatsUnderFlags(List<Boat> boats) {
        return boats.stream()
                .collect(Collectors.groupingBy(Boat::getCountry));
    }

    private static double calcAvgPrice(List<Boat> boats) {
        return boats.stream()
                .mapToDouble(Boat::getPrice)
                .summaryStatistics()
                .getAverage();
    }

    private static List<Boat> sortByPrice(List<Boat> boats) {
        return boats.stream()
                .sorted(Comparator.comparing(Boat::getPrice))
                .toList();

    }

    private static List<Boat> findBoatsOfYearFromTo(List<Boat> boats, int yearFrom, int yearTo) {
        return boats.stream()
                .filter(boat -> boat.getYear() >= yearFrom && boat.getYear() <= yearTo)
                .toList();
    }

    private static void printBoatsWithPriceMoreThan(List<Boat> boats, int price) {
        boats.stream()
                .filter(boat -> boat.getPrice() > price)
                .forEach(System.out::println);
    }

    private static List<Boat> findBoatsOfMaterial(List<Boat> boats, String material) {
        return boats.stream()
                .filter(boat -> boat.getHullMaterial().equals(material))
                .toList();
    }

    private static void printBoats(List<Boat> boats) {
        boats.forEach(System.out::println);
        System.out.println("----------------------------------------------------------------------------------------------------");
    }
}
