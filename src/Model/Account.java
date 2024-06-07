package Model;

public class Account {
    // represents a bank account and should have attributes like account number, account holder name, account balance, etc.

    private String accountNumber;
    private String accountHolderName;
    private static double accountBalance;

    public Account (String accountNumber, String accountHolderName, double accountBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.accountBalance = accountBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public static double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public static void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }





}
