package ClassWork_05;
//Проверка положительное или отрицательное число.
//Проверка четное или нечетное целое число.
//Проверка возраста. Если пользователю 18 лет и менее, то сообщить "Вам надо
//прийти вместе с вашим опекуном", иначе сообщить "Вам разрешено действовать самостоятельно".


public class ConditionsExsample {
    public static void main(String[] args) {

//не полный  условный оператор
        int x = 158;

        if (x >= 0) {
            System.out.println("x = " + x + " is positiv number");

        }

        if (x < 0) {

            System.out.println("x = " + x + " is negativ number");
        }


        // полный условный оператор

        x = -234;

        if (x >= 0){
            System.out.println("x = " + x + " is positiv number");
        }else {

            System.out.println("x = " + x + " is negativ number");

        }

    //Проверка четное или нечетное целое число.

        x = 13;

        if( x % 2 == 0 ){
            System.out.println(" x = " + x + "is even");
        }else{
            System.out.println(" x = " + x + " is odd");
        }

        //

        int age = 16;
        if(age >= 18){
            System.out.println("Вам разрешено действовать самостоятельно" );
        } else {
            System.out.println("Вам надо прийти вместе с вашим опекуном");
        }

    }//end of main


}//end of class
