package ComputerShopGmbh.model;

public class SmartPhone extends Computer{
   String os ;
   int camera_resolution;

    public SmartPhone(String id, String brand, String model, double price, boolean discount, String os, int camera_resolution) {
        super(id, brand, model, price, discount);
        this.os = os;
        this.camera_resolution = camera_resolution;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public int getCamera_resolution() {
        return camera_resolution;
    }

    public void setCamera_resolution(int camera_resolution) {
        this.camera_resolution = camera_resolution;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SmartPhone{");
        sb.append("os='").append(os).append('\'');
        sb.append(", camera_resolution=").append(camera_resolution);
        sb.append('}');
        return sb.toString();
    }
}

