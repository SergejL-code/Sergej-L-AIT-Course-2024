package HomeWork_26.autoGmbH.model;
/*  -Абстрактный класс Detail (деталь) с полями: barCode: long size: double material: String vendor: String weight: double
    -Abstract class Detail with fields: barCode: long size: double material: String vendor: String weight: double*/

import java.util.Objects;

public abstract class Detail {
    protected long barCode;
    protected double size;
    protected String material;
    protected String vendor;
    protected double weight;

    public Detail(long barCode, double size, String material, String vendor, double weight) {
        this.barCode = barCode;
        this.size = size;
        this.material = material;
        this.vendor = vendor;
        this.weight = weight;
    }

    public long getBarCode() {
        return barCode;
    }

    public void setBarCode(long barCode) {
        this.barCode = barCode;
    }

    public double getSize() {
        return size;
    }

    public void setSite(double site) {
        this.size = site;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Detail detail)) return false;
        return barCode == detail.barCode && Double.compare(weight, detail.weight) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(barCode, weight);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Detail{");
        sb.append("barCode=").append(barCode);
        sb.append(", site=").append(size);
        sb.append(", material='").append(material).append('\'');
        sb.append(", vendor='").append(vendor).append('\'');
        sb.append(", weight=").append(weight);
        sb.append('}');
        return sb.toString();
    }

}//end of class
