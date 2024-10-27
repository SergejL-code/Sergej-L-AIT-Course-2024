package Supermarkt.model;

import java.util.Objects;

public class MilkFood extends Product {
    //fields(Attributes)

    private String milkType;  // the type of milk(хранят тип молока)
    private double fat;// fat content of the product (жирность продукта)

    //constructor

    public MilkFood(long barcode, String name, double price, String expDate, double fat, String milkType) {
        super(barcode, name, price, expDate);
        this.fat = fat;
        this.milkType = milkType;
    }


    //Getter and Setter

    public double getFat() {
        return fat;
    }

    public void setFat(double fat) {
        this.fat = fat;
    }

    public String getMilkType() {
        return milkType;
    }

    public void setMilkType(String milkType) {
        this.milkType = milkType;
    }

    //displaying
    @Override
    public String toString() {
        return "MilkFood{" +
                "fat=" + fat +
                ", milkType='" + milkType + '\'' +
                ", expDate='" + expDate + '\'' +
                "} " + super.toString();
    }

    //Equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof HomeWork_19.Productshop.modele.MilkFood milkFood)) return false;
        if (!super.equals(o)) return false;
        return Double.compare(fat, milkFood.fat) == 0 && Objects.equals(milkType, milkFood.milkType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), milkType, fat);
    }
}//end of class
}
