package HomeWork_39.courses;

import java.util.*;

public class Curses {
    public static void main(String[] args) {
        List<String> mathematics = Arrays.asList("Иван", "Мария", "Анна", "Петр","Юлия","Николай");
        List<String>computerscience =Arrays.asList("Анна", "Елена", "Петр", "Дмитрий","Николай");


        System.out.println("***************************************** Variant 1 *******************************************************************");

        System.out.println("A list of students who are registered for only one of the course" + findOneCurses(mathematics,computerscience));

        System.out.println("A list of students who are registered for both courses" + findBothCourses(mathematics,computerscience) );

        System.out.println("***************************************** Variant2 ******************************************************************");

        Set<String> intersection = new HashSet<>(mathematics);
        intersection.retainAll(computerscience); // Оставляем только общие элементы

        Set<String> difference = new HashSet<>(mathematics); // Копируем элементы set1
        difference.removeAll(computerscience); // Удаляем элементы, которые также есть в set2

        Set<String>difference_1 = new HashSet<>(computerscience);
        difference_1.removeAll(mathematics);
        
        System.out.println("registered for both courses :" + intersection);
        System.out.println("registered for only one of the course mathematics" + difference);
        System.out.println("registered for only one of the course computerscience" + difference_1);

    }

    private static List<String> findOneCurses(List<String> mathematics, List<String> computerscience) {
        
        List<String> oneCourse = new ArrayList<>();
        HashSet<String> math = new HashSet<>(mathematics);
        HashSet<String> comp = new HashSet<>(computerscience);
        for (String s : comp) {
            if(!math.contains(s)){
                oneCourse.add(s);
            }
                }
        for (String s1 :math) {
                    if(!comp.contains(s1)){
                        oneCourse.add(s1);
            }
        }
        return oneCourse;
        }
        



    private static List<String> findBothCourses(List<String> mathematics, List<String> computerscience) {
        List<String> bothCourses = new ArrayList<>();

        HashSet<String> math = new HashSet<>(mathematics);

        for (String m : computerscience) {
            if (math.contains(m)) {
                bothCourses.add(m);
            }
        } //if there are no registered participants
        if (bothCourses.isEmpty()) {
            System.out.println("no registered participants");
            return null;
        }
        return bothCourses;
    }

}//end of class
