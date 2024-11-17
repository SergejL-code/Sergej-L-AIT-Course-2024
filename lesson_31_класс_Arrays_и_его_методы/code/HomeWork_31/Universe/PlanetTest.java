package HomeWork_31.Universe;
// Взять на выбор любой из классов: Country - name, population River - name, length свой пример и выполнить с ним примеры по аналогии с City, которые мы делали на занятии.
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

class PlanetTest {
    Planet[] planet;

    @BeforeEach
    void setUp() {
        planet = new Planet[8];
        planet[0] = new Planet("Uranus", 8.6810e2, 2600);
        planet[1] = new Planet("Mercury", 3.3011e23, 77);
        planet[2] = new Planet("Mars", 6.4171e23, 225);
        planet[3] = new Planet("Neptune", 1.02413e26, 4300);
        planet[4] = new Planet("Earth", 5.97237e24, 0);
        planet[5] = new Planet("Jupiter", 1.8982e27, 628);
        planet[6] = new Planet("Venus", 4.8675e24, 41);
        planet[7] = new Planet("Saturn", 5.6834e26, 1200);
    }

    @Test
    public void defaultSorting() {
        Planet.printArray(planet, "List of planets not sorted");
        Arrays.sort(planet);
        Planet.printArray(planet, "List of planets sorted by distanceFromEarth ");
    }

    @Test
    public void comparableTest() {
        Planet.printArray(planet, "List of planets not sorted");
        Arrays.sort(planet);
        Planet.printArray(planet, "List of planets sorted by Weight ");
        Planet pattern = new Planet(null, 0, 10);
        int index = Arrays.binarySearch(planet, pattern);
        System.out.println(index);
    }

    @Test
    void testArrayCopy() {

        Planet[] planetsArrayCopy = Arrays.copyOf(planet, planet.length *2);
        Planet.printArray(planetsArrayCopy, "List of planets of copy not sorted");
        System.out.println(planetsArrayCopy.length);
        Comparator<Planet> comparatorByName = Comparator.nullsLast((c1, c2) -> c1.getName().compareTo(c2.getName()));
        //sorting
        Arrays.sort(planetsArrayCopy, comparatorByName);
        //print
        Planet.printArray(planetsArrayCopy, "List of planets of copy sorted by name ");

        Planet pattern = new Planet("Earth", 0, 0);
        int index = Arrays.binarySearch(planetsArrayCopy, 0, planet.length, pattern, comparatorByName);
        System.out.println(index);
    }

    @Test
    void testInsertKeepSorting() {
        Arrays.sort(planet);// by default
        Planet.printArray(planet, "Default sorting");
        //increase up to seven
        Planet[] ninthPlanet = Arrays.copyOf(planet, planet.length + 1);
        Planet nextplanet = new Planet("Planet X", 5e24, 150);
        int index = Arrays.binarySearch(ninthPlanet, 0, planet.length - 1, nextplanet);
        index = index >= 0 ? index : -index - 1;// обработка индекса
        //подготовили место для вставки
        System.arraycopy(ninthPlanet, index, ninthPlanet, index + 1, ninthPlanet.length - index - 1);
        ninthPlanet[index] = nextplanet;
        planet = ninthPlanet; //переопределили ссылку на массив
        Planet.printArray(planet, "List with added planet");
        System.out.println("added planet is " + ninthPlanet[index]);
        System.out.println(ninthPlanet);
    }
    @Test
    void comparatorByNameTest() {
        Planet.printArray(planet,"List of planets of copy not sorted");
        Comparator<Planet> comparatorbyName = new Comparator<Planet>() {
            @Override
            public int compare(Planet p1, Planet p2) {
                return p1.getName().compareTo(p2.getName());
            }
        };
        Arrays.sort(planet, comparatorbyName);
        Planet.printArray(planet, "List of planets sorted by Name");
        Planet pattern = new Planet("k", 30, 25);
        int index = Arrays.binarySearch(planet, pattern, comparatorbyName);
        if (index >= 0) {
            System.out.println(" Find Planet" + pattern.getName() + " on index: " + index);
        } else {
            System.out.println(" Planet " + pattern.getName() + " did not find, but it could be on index " + (-index - 1));
        }
    }


}//end of class