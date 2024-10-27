package ComputerShopGmbh.test;

import ComputerShopGmbh.dao.Device;
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
    Device devices;
    GeneralDevice[] device;

    @BeforeEach
    void setUp() {
devices =new DeviceImpl(6);
device = new GeneralDevice[5];
device[0]= new Computer(123_456_71L, "Dell", "XPS 8930", 16, false, 1200.00, "Tower", "NVIDIA GTX 1660");
device[1]= new Laptop(123_456_72L, "HP", "Pavilion 15", 8, true, 800.00, 15.6, 1.75, 10, "Silver");
device[2]= new SmartPhone(123_456_73L, "Apple", "iPhone 12", 4, false, 999.00, "iOS", true, 12);
device[3]= new Computer(123_456_74L, "Lenovo", "ThinkCentre M720", 16, true, 1100.00, "Mini Tower", "AMD Radeon RX 560");
device[4]= new Laptop(123_456_75L, "Asus", "ZenBook 14", 8, false, 950.00, 14.0, 1.3, 12, "Blue");

        for (int i=0; i< 5; i++) {
            devices.addDevice(device[i]);
        }
    }


    @Test
    @DisplayName(" addDeviceTest is working")
    void addDeviceTest() {
        //check size
        assertEquals(5,devices .size());
        //can't add null
        assertFalse(devices.addDevice(null));
        //can't add duplicate
        assertFalse(devices.addDevice(device[1]));
        //can add new one employee
        GeneralDevice newDev = new SmartPhone(6, "Samsung", "Galaxy S21", 8, true, 799.00, "Android", true, 64);
        assertTrue(devices.addDevice(newDev));
        //check size
        assertEquals(6,devices.size());
        //can't add one more
        GeneralDevice nextDev = new Computer(7, "Apple", "Mac Pro", 32, false, 2500.00, "Desktop", "AMD Radeon Pro W5700X");
        assertFalse(devices.addDevice(nextDev));
    }

    @Test
    void removeDeviceTest() {
        //can remove existed
        assertEquals(device[2], devices.removeDevice(123_456_73L));
        //check size
        assertEquals(4,devices.size());
        //can't remove absent
        assertNull(devices.removeDevice(123_456_78L));
    }

    @Test
    void findDeviceTest() {
        //find existed
        assertEquals(device[4],devices.findDevice(123_456_75L));
        //find absent
        assertNull(devices.findDevice(123_456_78L));
    }

    @Test
    void sizeTest()  {
        assertEquals(5, devices.size());

    }

    @Test
    void printDeviceTest() {
        devices.printDevice();
    }
}//end of class