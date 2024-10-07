package ClassWork_017.bankaccount.model;

// Реализуем класс BankAccount:
//  - поля: account, owner, bank, branch, balance
//  - создаем несколько конструкторов под разные нужды (это иллюстрация полиморфизма)
//  - реализуем метод display() и display(String greeting) (это еще одна иллюстрация
//    полиморфизма)
//  - реализуем методы deposit() и withdraw() в классе BankAccount

public class BankAccount {
    //fields

    private long accountId;
    private String owner;
    private String bankName;
    private int branch;
    private double balance;

    public BankAccount(long accountId, String owner, String bankName, int branch, double balance) {
        this.accountId = accountId;
        this.owner = owner;
        this.bankName = bankName;
        this.branch = branch;
        this.balance = balance;
    }

    public BankAccount(long accountId, String owner, String bankName, int branch) {
        this.accountId = accountId;
        this.owner = owner;
        this.bankName = bankName;
        this.branch = branch;
    }

    public BankAccount(long accountId, String bankName, int branch, double balance) {
        this.accountId = accountId;
        this.bankName = bankName;
        this.branch = branch;
        this.balance = balance;
    }

    public long getAccountId() {
        return accountId;
    }

    public void setAccountId(long accountId) {
        this.accountId = accountId;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public int getBranch() {
        return branch;
    }

    public void setBranch(int branch) {
        this.branch = branch;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    //method that outputs messages

    public void display() {
        System.out.println("Account: " + accountId + " , owner: " + owner + " , bank Name: " + bankName + " , branch: " + branch + " , Balance: " + balance);
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountId=" + accountId +
                ", owner='" + owner + '\'' +
                ", bankName='" + bankName + '\'' +
                ", branch=" + branch +
                ", balance=" + balance +
                '}';
    }

    public boolean deposit(double sum) {
        balance += sum;
        return true;
    }

    public boolean withDraw(double sum) {
        if (sum <= balance) {
            balance -= sum;               //
        }
        System.out.println(" Your balance: " + balance + " is not sufficient, Please top up your account");
        return false;
    }


}//end of class
