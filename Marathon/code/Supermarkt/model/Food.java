package Supermarkt.model;

import java.util.Objects;

public class Food extends Product {//fields(Attributes)
    String expDate; // field that stores the expiration date(хранит дату истечения срока годности)

    //constructor
    public Food(long barcode, String name, double price, String expDate) {
        super(barcode, name, price);
        this.expDate = expDate;
    }

    //Getter and Setter
    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }

    //displaying
    @Override
    public String toString() {
        return "Food{} " + super.toString();
    }

    //Equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof HomeWork_19.Productshop.modele.Food food)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(expDate, food.expDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), expDate);
    }
}
