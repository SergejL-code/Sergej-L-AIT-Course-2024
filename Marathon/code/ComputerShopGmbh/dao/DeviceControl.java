package ComputerShopGmbh.dao;

import ComputerShopGmbh.model.GeneralDevice;

public interface DeviceControl {





    boolean addDevice(GeneralDevice  device);// добавить устройство;

    GeneralDevice removeDevice(long id);// удалить устройство по ID;

    GeneralDevice findDevice(long id);

   GeneralDevice updateDevice(GeneralDevice device);

    int size();// текущее количество устройств

    void printDevice(); // распечатать все устройства;
    double calcPriceWithDiscount(); // Вычисление цены со скидкой
}
