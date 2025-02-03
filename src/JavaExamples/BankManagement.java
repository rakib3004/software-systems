package src.JavaExamples;

import java.util.ArrayList;
import java.util.List;

public class BankManagement {
    private List<BankAccount> accounts;

    public BankManagement() {
        this.accounts = new ArrayList<>();
    }

    // Method 1: Add new account
    public void addAccount(String accountNumber, String accountHolder, double balance) {
        BankAccount newAccount = new BankAccount(accountNumber, accountHolder, balance);
        accounts.add(newAccount);
        System.out.println("New account added successfully!");
    }

    // Method 2: Remove an account
    public void removeAccount(String accountNumber) {
        accounts.removeIf(account -> account.getAccountNumber().equals(accountNumber));
        System.out.println("Account removed successfully!");
    }

    // Method 3: Display all accounts
    public void displayAllAccounts() {
        System.out.println("All Accounts:");
        for (BankAccount account : accounts) {
            System.out.println(account);
        }
    }

    // Method 4: Deposit money into an account
    public void depositToAccount(String accountNumber, double amount) {
        BankAccount account = findAccount(accountNumber);
        if (account != null) {
            account.deposit(amount);
            System.out.println("Deposit successful!");
        } else {
            System.out.println("Account not found!");
        }
    }

    // Method 5: Withdraw money from an account
    public void withdrawFromAccount(String accountNumber, double amount) {
        BankAccount account = findAccount(accountNumber);
        if (account != null) {
            account.withdraw(amount);
            System.out.println("Withdrawal successful!");
        } else {
            System.out.println("Account not found!");
        }
    }

    // Method 6: Transfer money between accounts
    public void transferBetweenAccounts(String senderAccountNumber, String receiverAccountNumber, double amount) {
        BankAccount sender = findAccount(senderAccountNumber);
        BankAccount receiver = findAccount(receiverAccountNumber);

        if (sender != null && receiver != null) {
            Transaction.transfer(sender, receiver, amount);
            System.out.println("Transfer successful!");
        } else {
            System.out.println("Sender or receiver account not found!");
        }
    }

    // Method 7: Display account balance
    public void displayAccountBalance(String accountNumber) {
        BankAccount account = findAccount(accountNumber);
        if (account != null) {
            account.displayBalance();
        } else {
            System.out.println("Account not found!");
        }
    }

    // Method 8: Find account by account number
    private BankAccount findAccount(String accountNumber) {
        for (BankAccount account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        return null;
    }

    // Method 9: Display total balance of all accounts
    public void displayTotalBalance() {
        double totalBalance = 0;
        for (BankAccount account : accounts) {
            totalBalance += account.getBalance();
        }
        System.out.println("Total Balance of All Accounts: $" + totalBalance);
    }

    // Method 10: Display the account with the highest balance
    public void displayAccountWithHighestBalance() {
        if (!accounts.isEmpty()) {
            BankAccount maxBalanceAccount = accounts.get(0);
            for (BankAccount account : accounts) {
                if (account.getBalance() > maxBalanceAccount.getBalance()) {
                    maxBalanceAccount = account;
                }
            }
            System.out.println("Account with Highest Balance: " + maxBalanceAccount);
        } else {
            System.out.println("No accounts available!");
        }
    }

    // Method 11: Display the account with the lowest balance
    public void displayAccountWithLowestBalance() {
        if (!accounts.isEmpty()) {
            BankAccount minBalanceAccount = accounts.get(0);
            for (BankAccount account : accounts) {
                if (account.getBalance() < minBalanceAccount.getBalance()) {
                    minBalanceAccount = account;
                }
            }
            System.out.println("Account with Lowest Balance: " + minBalanceAccount);
        } else {
            System.out.println("No accounts available!");
        }
    }

    // Method 12: Display the total number of accounts
    public void displayTotalAccounts() {
        System.out.println("Total Number of Accounts: " + accounts.size());
    }
}
