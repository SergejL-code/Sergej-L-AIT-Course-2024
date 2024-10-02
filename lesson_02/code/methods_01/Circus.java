package methods_01;

public class Circus {                                                       //start of main
    public static void main(String[] args) {

       lightsOn();
       entertainer();                                                           // main calls entertainer
       lightsOff();
    }                                                                          // End of main

    public static void lightsOn(){
        System.out.println("Licht Annn..!!");
    }                                                                       // end of LightsOn
    public static void lightsOff(){
        System.out.println("Licht Aus!!!");;
    }

    public static  void entertainer(){

        jogger();                                                           // entertainer calls jogger
        cloun();                                                            // entertainer calls cloun
        singer();
    }
    public static void jogger(){
        System.out.println("I´m jogging...");                               // start jogger
    }                                                                       // ned jogger
    public static void cloun(){
        System.out.println("I´m jocking..");
    }
    public static void singer(){
        System.out.println("I´m singen");
    }
}//end of class
