package ComputerShopGmbh.dao;

public interface Device {
    public boolean addDevice(ComputerShopGmbh.model.Device device);
    public ComputerShopGmbh.model.Device removeDevice(long id);
    public ComputerShopGmbh.model.Device findDevice(long id);
    public int size();
    public void printDevice();
}
