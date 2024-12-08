package bankAccountConstructor;

public class Account {
    private String accountName;
    private double balance;

    // constructor
    public Account(String accountName, double initialBalance) {
        this.accountName = accountName;
        if (initialBalance > 0.0)
            balance = initialBalance;
    }

    // method to debit from account
    public void debit(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Debit amount exceeded account balance for account " + accountName + ".");
        }
    }

    // method to get the current balance
    public double getBalance() {
        return balance;
    }

    // method to get the account name
    public String getAccountName() {
        return accountName;
    }
}
