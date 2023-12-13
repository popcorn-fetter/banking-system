// BankingSystem.java

public class BankingSystem {
    public static void main(String[] args) {
        // Create accounts
        Account account1 = new Account(1, 1000.0);
        Account account2 = new Account(2, 2000.0);

        // Create customers
        Customer customer1 = new Customer(101, "Alice", "alice@example.com");
        Customer customer2 = new Customer(102, "Bob", "bob@example.com");

        // Create transactions
        Transaction transaction1 = new Transaction(1001, account1, customer1, 500.0);
        Transaction transaction2 = new Transaction(1002, account2, customer2, 1000.0);

        // Display information
        System.out.println("Transaction Information:");
        transaction1.displayInfo();
        System.out.println();
        transaction2.displayInfo();
    }
}
