package ClassWork_015;

//Вставьте в строку дату полета Гагарина в виде:
//"Дата полета Гагарина в космос: число – месяц – год." и напечатайте ее в консоли.
//Используйте String.format()
public class GagarinStringFormat {
    public static void main(String[] args) {

        int day = 12;
        String month = "April";
        int year = 1961;
        String gagarinDay = String.format("Дата полета Гагарина в космос: %d : %s : %d",day,month,year);
        System.out.println(gagarinDay);
    }
}
