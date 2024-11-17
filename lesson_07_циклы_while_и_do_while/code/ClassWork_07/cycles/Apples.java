package ClassWork_07.cycles;

//Задача о яблоках (начальное значение 30 яблок).
// Запустить цикл, в котором яблоки берутся из корзины до тех пор,
// пока они там есть. Последнее сообщение: "Яблоки кончились!".

public class Apples {
    public static void main(String[] args) {

        int apples = 30;// начальное значение
        int count = 0;// parametr of zikl
        int startApples = 30;

        while (count < startApples) {

            System.out.println("Take one apple form the basket.");
            apples = apples - 1;
            count = count + 1;// bis 30(  aber letzte zickle 29)
            System.out.println("Now we have only: " + startApples + "apples in the basket.");
        }
        System.out.println("The job is done!" + count +" apples added in the pie.");
    }//end of main


}//end of class
