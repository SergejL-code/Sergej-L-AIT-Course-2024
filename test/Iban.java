public class Iban {

    // Метод для получения длины IBAN-кода
    public int lengthCode(String code) {
        return code.length();
    }

    // Метод для получения суммы ASCII-кодов первых двух символов
    public int controlCode(String code) {
        if (code.length() < 2) {
            throw new IllegalArgumentException("IBAN code should have at least 2 characters.");
        }
        // Получаем ASCII-коды первых двух символов и их сумму
        return (int) code.charAt(0) + (int) code.charAt(1);
    }

    // Метод для проверки корректности длины IBAN-кода для Германии
    public boolean isValid(String code) {
        // В Германии длина IBAN-кода всегда 22 символа
        return code.length() == 22;
    }

    public static void main(String[] args) {
        Iban iban = new Iban();

        // Пример использования методов
        String testCode = "DE89370400440532013000"; // Пример IBAN-кода для Германии

        // Вывод длины кода
        System.out.println("Length: " + iban.lengthCode(testCode));

        // Вывод суммы ASCII-кодов первых двух символов
        System.out.println("Control code: " + iban.controlCode(testCode));
//
        System.out.println();
        // Проверка валидности кода
        System.out.println("Is valid: " + iban.isValid(testCode));
    }
}

