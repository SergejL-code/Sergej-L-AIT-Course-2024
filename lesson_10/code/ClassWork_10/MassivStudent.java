package ClassWork_10;

//Создайте массив, который содержит возраст студентов группы.
//- какой возраст максимальный?
//- какой возраст минимальный?

public class MassivStudent {
    public static void main(String[] args) {
        int[] studentAges = {47, 49, 37, 47, 52, 60, 44, 34, 38, 59, 18, 38, 41, 35, 43};
        int min = studentAges[0];
        int max = studentAges[0];
        for (int i = 0; i < studentAges.length; i++) {
            if (studentAges[i] < min) {
                min = studentAges[i];
            }

        }for (int i = 0; i < studentAges.length; i++) {
            if (studentAges[i] > max) {
                max = studentAges[i];
            }
        }
        System.out.println("min Age = " + min + " Max Age " + max);
    }
}
