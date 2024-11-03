package HomeWork_37.athletes_protocol;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AthletsAppl {
    public static void main(String[] args) {

        List<Athlet> athletList = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        int numAthlets = 10;


        for (int i = 0; i < numAthlets; i++) {
            System.out.printf("\n Введите данные для спортсмена %d:%n",i+1);
            System.out.print("Фамилия: ");
            String surname = scanner.nextLine();
            System.out.print("Имя: ");
            String name = scanner.nextLine();
            System.out.print("Регистрационный номер: ");
            String regNumber = scanner.nextLine();
            System.out.print("Клуб: ");
            String club = scanner.nextLine();
            System.out.print("Результат (в секундах и десятых): ");
            double result = scanner.nextDouble();
            scanner.nextLine();


        }
    }
}
