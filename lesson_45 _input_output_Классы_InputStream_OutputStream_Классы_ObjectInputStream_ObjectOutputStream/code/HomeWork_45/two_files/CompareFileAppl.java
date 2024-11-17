package HomeWork_45.two_files;
/*В классе CompareFileAppl реализовать логику сравнения двух файлов в методе main. Имена файлов принимать через массив args. Два файла считаем одинаковыми, если у них одинаковая длина, и на тех же позициях стоят те же байты. Результат должен быть выведен на консоль в виде сообщения.*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CompareFileAppl {
    public static void main(String[] args) {
//проверяем количество имен файлов в аргументах

        if (args.length != 2) {

//если их меньше двух или больше двух, то выводится сообщение на печать Wrong numbers of arguments

            System.out.println("Wrong numbers of arguments.");
        }

// печатаем имена сравниваемых файлов
        System.out.println("Source file: " + args[0]);//содержит имя исходного файла
        System.out.println("Distination file: " + args[1]);//имя целевого файла.

//сравниваем содержимое файлов
        // открывает исходный файл fin_1 на чтение
        try (FileInputStream fis_1 = new FileInputStream(args[0]);
             // открывает исходный файл fin_2 на чтение
             FileInputStream fis_2 = new FileInputStream(args[1])) {
            //присваиваем переменной filesIdentical с тимпом boolean значение true
            boolean filesIdentical = true;
            //инициализируем две переменных типа int для сравнения
            int byteFile1,byteFile2;

            while ((byteFile1 = fis_1.read()) != -1 && (byteFile2 = fis_2.read()) != -1) {// сравниваем по байтно
                    // если байты не совпадают
                if (byteFile1 != byteFile2) {
                    filesIdentical = false;
                    break;
                }
            }
      // Проверяем, если один файл не закончился раньше другого, после завершения цикла while,т.е.сравнивает ещё по длине
             if (fis_1.read() != -1 || fis_2.read() != -1){
                filesIdentical = false;
            } if (filesIdentical) {
                System.out.println("Files are identical.");
            } else {
                System.out.println("Files are different.");
            }
            System.out.println();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }//end of main
}//end of class
