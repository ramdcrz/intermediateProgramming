package bankAccountConstructor;

import java.util.Scanner;
import java.text.DecimalFormat;

public class AccountRun {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###.00");

        Account account1 = new Account("account1", 150);
        Account account2 = new Account("account2", 500.53);

        System.out.println("account1 balance: $" + df.format(account1.getBalance()));
        System.out.println("account2 balance: $" + df.format(account2.getBalance()) + "\n");

        System.out.print("Enter withdrawal amount for account1: ");
        double withdrawalAmount = scan.nextDouble();

        System.out.println("\nsubtracting " + df.format(withdrawalAmount) + " from account1 balance");
        account1.debit(withdrawalAmount);
        System.out.println("account1 balance: $" + df.format(account1.getBalance()));
        System.out.println("account2 balance: $" + df.format(account2.getBalance()));

        System.out.print("\nEnter withdrawal amount for account2: ");
        double withdrawalAmount2 = scan.nextDouble();

        System.out.println("\nsubtracting " + df.format(withdrawalAmount2) + " from account2 balance");
        account2.debit(withdrawalAmount2);
        System.out.println("account1 balance: $" + df.format(account1.getBalance()));
        System.out.println("account2 balance: $" + df.format(account2.getBalance()));

        scan.close();
    }
}