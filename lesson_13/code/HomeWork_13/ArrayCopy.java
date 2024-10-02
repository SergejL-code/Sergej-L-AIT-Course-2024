package HomeWork_13;

public class ArrayCopy  {
    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4, 5, 6};
        int newLength = 3;

        int[] copiedArray = copyOfArray(array, newLength);
        printArray(copiedArray); // Вывод: {0, 1, 2}
    }

    public static int[] copyOfArray(int[] original, int newLength) {
        // Создаём новый массив заданной длины
        int[] newArray = new int[newLength];

        // Копируем элементы из оригинального массива
        for (int i = 0; i < newLength && i < original.length; i++) {
            newArray[i] = original[i];
        }

        return newArray;
    }

    public static void printArray(int[] array) {
        System.out.print("{");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }
}


