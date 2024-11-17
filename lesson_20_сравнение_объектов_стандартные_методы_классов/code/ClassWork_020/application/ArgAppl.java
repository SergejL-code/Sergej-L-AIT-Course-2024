package ClassWork_020.application;

public class ArgAppl {
    public static void main(String[] args) {
//метод main получает аргументы
        //String[] args -это массив данных типа String,args - это имя массива
        // Check if at least two arguments are provided
        if (args.length < 2) {
            System.out.println("Error: Please provide at least two arguments.");
        } else {
            String str1 = args[0];
            // int n1 = Integer.parseInt(str1);

            String str2 = args[1];
            //  int n2 =Integer.parseInt(str2);
            //System.out.println(str1 + " * " + str2 + " = " + n1 * n2);
            System.out.println(str1 + " , " + str2);
        }
    }//end of main

}//end of class
