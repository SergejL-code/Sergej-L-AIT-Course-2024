package HomeWork_37.athletes_protocol;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AthletsAppl {
    public static void main(String[] args) {
//great a list of Athlet
        List<Athlet> athletList = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        int numAthlets = 10;


        for (int i = 0; i < numAthlets; i++) {
            System.out.printf("\n Введите данные для спортсмена %d:%n",i+1);
            System.out.print("Фамилия: ");
            String lastName = scanner.nextLine();
            System.out.print("Имя: ");
            String firstName = scanner.nextLine();
            System.out.print("Регистрационный номер: ");
            String regNumber = scanner.nextLine();
            System.out.print("Клуб: ");
            String clubName= scanner.nextLine();
            System.out.print("Результат (в секундах и десятых): ");
            double result = scanner.nextDouble();
            scanner.nextLine();

            athletList.add(new Athlet(lastName, firstName, regNumber, clubName, result));
        }
    }
}
