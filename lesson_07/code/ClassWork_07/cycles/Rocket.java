package ClassWork_07.cycles;


// Запустить обратный отсчет старта ракеты от 10 до 0.
//Последнее сообщение: "Поехали!...".


public class Rocket {
    public static void main(String[] args) {

        int countDown = 10;// задаем начальные условия
        System.out.println("We have " + countDown + "sec befor start.");

        while (countDown > 0) {
            countDown--;
            System.out.println("We have " + countDown + " sec till start.");
        }

        System.out.println("Here we go!...");
    }//end of main


}//end of class
