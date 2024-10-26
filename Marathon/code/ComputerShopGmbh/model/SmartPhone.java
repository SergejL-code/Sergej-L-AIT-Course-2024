package ComputerShopGmbh.model;

import java.util.Objects;

public class SmartPhone extends Device{
    private String os;
    private boolean has_5g;
    private int camera_resolution;

    public SmartPhone(int id, String brand, String model, int ram, boolean discount, double price, String os, boolean has_5g, int camera_resolution) {
        super(id, brand, model, ram, discount, price);
        this.os = os;
        this.has_5g = has_5g;
        this.camera_resolution = camera_resolution;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public boolean isHas_5g() {
        return has_5g;
    }

    public void setHas_5g(boolean has_5g) {
        this.has_5g = has_5g;
    }

    public int getCamera_resolution() {
        return camera_resolution;
    }

    public void setCamera_resolution(int camera_resolution) {
        this.camera_resolution = camera_resolution;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        SmartPhone that = (SmartPhone) o;
        return has_5g == that.has_5g && camera_resolution == that.camera_resolution && Objects.equals(os, that.os);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), os, has_5g, camera_resolution);
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "os='" + os + '\'' +
                ", has_5g=" + has_5g +
                ", camera_resolution=" + camera_resolution +
                '}';
    }
}

