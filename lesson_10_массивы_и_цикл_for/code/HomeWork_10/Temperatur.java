package HomeWork_10;

//Collect data on daytime temperatures in your city and the past week into an array.
// Print the temperature that was on Tuesday and then on Thursday.
// Find the average temperature for the past week.

//Собрать в массив данные о дневной температуре в вашем городе да прошедшую неделю.
// Выведите на печать температуру, которая была во вторник и затем в четверг.
// Найти среднюю температуру за прошлую неделю.

public class Temperatur {
    public static void main(String[] args) {

        double[] temperatur = {5.8, 24.1, 20, 25, 18, 16.3, 16, 16.6, 14, 23, 23.7, 23.8, 35, 38,};
        double sum = 0;
        for (int i = 0; i < temperatur.length; i++) {
            sum = sum + temperatur[i];
        }
        double avergeTemperatur = sum / temperatur.length;
        System.out.println("The average temperature for the past week was " + (int) avergeTemperatur + ";" + " The temperature that was on Tuesday " + temperatur[1] + " and  Thursday " + temperatur[3]);
    }//end of main
}//end of class

