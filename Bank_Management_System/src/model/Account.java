package model;

public class Account {

    private String accountNumber;
    private String accountHolderName;
    private String pin;
    private double balance;
    private String status;

    // Parameterized Constructor
    public Account(String accountNumber,
                   String accountHolderName,
                   String pin,
                   double balance,
                   String status) {

        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.pin = pin;
        this.balance = balance;
        this.status = status;
    }

    // Constructor (Default Status = ACTIVE)
    public Account(String accountNumber,
                   String accountHolderName,
                   String pin,
                   double balance) {

        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.pin = pin;
        this.balance = balance;
        this.status = "ACTIVE";
    }

    // Getter Methods

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public String getStatus() {
        return status;
    }

    // Setter Methods

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // PIN Verification

    public boolean checkPin(String enteredPin) {
        return pin.equals(enteredPin);
    }
}