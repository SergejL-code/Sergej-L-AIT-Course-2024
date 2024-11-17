package HomeWork_44.travel_agency.dao;

import HomeWork_44.travel_agency.model.Tourist;

import java.util.List;

public interface Office {
   void printMostPopularCountry(List<Tourist>tourists);
   void printCountryRating(List<Tourist>tourists);
    List<Tourist> fillListTourist();
}
