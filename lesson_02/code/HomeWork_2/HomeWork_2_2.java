package HomeWork_2;

public class HomeWork_2_2 {
    public static void main(String[] args) {

        turnip();

    }                                                                                           //end of main

public static void turnip(){
    System.out.println("Выростил дед репку.");

    grandfather();                                                                             // pulling turnips





}
    public static void grandfather(){
        System.out.println("Тянет репку, вытянуть не может.Зовёт бабку.");

        grandmother();                                                                         //  calls grandmother
    }
    public static void grandmother(){
        System.out.println("Тянут репку, вытянуть не могут.Зовёт бабка жучку.");

        dog();                                                                                  // calls dog
    }

    public static void dog(){
        System.out.println("Тянут репку, вытянуть не могут.Зовёт жучка кошку.");

        cat();                                                                              // calls cat
    }
    public static void cat(){
        System.out.println("Тянут репку, вытянуть не могут.Зовёт кошка мышку.");

        mouse();                                                                             // calls mouse
    }
    public static void mouse(){
        System.out.println("Тянут репку, вытянули!");
    }



}                                                                                               //end of class
