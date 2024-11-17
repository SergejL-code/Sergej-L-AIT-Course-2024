package HomeWork_43.students;
/*. Имеется набор оценок 20 студентов в диапазоне от 5 до 1 балла за семестр по 10 предметам. Смоделируйте этот набор данных, найдите студентов с максимальным/минимальным средним баллом. Используйте методы stream()*/
import java.util.Random;
import java.util.stream.Stream;
public class StudentsAppL {
    private static final int MINNOTE = 1;
    private static final int MAXNOTE = 5;
    private static final int FACH= 10;
    public static void main(String[] args) {


        Stream<Integer>fachNote = getRandomNumbers(MINNOTE, MAXNOTE + 1, FACH);
        System.out.println(fachNote);
    }

    private static Stream<Integer> getRandomNumbers(int minnote, int maxnote, int fach) {
        return  new Random()
                .ints(fach,minnote,maxnote)
                .boxed();

    }//end of main
}//end of class
