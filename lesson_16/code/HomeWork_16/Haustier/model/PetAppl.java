package HomeWork_16.Haustier.model;

public class PetAppl {
    public static void main(String[] args) {

        // Creating Pet Class Features with Unique Identifiers, Animal Species, Ages, and Names

        Pet tier_1 = new Pet(01,"Cat",2,"NN1");
        Pet tier_2 = new Pet(02,"Cat",10,"NN2");
        Pet tier_3 = new Pet(03,"Dog",1,"NN3");
        Pet tier_4 = new Pet(04,"Snake",5,"NN4");
        Pet tier_5 = new Pet(05,"Bull",5,"NN5");
        Pet tier_6 = new Pet(06,"Dog",7,"NN6");

        //Information data about all Pet objects on the screen

        System.out.println(tier_1);
        System.out.println(tier_2);
        System.out.println(tier_3);
        System.out.println(tier_4);
        System.out.println(tier_5);
        System.out.println(tier_6);
        System.out.println("---------------------------------------------------------");

// coll of Methods actions for animals

            tier_1.sleep();
            tier_2.play();
            tier_1.play();
            tier_3.make();
            tier_4.walk();
            tier_5.sleep();
    }

}//ed of class
