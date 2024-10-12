package HomeWork_22.arrays_methods;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
// Declare a reference for the ArrayMethods class
class ArrayMethodsTest {
    ArrayMethods arrayMethods;
// Пример массива
    @BeforeEach
    void setUp() {
        arrayMethods = new ArrayMethods(arrayMethods.arrray);// Инициализируем ArrayMethods с массивом probe
    }

    @Test
    void sumOfAllElementsWithOddIndex() { //18
        int expectedSum=18;
        int actual =ArrayMethods.sumOfAllElementsWithOddIndex(arrayMethods.arrray);// Вызываем метод из ArrayMethods
        assertEquals(18,actual);
    }

    @Test
    void searchInArray() {
        int actual = ArrayMethods.searchInArray(arrayMethods.arrray);
        assertEquals(56, actual);// Проверяем индекс элемента 5 (должен быть 56)

    }

}//end of class