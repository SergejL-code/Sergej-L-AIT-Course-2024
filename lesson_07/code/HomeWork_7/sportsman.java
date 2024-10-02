package HomeWork_7;

public class sportsman {
    public static void main(String[] args) {
        double s = 5;
        double target = 10;
        int count = 0;

        while(s < target) {
            s = s + s * 0.1;
            System.out.println("s = " + s);
            count++;
        }

        System.out.println("Runner needed " + count + " days to reach target " + target + " km.");
    }

}
