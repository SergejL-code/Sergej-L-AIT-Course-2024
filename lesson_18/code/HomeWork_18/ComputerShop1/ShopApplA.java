package HomeWork_18.ComputerShop1;


/*  In class work, create a Smartphone class that extends the Laptop class with a private long imei field.
In the Smartphone class, override the toString method.
In the main method, add the Smartphone object and print it to the console.*/


import HomeWork_18.ComputerShop1.model.ComputerA;
import HomeWork_18.ComputerShop1.model.LaptopA;
import HomeWork_18.ComputerShop1.model.Smartphone;

public class ShopApplA {
    public static void main(String[] args) {

        ComputerA computer_1 = new ComputerA("i7", 8, 256, "Acer", 845.25);
        System.out.println(computer_1);

        LaptopA laptop_1 = new LaptopA("M2", 8, 512, "Apple AirBook", 2200);
        System.out.println(laptop_1);
        Smartphone smartphone_1 = new Smartphone("Google Tensor G4", 12, 128, "Google", 799,546466555 );
        System.out.println(smartphone_1);




    }//end of main


}//end of class
