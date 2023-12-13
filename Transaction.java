// Transaction.java

public class Transaction {
    private int transactionId;
    private Account account;
    private Customer customer;
    private double amount;

    public Transaction(int transactionId, Account account, Customer customer, double amount) {
        this.transactionId = transactionId;
        this.account = account;
        this.customer = customer;
        this.amount = amount;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public Account getAccount() {
        return account;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getAmount() {
        return amount;
    }

    public void displayInfo() {
        System.out.println("Transaction ID: " + transactionId);
        account.displayInfo();
        customer.displayInfo();
        System.out.println("Amount: $" + amount);
    }
}
