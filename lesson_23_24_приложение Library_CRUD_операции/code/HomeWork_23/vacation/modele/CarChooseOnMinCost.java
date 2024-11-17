package HomeWork_23.vacation.modele;
/*Task 2: A family plans to go on vacation to Italy from Germany and cover about 3000 km. There is information about 5 liquid fuel cars (gasoline or diesel):

car brand: Audi, BMW, Opel, VW, Mercedes.
type of fuel consumed: d, b, d, d, b
cost of 1 liter of fuel: d - 1.6, b - 1.8
consumption per 100 km: 6.6, 6.8, 6.9, 6.5, 6.3
cost of a week's car rental: 45, 49, 45, 39, 49 Which car should she choose based on the minimum cost?*/

import java.util.Objects;

public class CarChooseOnMinCost {

    public static final int ROUTE = 3000;// km, total distance to designation

    //fields
    private String carBrand;
    private String fuelType;
    private double costOfLiter;                    //cost of 1 liter of fuel
    private double consumption;                    // consumption per 100 km
    private int carRental;                         //weekly car rental rate


    // constructor


    public CarChooseOnMinCost(String carBrand, String fuelType, double costOfLiter, double consumption, int carRental) {
        this.carBrand = carBrand;
        this.fuelType = fuelType;
        this.costOfLiter = costOfLiter;
        this.consumption = consumption;
        this.carRental = carRental;
    }
    // Method to calculate the total cost for the trip

    public double totalCost() {
        double cost = (consumption * ROUTE) / 100 * costOfLiter; // Calculating fuel cost

        return cost + carRental;                              // Total cost
    }

    //Getter and Setter

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public double getCostOfLiter() {
        return costOfLiter;
    }

    public void setCostOfLiter(double costOfLiter) {
        this.costOfLiter = costOfLiter;
    }

    public double getConsumption() {
        return consumption;
    }

    public void setConsumption(double consumption) {
        this.consumption = consumption;
    }

    public int getCarRental() {
        return carRental;
    }

    public void setCarRental(int carRental) {
        this.carRental = carRental;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CarChooseOnMinCost that)) return false;
        return Double.compare(costOfLiter, that.costOfLiter) == 0 && Double.compare(consumption, that.consumption) == 0 && carRental == that.carRental && Objects.equals(carBrand, that.carBrand) && Objects.equals(fuelType, that.fuelType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carBrand, fuelType, costOfLiter, consumption, carRental);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CarChooseOnMinCost{");
        sb.append("carBrand='").append(carBrand).append('\'');
        sb.append(", fuelType='").append(fuelType).append('\'');
        sb.append(", costOfLiter=").append(costOfLiter);
        sb.append(", consumption=").append(consumption);
        sb.append(", carRental=").append(carRental);
        sb.append('}');
        return sb.toString();
    }


}//end of class

