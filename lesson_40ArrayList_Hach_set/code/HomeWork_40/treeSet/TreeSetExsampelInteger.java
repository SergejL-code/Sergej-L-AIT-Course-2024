package HomeWork_40.treeSet;

import java.util.TreeSet;

public class TreeSetExsampelInteger {
    public static void main(String[] args) {
        // Создание TreeSet для хранения целых чисел
        TreeSet<Integer> numbers = new TreeSet<>();

        // Добавление элементов
        numbers.add(10);
        numbers.add(5);
        numbers.add(20);
        numbers.add(15);
        numbers.add(7);

        // Попытка добавления дублирующего элемента
        numbers.add(10);  // Этот элемент не добавится, так как он уже существует

        // Печать всех элементов TreeSet (будут в отсортированном порядке)
        System.out.println("TreeSet: " + numbers);

        // Проверка на содержание элемента
        System.out.println("Contains 7? " + numbers.contains(7));
        System.out.println("Contains 100? " + numbers.contains(100));

        // Получение первого и последнего элемента
        System.out.println("First element: " + numbers.first());
        System.out.println("Last element: " + numbers.last());

        // Получение элемента, большего чем 10
        System.out.println("Element higher than 10: " + numbers.higher(10));

        // Получение элемента, меньшего чем 10
        System.out.println("Element lower than 10: " + numbers.lower(10));

        // Извлечение и удаление первого и последнего элемента
        System.out.println("Polling first element: " + numbers.pollFirst());
        System.out.println("Polling last element: " + numbers.pollLast());

        // Печать TreeSet после удаления элементов
        System.out.println("TreeSet after polling: " + numbers);

        // Получение подмножества
        TreeSet<Integer> subset = new TreeSet<>(numbers.subSet(5, 15));
        System.out.println("Subset from 5 to 15: " + subset);

        // Размер TreeSet
        System.out.println("Size of TreeSet: " + numbers.size());

        // Проверка на пустоту
        System.out.println("Is TreeSet empty? " + numbers.isEmpty());

    }

}
