package HomeWork_37.Universe_1;
/*. Add the planets of the solar system to a list containing:
name;
distance to the Sun;
mass;
number of satellites.
Output a list of planets sorted by:
order of location in the solar system;
alphabet;
mass;
number of satellites.*/

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PlanetAppl {
    public static void main(String[] args) {
        List<Planet_1> planet1List = new ArrayList<>();
        planet1List.add(new Planet_1("Mercury", 3.3e23, 58e6, 0));
        planet1List.add(new Planet_1("Venus", 4.87e24, 108e6, 0));
        planet1List.add(new Planet_1("Saturn", 5.68e26, 1.43e9, 83));
        planet1List.add(new Planet_1("Mars", 6.42e23, 228e6, 2));
        planet1List.add(new Planet_1("Earth", 5.97e24, 150e6, 1));
        planet1List.add(new Planet_1("Jupiter", 1.90e27, 778e6, 79));
        planet1List.add(new Planet_1("Uranus", 8.68e25, 2.87e9, 27));
        planet1List.add(new Planet_1("Neptune", 1.02e26, 4.5e9, 14));


        //print
        for (Planet_1 planet1 : planet1List) {
            System.out.println(planet1);
        }
        System.out.println("===============================================================");

        //sort by of location in the solar system(default)
        planet1List.sort(Planet_1::compareTo);
        System.out.println("********************  location in the solar system  ****************************");
        for (Planet_1 planet1 : planet1List) {
            System.out.println(planet1);
        }
        System.out.println("---------------------------------------------");
        System.out.println("********************  by alphabet  ************************");
        //sort by alphabet
        planet1List.sort(Comparator.comparing(Planet_1::getName));
        for (Planet_1 planet1 : planet1List) {
            System.out.println(planet1);
        }
        System.out.println("----------------------------------------");
        System.out.println("********************  by mass  ************************");
        planet1List.sort(Comparator.comparing(Planet_1::getWeight));
        for (Planet_1 planet1 : planet1List) {
            System.out.println(planet1);
        }
        System.out.println("----------------------------------------");

        System.out.println("********************  number of satellites  ************************");
        planet1List.sort(Comparator.comparing(Planet_1::getNumberOfSatellites));
        for (Planet_1 planet1 : planet1List) {
            System.out.println(planet1);
        }
        System.out.println("----------------------------------------");
    }

}//end of class
