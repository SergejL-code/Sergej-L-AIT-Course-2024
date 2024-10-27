package ComputerShopGmbh.deviceAppl;


import Archive.model.Doku;
import ComputerShopGmbh.dao.DeviceImpl;
import ComputerShopGmbh.model.Computer;
import ComputerShopGmbh.model.GeneralDevice;
import ComputerShopGmbh.model.Laptop;
import ComputerShopGmbh.model.SmartPhone;

public class DeviceAppl {
    public static void main(String[] args) {

        // Создаем экземпляр DeviceImpl с вместимостью 6

        DeviceImpl deviceImpl = new DeviceImpl(6);

        deviceImpl.addDevice(new Computer(123_456_71L, "Dell", "XPS 8930", 16, false, 1200.00, "Tower", "NVIDIA GTX 1660"));
        deviceImpl.addDevice(new Laptop(123_456_72L, "HP", "Pavilion 15", 8, true, 800.00, 15.6, 1.75, 10, "Silver"));
        deviceImpl.addDevice(new SmartPhone(123_456_73L, "Apple", "iPhone 12", 4, false, 999.00, "iOS", true, 12));
        deviceImpl.addDevice(new Computer(123_456_74L, "Lenovo", "ThinkCentre M720", 16, true, 1100.00, "Mini Tower", "AMD Radeon RX 560"));
        deviceImpl.addDevice(new Laptop(123_456_75L, "Asus", "ZenBook 14", 8, false, 950.00, 14.0, 1.3, 12, "Blue"));
        deviceImpl.printDevice();


        System.out.println(deviceImpl.size());
       Computer newDev = new Computer(123_456_77L, "Asus", "Vivobook", 16, true, 1100.00, "Mini ", "Geforce");
        System.out.println("=======================================================================================");
        deviceImpl.addDevice(newDev);
        deviceImpl.printDevice();
        System.out.println(deviceImpl.size());
        System.out.println("=======================================================================================");
        deviceImpl.removeDevice(123_456_74L);
        deviceImpl.printDevice();
        System.out.println(deviceImpl.size());
        System.out.println("=====================================================");
        deviceImpl.findDevice(123_456_72L);
        deviceImpl.printDevice();



    }
}//end of class
