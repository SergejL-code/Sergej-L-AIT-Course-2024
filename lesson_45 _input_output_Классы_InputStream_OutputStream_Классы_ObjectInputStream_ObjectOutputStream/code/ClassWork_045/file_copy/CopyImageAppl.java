package ClassWork_045.file_copy;
/*пишем утилиту для копирования файла
имена фаилов передаются в аргументах командной строки*/


import java.io.*;

public class CopyImageAppl {
    /*CopyImageAppl — основной класс, а метод main — это точка входа программы. Переменная String[] args представляет собой массив аргументов командной строки, переданных при запуске программы.*/

    public static void main(String[] args) {
        //String[] args - он отвечает за получение аргументов
        //проверяем  количества аргумента, что аргумента два
        if (args.length != 2) {  // Если их меньше или больше, выводится сообщение о неправильном количестве аргументов.
            System.out.println("Wrong numbers of arguments.");
        }
        // выводим имена файлов
        System.out.println("Source file: " + args[0]);//содержит имя исходного файла
        System.out.println("Distination file: " + args[1]);//имя целевого файла.

        // читать из файла пока != -1,пишем во 1-й фаил

        // открывает исходный файл на чтение.
        try (FileInputStream fin = new FileInputStream(args[0])) {
            //открывает целевой файл на запись.
            FileOutputStream fout = new FileOutputStream(args[1]);
            int a = fin.read(); // читаем первый байт из исходного файла и сохраняет его в переменной a
            while(a!=-1){// Если конец файла еще не достигнут, то fin.read() возвращает значение от 0 до 255, соответствующее прочитанному байту. Если файл закончился, read() вернет -1
                fout.write(a);//записывает прочитанный байт в целевой файл.
                a=fin.read();
            }

        } catch (FileNotFoundException e) {// исключение, возникающее, если один из файлов не найден.
            throw new RuntimeException(e);
        } catch (IOException e) {//общее исключение ввода-вывода, которое может возникнуть при работе с файлами.
            throw new RuntimeException(e);//Если возникает одно из этих исключений, оно выбрасывается как RuntimeException, и программа завершает свою работу.
        }

    }//end of main
}//end of class
