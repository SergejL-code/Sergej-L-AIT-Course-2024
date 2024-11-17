package ClassWork_07.cycles;

public class Apples_2 {
    public static void main(String[] args) {
        int apples = 30;
        //int count = 0;

        while (apples >= 0)
        {
            System.out.println("В корзине " + apples + "яблок");
            apples = apples - 1;
            System.out.println("бери еще");
        }

        System.out.println("Яблоки кончились!");

    }

}






