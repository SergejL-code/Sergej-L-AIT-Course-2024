package ClassWork_045.file_copy;
/*пишем утилиту для копирования файла
имена фаилов передаются в аргументах командной строки*/


import java.io.*;

public class CopyImageAppl {
    public static void main(String[] args) {
        //String[] args - он отвечает за получение аргументов
        //проверяем, что аргумента два
        if (args.length != 2) {
            System.out.println("Wrong numbers of arguments.");
        }
        //drücken die Name der Fail aus
        System.out.println("Source file: " + args[0]);
        System.out.println("Distination file: " + args[1]);

        // читать из файла пока != -1,пишем во 1-й фаил
        try (FileInputStream fin = new FileInputStream(args[0])) {
            FileOutputStream fout = new FileOutputStream(args[1]);
            int a = fin.read(); // читаем первый байт
            while(a!=-1){
                fout.write(a);
                a=fin.read();
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }//end of main
}//end of class
