package ComputerShopGmbh.dao;

import ComputerShopGmbh.model.GeneralDevice;

public interface Device {
   boolean addDevice(GeneralDevice device);
     GeneralDevice removeDevice(long id);
    GeneralDevice findDevice(long id);
     GeneralDevice updateDevice(GeneralDevice device);
     int size();
     void printDevice();
}
