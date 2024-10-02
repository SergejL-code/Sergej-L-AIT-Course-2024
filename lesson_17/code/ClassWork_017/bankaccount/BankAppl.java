package ClassWork_017.bankaccount;

import ClassWork_017.bankaccount.model.BankAccount;

public class BankAppl {
    public static void main(String[] args) {
        BankAccount nr001 = new BankAccount(101, "John Smith", "Bank1", 1, 100);
        nr001.display();

//to String
        System.out.println(nr001);
        BankAccount nr002 = new BankAccount(102, "Pit Brossner", "Bank1", 1);
        nr002.display();

        BankAccount nr003 = new BankAccount(103, "Bank1", 1, 5000);
        nr003.display();
nr001.deposit(500);
nr001.display();
nr002.deposit(50042);
nr002.display();
        System.out.println("==========================================================================================");
    nr001.withDraw(500);
    nr001.display();
    nr001.withDraw(200);
    nr001.display();
    nr001.withDraw(100);
    nr001.display();
    nr001.withDraw(100);
    nr001.display();
    }//end of main
}//end of class
