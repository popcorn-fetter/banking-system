// Account.java

public class Account {
    private int accountId;
    private double balance;

    public Account(int accountId, double balance) {
        this.accountId = accountId;
        this.balance = balance;
    }

    public int getAccountId() {
        return accountId;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    public void displayInfo() {
        System.out.println("Account ID: " + accountId);
        System.out.println("Balance: $" + balance);
    }
}
