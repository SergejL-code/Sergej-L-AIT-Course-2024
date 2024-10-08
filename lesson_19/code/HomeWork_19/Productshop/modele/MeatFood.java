package HomeWork_19.Productshop.modele;

import java.util.Objects;

public class MeatFood extends Food {
    //fields
    private String meatType;  // field that stores the type of meat (хранит тип мяса)

    //constructor

    public MeatFood(long barCode, String name, double price, String expDate, String meatType) {
        super(barCode, name, price, expDate);
        this.meatType = meatType;
    }

    //Getter and Setter

    public String getMeatType() {
        return meatType;
    }

    public void setMeatType(String meatType) {
        this.meatType = meatType;
    }

    //displaying
    @Override
    public String toString() {
        return "MeatFood{" +
                "meatType='" + meatType + '\'' +
                ", expDate='" + expDate + '\'' +
                "} " + super.toString();
    }

    //Equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MeatFood meatFood)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(meatType, meatFood.meatType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), meatType);
    }
}//end of class
