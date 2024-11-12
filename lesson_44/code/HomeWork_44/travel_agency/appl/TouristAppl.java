package HomeWork_44.travel_agency.appl;

import HomeWork_44.travel_agency.dao.Office;
import HomeWork_44.travel_agency.dao.OfficeImpl;
import HomeWork_44.travel_agency.model.Tourist;

import java.util.List;

public class TouristAppl {


    public static void main(String[] args) {
        Office office = new OfficeImpl();
        //заполняем лист туристами
        List<Tourist> tourists = office.fillListTourist();
        //печатаем список
        System.out.println("*********************** Print each tourist********************************** ");
        tourists.forEach(System.out::println);
        //наиболее популярны страны
        System.out.println("***************************************** Print country rating *****************************");

        office.printCountryRating(tourists);

        //печатаем клиентов, которые посетили наибольшее количество стран
        System.out.println("********************************** clients who have visited the most countries **********************************");
        office.printMostPopularCountry(tourists);


    }//end of main

} //end of class

