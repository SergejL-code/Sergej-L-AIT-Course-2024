package HomeWork_22.arrays_random_100;

public class ArraysPlusMinusEvenNumbers {


    int[] numbers = fillArray(-10, 10, 100);




    public static int[] fillArray(int a, int b, int n) {
        int[] res = new int[n];
        for (int i = 0; i < res.length; i++) {
            res[i] = (int) (Math.random() * (b - a + 1) + a);
        }
        return res;
    }
}
