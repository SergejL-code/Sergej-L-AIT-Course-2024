package ClassWork_016.Car_objekt;

import ClassWork_016.Car_objekt.model.Car;

public class CarAppl {
    public static void main(String[] args) {

        Car myCar = new Car("Vw", 2014, 15000, "blau", false);// creat Object with  date
        System.out.println(myCar.display());
        myCar.move();
        myCar.stop();
    }

}
