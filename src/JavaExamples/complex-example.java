package JavaExamples;

import java.util.ArrayList;
import java.util.List;

class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;

    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient funds!");
        }
    }

    public void displayBalance() {
        System.out.println("Account Balance: $" + balance);
    }
}

class Transaction {
    public static void transfer(BankAccount sender, BankAccount receiver, double amount) {
        if (amount > 0) {
            sender.withdraw(amount);
            receiver.deposit(amount);
            System.out.println("Transfer completed successfully!");
        } else {
            System.out.println("Invalid transfer amount!");
        }
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("123456", "John Doe", 1000.0);
        BankAccount account2 = new BankAccount("789012", "Jane Doe", 1500.0);

        account1.displayBalance();
        account2.displayBalance();

        account1.deposit(500.0);
        account1.displayBalance();

        account1.withdraw(200.0);
        account1.displayBalance();

        Transaction.transfer(account1, account2, 300.0);

        account1.displayBalance();
        account2.displayBalance();
    }
}
