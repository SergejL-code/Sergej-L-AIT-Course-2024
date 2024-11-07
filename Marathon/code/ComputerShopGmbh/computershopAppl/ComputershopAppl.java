package ComputerShopGmbh.computershopAppl;


import ComputerShopGmbh.model.Computer;
import ComputerShopGmbh.model.GeneralDevice;
import ComputerShopGmbh.model.Laptop;
import ComputerShopGmbh.model.SmartPhone;

public class ComputershopAppl {
    public static void main(String[] args) {

    GeneralDevice[] device = new GeneralDevice[5];




        device[0] = new Computer(123_456_71L, "Dell", "XPS 8930", 16, false, 1200.00, "Tower", "NVIDIA GTX 1660");

        device[1] = new Laptop(123_456_72L, "HP", "Pavilion 15", 8, true, 800.00, 15.6, 1.75, 10, "Silver");
        device[2] = new SmartPhone(123_456_73L, "Apple", "iPhone 12", 4, false, 999.00, "iOS", true, 12);
        device[3] = new Computer(123_456_74L, "Lenovo", "ThinkCentre M720", 16, true, 1100.00, "Mini Tower", "AMD Radeon RX 560");
        device[4] = new Laptop(123_456_75L, "Asus", "ZenBook 14", 8, false, 950.00, 14.0, 1.3, 12, "Blue");
        for (GeneralDevice dev : device) {

        };



    }
}//end of class
