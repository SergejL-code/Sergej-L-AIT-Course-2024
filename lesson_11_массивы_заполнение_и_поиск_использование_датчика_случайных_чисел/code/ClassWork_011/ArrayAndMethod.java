package ClassWork_011;

//# Задача 3 (*).
//Написать метод, принимающий массив целых чисел, и возвращающий среднее арифметическое
//всех его элементов.
//Проверьте его работу на массиве ageOfGroup = {47, 49, 37, 47, 52, 60, 44, 34, 38, 59, 18, 38, 35, 41, 18, 43};

public class ArrayAndMethod {
    public static void main(String[] args) {
        int[] ageOfGroup = {47, 49, 37, 47, 52, 60, 44, 34, 38, 59, 18, 38, 35, 41, 18, 43};

        //call of Method
        double mittelAge  = mittelAge(ageOfGroup);
        System.out.println(mittelAge);
    }

    //Method
    private static double mittelAge(int [] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = (sum + array[i]);
        }
        return (double)sum / array.length;
    }
}
