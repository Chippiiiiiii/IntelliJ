public class Bank {
    static int totalAccounts = 0;
    int accountNumber, balance;

    Bank(int accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        totalAccounts++;
    }

    public void deposit(int a) {
        balance += a;
    }

    public void display() {
        System.out.println("Balance:-" + balance);
    }

    public static void main(String[] args) {
        Bank a1 = new Bank(1,1000);
        Bank a2 = new Bank(2, 2000);
        a1.deposit(2000);
        a1.display();
        a2.deposit(500);
        a2.display();

    }
}