package ComputerShopGmbh.dao;

import ComputerShopGmbh.model.GeneralDevice;

public class DeviceImpl implements DeviceControl{

   private GeneralDevice[]devices;
   private  int size;

    public DeviceImpl(int capacity) {
        this.devices = new GeneralDevice[capacity];
        this.size = 0;
    }
    public GeneralDevice[] getDevices() {
        return devices;
    }

    public void setDevices(GeneralDevice[] devices) {
        this.devices = devices;
        this.size = devices.length;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }


    @Override
    public boolean addDevice(GeneralDevice device) { if (device == null) {
        return false;
    }
        if (size == devices.length) {
            return false;
        }
        if
        (findDevice(device.getId()) != null){
            return false;
        }
        //positive case
        devices[size]=device;
        size++;
        return true;

    }

    @Override
    public GeneralDevice removeDevice(long id) {  for (int i = 0; i < size; i++) {
        if (devices[i].getId() == id) {
            GeneralDevice victim = devices[i];
            System.arraycopy(devices,i+1,devices,i,size-i-1);
            devices[--size]=null;
            return victim;
        }
    }

        return null;
    }

    @Override
    public GeneralDevice findDevice(long id) {
        for (int i = 0; i < size; i++) {
            if (devices[i].getId() == id) {
                return devices[i];
            }
        }

        return null;
    }



    @Override
    public GeneralDevice updateDevice(GeneralDevice device)
    { for (int i = 0; i < size; i++) {
        if (devices[i].getId() == device.getId()) {
            devices[i] = device;
            return devices[i];
        }
    }
        return null;
    }



    @Override
    public int size() {
        return size;
    }

    @Override
    public void printDevice() {
        for (int i = 0; i < size; i++) {
            System.out.println(devices[i]);
        }
    }

    @Override
    public double calcPriceWithDiscount() {
        return 0;
    }
}// end of class
