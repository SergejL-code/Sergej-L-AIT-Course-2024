package HomeWork_20.minimum_Maximum_Numeric_Values_of_Primitive_Type;
/* Напишите приложение, которое выводит минимальные/максимальные числовые значения примитивных типов: byte, short, char, int, long, float, double Типы как объекты String должны браться из аргументов основной функции main. Если в аргументах нет никакого типа (строка с аргументами пуста), приложение должно вывести максимальное/минимальное значения 7 типов (byte, int, short, long, char, float, double). Если аргументы содержат неправильный тип, приложение должно вывести сообщение: Неверный тип.*/

public class MaxMinValuePrimitiveNumbers {
        public static void main(String[] args) {
            // Если аргументов нет, выводим минимальные и максимальные значения для всех типов
            if (args.length == 0) {
                printByte();
                printShort();
                printInt();
                printLong();
                printChar();
                printFloat();
                printDouble();
            } else {
                // Проходим по каждому аргументу и проверяем тип
                for (String arg : args) {
                    if (arg.equalsIgnoreCase("byte")) {
                        printByte();
                    } else if (arg.equalsIgnoreCase("short")) {
                        printShort();
                    } else if (arg.equalsIgnoreCase("int")) {
                        printInt();
                    } else if (arg.equalsIgnoreCase("long")) {
                        printLong();
                    } else if (arg.equalsIgnoreCase("char")) {
                        printChar();
                    } else if (arg.equalsIgnoreCase("float")) {
                        printFloat();
                    } else if (arg.equalsIgnoreCase("double")) {
                        printDouble();
                    } else {
                        // Если аргумент не соответствует ни одному типу
                        System.out.println("Wrong type: " + arg);
                    }
                }
            }
        }

        // Методы для вывода минимальных и максимальных значений примитивных типов
        public static void printByte() {
            System.out.println("byte:");
            System.out.println("Min: " + Byte.MIN_VALUE);
            System.out.println("Max: " + Byte.MAX_VALUE);
            System.out.println("=================================================================");
        }

        public static void printShort() {
            System.out.println("short:");
            System.out.println("Min: " + Short.MIN_VALUE);
            System.out.println("Max: " + Short.MAX_VALUE);
            System.out.println("==================================================================");
        }

        public static void printInt() {
            System.out.println("int:");
            System.out.println("Min: " + Integer.MIN_VALUE);
            System.out.println("Max: " + Integer.MAX_VALUE);
            System.out.println("==================================================================");
        }

        public static void printLong() {
            System.out.println("long:");
            System.out.println("Min: " + Long.MIN_VALUE);
            System.out.println("Max: " + Long.MAX_VALUE);
            System.out.println("==================================================================");
        }

        public static void printChar() {
            System.out.println("char:");
            System.out.println("Min: " + (int) Character.MIN_VALUE);
            System.out.println("Max: " + (int) Character.MAX_VALUE);
            System.out.println("==================================================================");
        }

        public static void printFloat() {
            System.out.println("float:");
            System.out.println("Min: " + Float.MIN_VALUE);
            System.out.println("Max: " + Float.MAX_VALUE);
            System.out.println("==================================================================");
        }

        public static void printDouble() {
            System.out.println("double:");
            System.out.println("Min: " + Double.MIN_VALUE);
            System.out.println("Max: " + Double.MAX_VALUE);
        }


}//end of class
