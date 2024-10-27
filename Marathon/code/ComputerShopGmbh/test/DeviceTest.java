package ComputerShopGmbh.test;


import ComputerShopGmbh.dao.DeviceControl;
import ComputerShopGmbh.dao.DeviceImpl;
import ComputerShopGmbh.model.Computer;
import ComputerShopGmbh.model.GeneralDevice;
import ComputerShopGmbh.model.Laptop;
import ComputerShopGmbh.model.SmartPhone;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeviceTest {

    DeviceImpl deviceImpl;
    GeneralDevice[] devices;
    @BeforeEach
    void setUp() {
        // Создаем объект DeviceImpl с вместимостью 6
        deviceImpl = new DeviceImpl(6);

        // Создаем массив устройств типа GeneralDevice
        devices = new GeneralDevice[5];
        // Заполняем массив устройствами
        devices[0] = new Computer(123_456_71L, "Dell", "XPS 8930", 16, false, 1200.00, "Tower", "NVIDIA GTX 1660");
        devices[1] = new Laptop(123_456_72L, "HP", "Pavilion 15", 8, true, 800.00, 15.6, 1.75, 10, "Silver");
        devices[2] = new SmartPhone(123_456_73L, "Apple", "iPhone 12", 4, false, 999.00, "iOS", true, 12);
        devices[3] = new Computer(123_456_74L, "Lenovo", "ThinkCentre M720", 16, true, 1100.00, "Mini Tower", "AMD Radeon RX 560");
        devices[4] = new Laptop(123_456_75L, "Asus", "ZenBook 14", 8, false, 950.00, 14.0, 1.3, 12, "Blue");
// Добавляем устройства в deviceImpl
        for (int i = 0; i < 5; i++) {
           deviceImpl .addDevice(devices[i]);
        }
    }


    @Test
    @DisplayName(" addDeviceTest is working")
    void addDeviceTest() {
        //check size
        assertEquals(5,deviceImpl.size());
        //can't add null
        assertFalse(deviceImpl.addDevice(null));
        //can't add duplicate
        assertFalse(deviceImpl.addDevice(devices[1]));
        //can add new one employee
        GeneralDevice newDev = new SmartPhone(6, "Samsung", "Galaxy S21", 8, true, 799.00, "Android", true, 64);
        assertTrue(deviceImpl.addDevice(newDev));
        //check size
        assertEquals(6, deviceImpl.size());
        //can't add one more
        GeneralDevice nextDev = new Computer(7, "Apple", "Mac Pro", 32, false, 2500.00, "Desktop", "AMD Radeon Pro W5700X");
        assertFalse(deviceImpl.addDevice(nextDev));
    }

    @Test@DisplayName("removeDeviceTest is working")
    void removeDeviceTest() {
        //can remove existed
        assertEquals(devices[2], deviceImpl.removeDevice(123_456_73L));
        //check size
        assertEquals(4, deviceImpl.size());
        //can't remove absent
        assertNull(deviceImpl.removeDevice(123_456_78L));
    }

    @Test@
    DisplayName("findDeviceTes is working")
    void findDeviceTest() {
        //find existed
        assertEquals(devices[4], deviceImpl.findDevice(123_456_75L));
        //find absent
        assertNull(deviceImpl.findDevice(123_456_78L));
    }

    @Test// Проверка начального размера
    void sizeTest() {
        assertEquals(5, deviceImpl.size());

    }

    @Test
    void printDeviceTest() {
        deviceImpl.printDevice();
    }
}//end of class