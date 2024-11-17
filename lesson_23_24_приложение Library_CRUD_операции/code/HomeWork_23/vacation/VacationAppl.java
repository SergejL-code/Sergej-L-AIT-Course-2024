package HomeWork_23.vacation;

import HomeWork_23.vacation.modele.CarChooseOnMinCost;

public class VacationAppl {

    public static void main(String[] args) {

       // create an array to store cars
        CarChooseOnMinCost[] sampl = new CarChooseOnMinCost[5];

       // Initialize array with cars
        sampl[0] = new CarChooseOnMinCost("Audi", "Diesel", 1.6, 6.6, 45);
        sampl[1] = new CarChooseOnMinCost("BMW", "Gasoline", 1.8, 6.8, 49);
        sampl[2] = new CarChooseOnMinCost("Opel", "Diesel", 1.6, 6.9, 45);
        sampl[3] = new CarChooseOnMinCost("VW", "Diesel", 1.6, 6.5, 39);
        sampl[4] = new CarChooseOnMinCost("Mercedes", "Gasoline", 1.8, 6.3, 49);
            //think the first car is the best
        CarChooseOnMinCost superCar = sampl[0];


        for (int i = 0; i < sampl.length; i++) {

            double actualTotalCost = sampl[i].totalCost();
            double minTotalCost = superCar.totalCost();

            // Compare the actual value with the minimum value
            if (actualTotalCost < minTotalCost) {
                superCar = sampl[i];

            }
        }


        System.out.println("The best a car " + superCar.getCarBrand() + ",total cost: " +
                superCar.totalCost());

        }

    }//end of class
