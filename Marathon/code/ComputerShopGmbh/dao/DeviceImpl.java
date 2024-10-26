package ComputerShopGmbh.dao;

public class DeviceImpl implements Device {

    private Device[] devices;
    private int size;

    public DeviceImpl(int capacity) {
        this.devices = new Device[capacity];
        this.size = size;
    }

    @Override
    public boolean addDevice(ComputerShopGmbh.model.Device device) {
        if (device == null) {
            return false;
        }
        if (size == devices.length) {
            return false;
        }
        if (findDevice(device.getId()) != null) {
            return false;
        }
        //positive case
        devices[size] = device;
        size++;
        return true;
    }

    @Override
    public ComputerShopGmbh.model.Device removeDevice(long id) {
        return null;
    }

    @Override
    public ComputerShopGmbh.model.Device findDevice(long id) {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public void printDevice() {

    }
}
