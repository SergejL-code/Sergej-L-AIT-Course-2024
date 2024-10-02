package Fremd.homework_14.g_adler;

public class ArrayMethods {

// Метод для сортировки массива с использованием алгоритма selection sort
    //Алгоритм **Selection Sort** работает следующим образом:
            // - Для каждого элемента массива мы ищем минимальный элемент в несортированной части массива.
            // - После нахождения минимального элемента меняем его местами с текущим элементом.
            // - Проходим по всему массиву, и на каждой итерации минимальный элемент становится на свое место.
public static void selectionSort(int[] array) {
    int n = array.length;//где n это длина массива

    for (int i = 0; i < n - 1; i++) { // Вводим цикл for i, чтобы пройтись по всем элементам массива.
        // Находим индекс минимального элемента в несортированной части массива.
        int minIndex = i;
        for (int j = i + 1; j < n; j++) {//Вводим цикл for i, чтобы пройтись по массиву и найти минимальный элемент
            if (array[j] < array[minIndex]) {
                minIndex = j;
            }
        }
        // Меняем местами минимальный элемент с первым элементом
        int temp = array[minIndex];//вводим переменную замены temp
        array[minIndex] = array[i];
        array[i] = temp;
    }
}




    //27-09-2024
    // **пузырьковая сортировка (bubble sort)** - популярные задания на собеседованиях
           //- сравниваем всегда 2 соседних элемента, переставляем их местами, если они расположены не в порядке возрастания
           //- цикл должен идти слева направо
           //- упорядоченные элементы выключаются из цикла
//сортируем с помощью bubbleSort
public static void bubbleSort(int[] array){   //обычно в bubble sort делают метод типа void, просто, чтобы отразить массив. Использование этого типа метода не обязательно, но как правило. Для метода нам нужен int[] array - целочисленный массив

    for (int i = 0; i < array.length; i++) {
        for (int j = 0; j < array.length - 1 - i; j++) {//в ходе этого прохода мы хотим сравнить 2 рядом стоящих элемента-Т.к. нужен второй индекс (цикл в цикле) прога автоматом формирует индекс j. array.length - 1 - сравниваем с последним индексом массива, при этом не выпрыгивая из массива (поэтому длина -1). -i - этим мы не трогаем уже отсортированные элементы!!! которые отработали и 100% стоят на своем конечном индексе
            if (array[j] > array[j+1]){//сравниваем 2 элемента массива, если левый элемент больше правого, мы должны сделать swapping - замену
                int temp = array[j];
                array[j] = array[j+1];//левый элемент затираем правым
                array[j+1] = temp;//правому элементу нужно поставить темр
            }
        }
    }
}

//array turn around - меняем местами любые 2 элемента массива (мы можем поменять любой итый элемент на любой джитый)
// step 1 - method swap
public static void swap(int[] array, int i, int j){
    int temp = array[i];
    array[i] = array[j];
    array[j] = temp;
}

//методы замены и разворота всегда работают в паре!!!
//разворот массива
public static void reverseArray (int[] array){
    for (int i = 0, j = array.length - 1; i < j; i++, j--) {//i = 0 - левый конец, j = array.length - 1 - правый конец: идут навстречу к друг другу. i - увеличивается; j - уменьшается. До ";" - это зона локальных обьявлений (условий)!!! После ";" указаны условия изменения переменных
        swap(array, i, j);
    }
}

// Метод для нахождения добавленного числа
public static int findAddedNumber(int[] originalArray, int[] newArray) {// find Added Number - найти добавленный номер
    int sumOriginal = 0;
    int sumNew = 0;
        // Суммируем элементы исходного массива
        for (int num : originalArray) {
            sumOriginal += num;
        }
        // Суммируем элементы нового массива
        for (int num : newArray) {
            sumNew += num;
        }

        // Разница между суммами - это добавленное число
    return sumNew - sumOriginal;
}

// Метод для нахождения индекса добавленного числа в новом массиве
public static int findAddedNumberIndex (int[] newArrayNumbers, int addedNumber) {
        // Проходим по новому массиву и ищем индекс добавленного числа
    for (int i = 0; i < newArrayNumbers.length; i++) {
        if (newArrayNumbers[i] == addedNumber) {
                return i;
        }
    }
        return -1; // Вернем -1, если число не найдено, хотя это маловероятно
}


    //========================================================================================================
    //26-09-2024

    public static int[] copyOfArray (int[] array, int newLength ){//int[] array - массив целых чисел; int newLength - целое число - длина нового массива newLength

        int[] newArray = new int[newLength]; //Создаем новый массив нужной нам длины

        // Копируем элементы из исходного массива в новый

        for (int i = 0; i < newLength; i++) {
            newArray[i] = array[i];
        }
        return newArray;

    }//end of copyOfArray

    //binary search

    public static int binarySearch(int[] array, int n){
       int leftIndex = 0;//начало масива легко определяется это 0
       int rightIndex = array.length -1;//конечный индекс это длина массива -1

        while (leftIndex <= rightIndex) {//пока левый индекс меньше или равен правому, мы будем детить. while взяли, т.к. мы не знаем сколько раз будет выполняться условие, т.е. ПОКА условие будет выполнятся, цикл работает, а for мы знаем сколько раз будет проходить операция в цикле
            int midIndex = (leftIndex + rightIndex)/2;//середина это левый плюс правый индексы деленные на 2. эта переменная обязательно должна быть внутри цикла, т.к. постояно пересчитывается
            if (array[midIndex] == n){
                return midIndex;

            } else if (n < array[midIndex]) {
                rightIndex = midIndex - 1; //тогда правую половину нужно отбросить. -1 потому что мы идем на одну позицию левее
            }else {
                leftIndex = midIndex + 1; //иначе левую половину нужно отбросить. +1 потому что мы идем на одну позицию превее
            }
        }
        return -leftIndex-1; //если не нашлось. -leftIndex отрицательный, если элемент не нашелся
    }


    //linear search, return index (if element absent return -1)

    public static int linearSearch (int[]array, int n){//если использовать void тогда придется что-то дополнительно выводить на экран, а int через return сам выводит, какую -либо инфу на экран
        for (int i = 0; i < array.length; i++) {
            if (array[i]  == n){
                return i;// i тот самый индекс, который нам нужен, первый попавшийся, хотя их может быть множество, т.е. как только if сработал, мы возвращаем индекс
            }
        }
        return -1; // go out from method, после писать что либо бесполезно, т.к. метод закончен
    }

//====================================================================================================================================================================
    //25-09-2024
    //fill array random numbers - заполнить массив случайными числами
    //a - left border, b - right border, n - quantity
    public static int[] fillArray(int a, int b, int n) {
        int[] res = new int[n];
        for (int i = 0; i < res.length; i++) {
            res[i] = (int) (Math.random() * (b - a + 1) + a); //будут случайно выпадать случайные числа в пределах диапазона А и В, включая и А и В
        }
        return res;
    }

    //print array, просто печатает и ничего не возвращает
    public static void printArray(int[] array) {//в этот метод отдадим целочисленный массив, который мы заполним (какой массив программа получит, такой и напечатает)
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();//пустая строка для перехода
        System.out.println("-------------------------------");
    }


    //search in array
    public static boolean searchInArray(int[] array, int n) {//n-целочисленное число
        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) {
                return true;//говорим, что это правда, если итое в массиве будет равен заданной переменной
            }
        }
        return false;//если for не срабатывает значит это фальшь. Этот return относится к методу, а не к циклу, поэтому return в нутри метода, но за пределами цикла for. return - это вывод резутьтата!
    }

//Задание 2. Дополните класс ArrayMethods методом calculatePercent,
//который получает массив данных об остатках на счетах пользователей банка и возвращает их с начисленными X процентами.
//Дополните класс ArrayMethods методом printArrayDouble(), который печатает массив данных типа double.
//В классе ArrayMethodsAppl создайте тестовый массив и вызовите для него метод calculatePercent,
//а затем распечатайте полученный результат.

    //calculatePercent. Который получает массив данных об остатках на счетах пользователей банка и возвращает их с начисленными X процентами.
    public static void calculatePercent(double[] accounts, double percent) {
        for (int i = 0; i < accounts.length; i++) {
            accounts[i] += accounts[i] * (percent / 100); // Добавляем процент
        }
    }

    //printArrayDouble(), который печатает массив данных типа double.
    public static void printArrayDouble(double[] array) {
        for (double value : array) {
            System.out.print(value + " ");
        }
        System.out.println(); // Переход на новую строку
    }

//Задание 3. Дополните класс ArrayMethods методами: sumArray(int[] array) - возвращает сумму всех элементов массива.
//averageValue(double[] array) - возвращает среднее арифметическое значение всех элементов массива.
//Вызовите и проверьте работу этих методов из класса ArrayMethodsAppl.

    // Метод для подсчета суммы всех элементов массива целых чисел
    public static int sumArray(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num; // Добавляем каждый элемент к сумме
        }
        return sum;
    }

    // Метод для подсчета среднего арифметического всех элементов массива
    public static double averageValue(double[] array) {
        if (array.length == 0) {
            return 0; // Если массив пустой, возвращаем 0
        }

        double sum = 0;
        for (double num : array) {
            sum += num; // Суммируем все элементы
        }
        return sum / array.length; // Возвращаем сумму, деленную на количество элементов
    }

}//end of class















