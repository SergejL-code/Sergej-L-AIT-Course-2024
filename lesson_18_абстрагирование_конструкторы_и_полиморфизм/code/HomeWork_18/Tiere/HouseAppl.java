package HomeWork_18.Tiere;

import HomeWork_18.Tiere.modele.Cats;
import HomeWork_18.Tiere.modele.Dogs;
import HomeWork_18.Tiere.modele.Pet;

public class HouseAppl {
    public static void main(String[] args) {


        Pet[] tiere = new Pet[5];
        tiere[0] = new Dogs(001, "dog", 3, "Bruno", "Labrador Retriever", 60, 30);
        tiere[1] = new Dogs(002, "dog", 5, "Luna", "German Shpherd", 65, 35);
        tiere[2] = new Cats(003, "cat", 2, "Mia", "Persian", 25, 4);
        tiere[3] = new Cats(004, "cat", 3, "Nusha", "Maine Coon", 35, 8);
        tiere[4] = new Cats(005, "cat", 4, "Simba", "Bengal", 30, 6);

        // call of Methods actions for animals


        System.out.println(tiere[0]);
        tiere[0].voiceDogs();
        System.out.println("============================================================================================");
        System.out.println(tiere[1]);
        tiere[1].sleep();
        System.out.println("=============================================================================================");
        System.out.println(tiere[2]);
        tiere[2].voiceCats();
        System.out.println("===============================================================================================");
        System.out.println(tiere[3]);
        tiere[3].play();
        System.out.println("===================================================================================================");

        System.out.println(tiere[4]);
        tiere[4].voiceCats();



    }
    //Information data about all Pet objects on the screen


}
