package HomeWork_42.countries;
/*Collect about 20 countries in the Map structure, several countries from different continents of the Earth. Count the number of countries on the continents from the resulting list.*/


import java.util.Map;
import java.util.TreeMap;

public class countriesOfTheWorldAppl {
    public static void main(String[] args) {

        Map<String, String> countriesMap = new TreeMap<>();
        countriesMap.put("France", "Europe");
        countriesMap.put("India", "Asia");
        countriesMap.put("Germany", "Europe");
        countriesMap.put("Japan", "Asia");
        countriesMap.put("Egypt", "Africa");
        countriesMap.put("Australia", "Australia and Oceania");
        countriesMap.put("Spain", "Europe");
        countriesMap.put("Italy", "Europe");
        countriesMap.put("Russia", "Europe");
        countriesMap.put("South Korea", "Asia");
        countriesMap.put("Canada", "North America");
        countriesMap.put("Nigeria", "Africa");
        countriesMap.put("Chile", "South America");
        countriesMap.put("United States", "North America");
        countriesMap.put("Brazil", "South America");
        countriesMap.put("Argentina", "South America");
        countriesMap.put("Kenya", "Africa");
        countriesMap.put("Mexico", "North America");
        countriesMap.put("China", "Asia");
        countriesMap.put("Mozambican", "Africa");

        //распечатаем количество стран
        System.out.println("Сountry number :" + countriesMap.size());

        //распечатаем список стран
        System.out.println("***************************** Map countriesMap  ******************************************");
        //проходим по списку  countriesMap.keySet() с country key типа String
        for (String country : countriesMap.keySet()) {
            System.out.println("this country - " + country + " is on the continent: " + countriesMap.get(country));
        }
        System.out.println("***************************************************");

        // Подсчитаем количество стран на континентах из полученного списка
        int countEurope = 0;
        int countAfrica = 0;
        int countNorthAmerica = 0;
        int countSouthAmerica = 0;
        int countAsia = 0;
        int countAustraliaAndOceania = 0;

        for (String conti : countriesMap.values()) {
            switch (conti) {
                case "Europe" -> countEurope++;
                case "Asia" -> countAsia++;
                case "Africa" ->countAfrica++;
                case "Australia and Oceania" -> countAustraliaAndOceania++;
                case "South America" -> countSouthAmerica++;
                case "North America" -> countNorthAmerica++;}
            }


        System.out.println("Africa has " + countAfrica + " countries "+ countriesMap);
        System.out.println("Asia has " + countAsia + " countries");
        System.out.println("Europe " + countEurope + " countries");
        System.out.println("AustraliaAndOceania has " + countAustraliaAndOceania + " countries");
        System.out.println("NorthAmerica has " + countNorthAmerica + " countries");
        System.out.println("SouthAmerica has " + countSouthAmerica + " countries");

    }//end of main
}//end of class
