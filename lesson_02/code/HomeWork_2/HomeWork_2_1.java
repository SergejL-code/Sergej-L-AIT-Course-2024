package HomeWork_2;

public class HomeWork_2_1 {
    public static void main(String[] args) {                            //start of main

        method1();                                                      // method mian calls method 1
    }                                                                  //end off main

    public static void method1(){
        System.out.println("Method 1 start");

        method2();                                                      //    method 1 calls method 2

        System.out.println("Method 1 Ende!");
    }                                                                   //    method 1 finish
    public static  void method2(){

        System.out.println("Method 2 start");

        method3();                                                      // method 2 calls method 3

        System.out.println("Method 2 Ende!");
    }                                                                   // method 2 finisch
    public static void method3(){
        System.out.println("Method 3 start!");
        System.out.println("Method 3 ende");

    }                                                                   // method 3 finisch

}//end of class
