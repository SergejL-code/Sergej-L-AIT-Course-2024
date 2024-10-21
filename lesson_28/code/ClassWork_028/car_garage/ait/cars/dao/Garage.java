package ClassWork_028.car_garage.ait.cars.dao;

import ClassWork_028.car_garage.ait.cars.model.Car;

public interface Garage {
    boolean addCar(Car car);
    Car removeCar(String regNum);
     Car findCarByRegNumber(String regNum);
     Car[] findCarsByModel(String model);
     Car[] findCarsCompany(String company);
     Car[] findCarsByEngine(double min,double max);
     Car[] findCarsByColor(String color);
     int size();
     void printCars();

}
