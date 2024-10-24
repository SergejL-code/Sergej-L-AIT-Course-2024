package HomeWork_31.car_garage_31.ait.cars.dao;

import HomeWork_31.car_garage_31.ait.cars.model.Car;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Predicate;

public class GarageImpl implements Garage {

    private Car[] cars;
    private  int size;

    public GarageImpl( int capacity) {
        this.cars = new Car[capacity];
        this.size = size;
    }

    @Override
    public boolean addCar(Car car) {
        if (car == null || size == cars.length || findCarByRegNumber(car.getRegNumber()) != null) {
            return false;
        }
       cars[size++] = car; // identisch (cars[size]= car;   size++;)
        return true;
    }

    @Override
    public Car removeCar(String regNum) {
        for (int i = 0; i < size; i++) {
            if (cars[i].getRegNumber() == regNum) {
                Car victim = cars[i];
                cars[i] = cars[size - 1]; //на место жертвы ставим(копируем) последний элемент
                cars[size - 1] = null;// последний элемент затрем с помощью null
                size--;
                return victim;
            }
        }
        return null;
        }

    @Override
    public Car findCarByRegNumber(String regNum) {
        for (int i = 0; i < size; i++) {
            if (cars[i].getRegNumber().equals(regNum)) {
                return cars[i];
            }
        }
        return null;
    }

    @Override
    public Car[] findCarsByModel(String model) {

        return findCarsByPredicate(car -> model.equals(car.getModel()));//car.getModel().equals(model))
    }

    @Override
    public Car[] findCarsCompany(String company) {
        return findCarsByPredicate(car -> car.getCompany().equals(company));
    }

    @Override
    public Car[] findCarsByEngine(double min, double max) {
        return findCarsByPredicate(car ->car.getEngine()>= min && car.getEngine()<=max);
    }

    @Override
    public Car[] findCarsByColor(String color) {
        return findCarsByPredicate(car -> car.getColor().equals(color));
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void printCars() {
        for (int i = 0; i < size; i++) {
            System.out.println(cars[i]);
        }
    }

    @Override
    public Car[] sortingCarByModel() {

        Comparator<Car> comparatorByModel = new Comparator<Car>() {
            @Override
            public int compare(Car car1, Car car2) {
                return car1.getModel().compareTo(car2.getModel());

            }
        };
        Arrays.sort(cars, comparatorByModel);
        return new Car[0];
    }



    @Override
    public Car[] sortingCarByColor() {
        return new Car[0];
    }

    @Override
    public Car[] sortingCarByCompany() {
        return new Car[0];
    }

    //в этот метод передаем логическое выражение, которое будет тестировать обьекты типа Car
    private Car[] findCarsByPredicate(Predicate<Car>predicate) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (predicate.test(cars[i])) { //обьект проходит тест
                count++;
            }
        }
        //читаем массив и перекладываем рез-ты в новый
        Car[] res = new Car[count];
        for (int i = 0, j = 0; j < res.length; i++) {
            if (predicate.test(cars[i])) {
                res[j++] = cars[i];
            }
        }
        return res;
    }
}//end of class
