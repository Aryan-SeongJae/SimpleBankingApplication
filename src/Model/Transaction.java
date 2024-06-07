package Model;

import static Model.Account.setAccountBalance;

public class Transaction {
    // This class represents a transaction and should have attributes like transaction ID, transaction type (deposit/withdrawal), transaction amount, timestamp, etc.

    private String transactionID;

    private String transactionType;

    private double transactionAmount;

    private String timestamp;

    private double accountBalance;
    private double depositAmount;


    public Transaction(String transactionID, String transactionType, double transactionAmount, String timestamp) {
        this.transactionID = transactionID;
        this.transactionType = transactionType;
        this.transactionAmount = transactionAmount;
        this.timestamp = timestamp;
    }

    public String getTransactionID() {
        return transactionID;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public double getTransactionAmount() {
        return transactionAmount;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTransactionID(String transactionID) {
        this.transactionID = transactionID;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public void setTransactionAmount(double transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public void deposit(double amount) {
        depositAmount = Account.getAccountBalance() + amount;
        Account.setAccountBalance(depositAmount);
    }

    public void withdraw(double amount) {
        if (Account.getAccountBalance() - amount < 0) {
            System.out.println("Insufficient balance");
        } else {
            accountBalance = Account.getAccountBalance() - amount;
            Account.setAccountBalance(accountBalance);
        }

    }


}
