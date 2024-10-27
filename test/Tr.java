public class Tr {

        public static void main(String[] args) {
            // Исходный массив
            int[] originalArray = {1, 2, 3, 4, 5};

            // Вставляем новое число в новый массив
            int newElement = 99;  // Число, которое добавим
            int[] newArray = copyArrayWithExtraElement(originalArray, newElement);

            // Вывод нового массива
            System.out.print("Массив после добавления элемента: ");
            for (int i : newArray) {
                System.out.print(i + " ");
            }
        }

        // Метод для копирования массива с добавлением нового элемента
        public static int[] copyArrayWithExtraElement(int[] source, int newElement) {
            // Создаем новый массив на 1 элемент больше, чем исходный
            int[] newArray = new int[source.length + 1];

            // Копируем все элементы исходного массива в новый массив
            for (int i = 0; i < source.length; i++) {
                newArray[i] = source[i];
            }

            // Добавляем новый элемент в конец массива
            newArray[source.length] = newElement;

            return newArray;
        }

}
