//package Fremd_13;
//
//public class Pernc {public class BankAccount {
//
//    // Метод для начисления процентов на баланс
//    public static double calculatePercent(double balance, double percent) {
//        // Расчет нового баланса с учетом процентов
//        double newBalance = balance + (balance * percent / 100);
//        return newBalance;
//    }
//
//    public static void main(String[] args) {
//        // Пример данных о пользователях (остатки на счетах)
//        double[] balances = {1000.0, 2000.0, 3000.0};
//        double percent = 10.0;  // Процент, который нужно начислить
//
//        // Проходим по каждому балансу и начисляем проценты
//        for (int i = 0; i < balances.length; i++) {
//            double updatedBalance = calculatePercent(balances[i], percent);
//            System.out.println("Updated balance for account " + (i + 1) + ": " + updatedBalance);
//        }
//    }
//}
//
//}
