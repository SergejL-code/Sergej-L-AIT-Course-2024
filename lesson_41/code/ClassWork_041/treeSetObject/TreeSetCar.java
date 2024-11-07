package ClassWork_041.treeSetObject;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetCar {
    public static void main(String[] args) {

        TreeSet<CarTreeSet>carTreeSets=new TreeSet<>();
        CarTreeSet[] cars = new CarTreeSet[5];
        cars[0] = new CarTreeSet("N4", "Model1", "C1", 2.0, "red");// duplicat
        cars[1] = new CarTreeSet("N3", "Model2", "C2", 2.5, "red");
        cars[2] = new CarTreeSet("N2", "Model1", "C3", 3.0, "green");
        cars[3] = new CarTreeSet("N1", "Model3", "C1", 1.4, "gray");
        cars[4] = new CarTreeSet("N4", "Model2", "C3", 2.5, "black");

        for (CarTreeSet car : cars) {
            carTreeSets.add(car);
        }


        System.out.println("======================== Size ======================================================");
        System.out.println(carTreeSets.size());
        System.out.println("****************************************************************************************");


        for (CarTreeSet car : carTreeSets) {
            System.out.println(car);
        }

        System.out.println("******************************************************************************************");

        Comparator<CarTreeSet>comparatorByColor = new Comparator<CarTreeSet>() {
            @Override
            public int compare(CarTreeSet o1, CarTreeSet o2) {
                return o1.getColor().compareTo(o2.getColor());
            }
        };
        System.out.println("================================ comparatorByColor ==============================================");


        TreeSet<CarTreeSet>carTreeSetByColor = new TreeSet<>(comparatorByColor);
        for (CarTreeSet car : cars) {
            carTreeSetByColor.add(car);
        }
       for (CarTreeSet car : cars) {
            System.out.println(car);
        }

        System.out.println("**********************************************************************************");
        System.out.println("================================ comparatorByCompany ==============================================");
        TreeSet<CarTreeSet>carTreeSetsByCompany = new TreeSet<>(Comparator.comparing(CarTreeSet::getCompany));
        for (CarTreeSet car : cars) {
            carTreeSetsByCompany.add(car);
        }

        for (CarTreeSet car : carTreeSetsByCompany) {
            System.out.println(car);
        }




    }//end of main
}//end of class
