package ClassWork_019.computershop_2;


/* Создать несколько экземпляров каждого класса.
 Какой общий объем памяти у всех устройств на складе?
Какова общая стоимость всех устройств на складе?*/



public class ShopAppl {
    public static void main(String[] args) {

       // Computer_2 computer_1 = new Computer_2("i7", 8, 256, "Acer", 845.25);
      //System.out.println(computer_1);

      //  Laptop_2 laptop_1 = new Laptop_2("M2", 8, 512, "Apple AirBook", 2200, 14, 2.5, 10, "black");
      //  System.out.println(laptop_1);

        Computer_2[] computers = new Computer_2[6];// typ Computer_2(это родительский класс
        computers[0] = new Computer_2("i7", 8, 256, "Acer", 845.25);
        computers[1] = new Computer_2("i5", 16, 512, "ASus", 1155);
        computers[2] = new Computer_2("AMD", 8, 256, "Acer", 845.25);//no casting
        computers[3] = new Laptop_2("M2", 8, 256, "MacBook", 2545.4, 14, 1.22, 10, "weiss");// down casting
        computers[4] = new Laptop_2("I9", 8, 1024, "Asus", 1000, 17, 1.6, 12, "silber");// down casting
        computers[5] = new Smartphone_2("A1", 128, 256, "Samsung", 1300, 9, 0.45, 12, "black", 46846465464543L);  // down casting

        double totalWeight = 0;
        for (int i = 0; i < computers.length; i++) {
            if (computers[i] instanceof Laptop_2) {
                Laptop_2 myLaptop = (Laptop_2) computers[i];  //upper casting
                totalWeight += myLaptop.getWeight();
            }
        }
        System.out.println("Total Weight " + totalWeight);

        System.out.println("===============================================================================");
        //totalSSD
        int totalSsd = 0;
        for (int i = 0; i < computers.length; i++) {
            totalSsd += computers[i].getSsd();
        }
        System.out.println("Total ssd: " + totalSsd);
        double totalPrice = 0;
        for (int i = 0; i < computers.length; i++) {
            totalPrice += computers[i].getPrice();

        }
        System.out.println("Total Price: " + totalPrice);
        System.out.println("===============================================================================================");
        for (int i = 0; i < computers.length; i++) {
            System.out.println(computers[i]);
        }
        for (int i = 0; i < computers.length; i++) {
            System.out.println(computers[i].getBrand());
        }

    }//end of main

}//end of class
