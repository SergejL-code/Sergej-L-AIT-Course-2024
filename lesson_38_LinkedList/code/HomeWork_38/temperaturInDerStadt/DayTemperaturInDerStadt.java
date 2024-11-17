package HomeWork_38.temperaturInDerStadt;
/*There are temperature measurements in the city for the last week of October and the first week of November. Create a DayTemperature class with the following fields:

LocalDate date;
double temperature; Create two ArrayLists and enter the temperature measurements into them. Calculate the average temperature in the city for the past two weeks. What day was the minimum temperature? What day was the maximum?*/

import HomeWork_38.temperaturInDerStadt.model.DayTemperature;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class DayTemperaturInDerStadt {
    public static void main(String[] args) {

        //greatlists for Oktober and November
        List<DayTemperature> temperaturesinCityOktober = new ArrayList<>();
        List<DayTemperature> temperaturesinCityNovember = new ArrayList<>();
        //add for Oktober
        temperaturesinCityOktober.add(new DayTemperature(LocalDate.of(2023, 10, 25), 14.5));
        temperaturesinCityOktober.add(new DayTemperature(LocalDate.of(2023, 10, 26), 11.5));
        temperaturesinCityOktober.add(new DayTemperature(LocalDate.of(2023, 10, 27), 18));
        temperaturesinCityOktober.add(new DayTemperature(LocalDate.of(2023, 10, 28), 18.1));
        temperaturesinCityOktober.add(new DayTemperature(LocalDate.of(2023, 10, 29), 15.5));
        temperaturesinCityOktober.add(new DayTemperature(LocalDate.of(2023, 10, 30), 24.1));
        temperaturesinCityOktober.add(new DayTemperature(LocalDate.of(2023, 10, 31), 23));
        //add for November
        temperaturesinCityNovember.add(new DayTemperature(LocalDate.of(2023, 11, 1), 12.3));
        temperaturesinCityNovember.add(new DayTemperature(LocalDate.of(2023, 11, 2), 10));
        temperaturesinCityNovember.add(new DayTemperature(LocalDate.of(2023, 11, 3), 12.3));
        temperaturesinCityNovember.add(new DayTemperature(LocalDate.of(2023, 11, 4), 5.3));
        temperaturesinCityNovember.add(new DayTemperature(LocalDate.of(2023, 11, 5), 13));
        temperaturesinCityNovember.add(new DayTemperature(LocalDate.of(2023, 11, 6), 18));
        temperaturesinCityNovember.add(new DayTemperature(LocalDate.of(2023, 11, 7), 12));

        //merging liste
        ArrayList<DayTemperature> temperaturesinCityOktoberAndNovember = new ArrayList<>(temperaturesinCityOktober);
        temperaturesinCityOktoberAndNovember.addAll(temperaturesinCityNovember);

        // print
        print(temperaturesinCityOktoberAndNovember);


        // averge Temperatur
        calculateAverage(temperaturesinCityOktoberAndNovember);


        //sorting
        temperaturesinCityOktoberAndNovember.sort(Comparator.comparing(DayTemperature::getTemperatur));
        for (DayTemperature s : temperaturesinCityOktoberAndNovember) {
            System.out.println(s);
        }

        System.out.println("Average Temperatur: " + calculateAverage(temperaturesinCityOktoberAndNovember));

        System.out.println("Min temperatur :" + temperaturesinCityOktoberAndNovember.stream().min(DayTemperature::compareTo));

        System.out.println("Max temperatur :" + temperaturesinCityOktoberAndNovember.stream().max(DayTemperature::compareTo));


    }//end of main

    //Methode of print
    private static void print(List<DayTemperature> list) {
        for (DayTemperature o : list) {
            System.out.print(o + " ");
        }
        System.out.println();
        System.out.println("************************************************************************");
    }
// Methode of averge temperatur
    private static double calculateAverage(List<DayTemperature> temperatures) {
        double total = 0;
        for (DayTemperature temp : temperatures) {
            total += temp.getTemperatur();
        }
        return total / temperatures.size();
    }

}

