package ClassWork_016.Car_objekt.model;

public class Car {

//fill field to obejkt

    private String brand;
    private int year;
    private double price;
    private String color;
    private boolean Condition;


    // constructor- метод Car, но он ничего не возвращает имеет название по имени класса


    public Car(String brand, int year, double price, String color, boolean condition) {
        this.brand = brand;
        this.year = year;
        this.price = price;
        this.color = color;
        Condition = condition;
    }

    //getters and setters

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isCondition() {
        return Condition;
    }

    public void setCondition(boolean condition) {
        Condition = condition;
    }


    public String display() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", Condition=" + Condition +
                '}';
    }//end of method

    public void move() {
        System.out.println("Car is moving");
    }

    public void stop() {
        System.out.println("Car stopped");
    }

}//end of class



