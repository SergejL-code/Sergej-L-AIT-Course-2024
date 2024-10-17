package HomeWork_26.autoGmbH.model;

/*-Дочерний класс Gear (шестеренка) с полями: radius: double tooth: int
    Child class Gear with fields: radius: double tooth: int*/

public class Gear extends Detail {
    double radus;
    int tooth;

    public Gear(long barCode, double size, String material, String vendor, double weight, double radus, int tooth) {
        super(barCode, size, material, vendor, weight);
        this.radus = radus;
        this.tooth = tooth;
    }

    public double getRadus() {
        return radus;
    }

    public void setRadus(double radus) {
        this.radus = radus;
    }

    public int getTooth() {
        return tooth;
    }

    public void setTooth(int tooth) {
        this.tooth = tooth;
    }
}//end of class
