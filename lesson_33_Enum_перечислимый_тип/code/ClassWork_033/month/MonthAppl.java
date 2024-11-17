package ClassWork_033.month;

public class MonthAppl {
    public static void main(String[] args) {

        Month m = Month.AUG;
        System.out.println("Start month:" + m);
        int k = 29;
        m = m.plusMonth( k);
        System.out.println(" After " + k + " months: " + m);//gees Feb

    }//end of main
}//end of class
