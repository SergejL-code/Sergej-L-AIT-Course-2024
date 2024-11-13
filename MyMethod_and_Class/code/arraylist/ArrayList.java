package arraylist;

import java.util.Arrays;

public class ArrayList {


    public class MyArrayList<T> {
        private Object[] elements;
        private int size;
        private static final int DEFAULT_CAPACITY = 10;

        public MyArrayList() {
            elements = new Object[DEFAULT_CAPACITY];
            size = 0;
        }

        public void add(T element) {
            ensureCapacity();
            elements[size++] = element;
        }

        public T get(int index) {
            if (index < 0 || index >= size) {
                throw new IndexOutOfBoundsException("Индекс вне диапазона");
            }
            return (T) elements[index];
        }

        public void remove(int index) {
            if (index < 0 || index >= size) {
                throw new IndexOutOfBoundsException("Индекс вне диапазона");
            }
            for (int i = index; i < size - 1; i++) {
                elements[i] = elements[i + 1];
            }
            elements[--size] = null; // Очистка последнего элемента
        }

        public int size() {
            return size;
        }

        private void ensureCapacity() {
            if (size == elements.length) {
                elements = Arrays.copyOf(elements, elements.length * 2);
            }
        }

//        public static void main(String[] args) {
//            MyArrayList<Integer> myList = new MyArrayList<>();
//
//            // Добавление элементов
//            for (int i = 1; i <= 20; i++) {
//                myList.add(i);
//            }
//
//            // Вывод элементов
//            System.out.println("Элементы в списке:");
//            for (int i = 0; i < myList.size(); i++) {
//                System.out.print(myList.get(i) + " ");
//            }
//
//            // Удаление элемента по индексу
//            myList.remove(5); // Удаляем элемент с индексом 5 (шестой элемент)
//
//            System.out.println("\nПосле удаления элемента с индексом 5:");
//            for (int i = 0; i < myList.size(); i++) {
//                System.out.print(myList.get(i) + " ");
//            }
//        }
    }
}
