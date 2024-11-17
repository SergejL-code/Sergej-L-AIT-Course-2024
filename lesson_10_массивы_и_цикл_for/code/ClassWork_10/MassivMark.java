package ClassWork_10;

//Имеются оценки абитуриента из его аттестата
//Найдите средний балл абитуриента.

public class MassivMark {
    public static void main(String[] args) {
        int[] marks = {1, 6, 1, 4, 3, 1, 2, 3, 3, 2, 5, 2}; // обьявление массива в явном виде
        int sum = 0;
        for (int i = 0; i < marks.length; i++) {
            sum = sum + marks[i];

        }
        System.out.println("Sum = " + sum);
        double averageMark = (double) sum / marks.length; // with (double) is casting
        System.out.println("Average mark = " + averageMark);
    }
}