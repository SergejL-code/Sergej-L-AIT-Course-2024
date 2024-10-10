package ClassWork_021.arrays_tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ArrayTddTest {
    // Declare a reference for the ArrayTdd class
    // Объявление ссылки на класс ArrayTdd

    ArrayTdd arrayTdd;
    // Initialize an integer array with some positive and negative numbers
    // Инициализация массива целых чисел с положительными и отрицательными числами

    int[] array = {10, -5, 15, -8, 2, 45, 4};// 5 positive numbers

    /**
     * This method is called before each test case is run.
     * It initializes the ArrayTdd object and passes the 'array' to its constructor.
     */
    /**
     * Этот метод выполняется перед каждым тестом.
     * Он инициализирует объект ArrayTdd и передает в него массив через конструктор.
     */
    @BeforeEach
    void setUp() {
        // Instantiate ArrayTdd class with the test array using its constructor
        // Создание объекта ArrayTdd с тестовым массивом через конструктор

        arrayTdd = new ArrayTdd(array);//nimm constructor  aus ArrayTdd
    }

    /**
     * Test method for countPositive().
     * This test checks if the countPositive method correctly counts the number of positive numbers in the array.
     */
    /**
     * Тестовый метод для проверки countPositive().
     * Этот тест проверяет, правильно ли метод countPositive подсчитывает количество положительных чисел в массиве.
     */
    @Test
    void countPositive() {

        // Expected value: 5 positive numbers in the array
        // Ожидаемое значение: 5 положительных чисел в массиве
        int expected = 5;

        // Actual value: Call the countPositive method and get the actual count
        // Фактическое значение: вызов метода countPositive и получение реального результата

        int actual = arrayTdd.countPositive(array);

        // Compare the expected and actual results, with a custom failure message "Bed info"
        // Сравнение ожидаемого и реального результата, с кастомным сообщением об ошибке "Bad info"
        assertEquals(expected, actual, "Bad info");
    }

}//end of class