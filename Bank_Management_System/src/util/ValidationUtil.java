package util;

public class ValidationUtil {

    // Account Number Validation
    public static boolean isValidAccountNumber(String accountNumber) {

        if (accountNumber == null || accountNumber.trim().isEmpty()) {
            return false;
        }

        return accountNumber.matches("\\d+");
    }

    // Account Holder Name Validation
    public static boolean isValidName(String name) {

        if (name == null || name.trim().isEmpty()) {
            return false;
        }

        return name.matches("[a-zA-Z ]+");
    }

    // PIN Validation
    public static boolean isValidPin(String pin) {

        if (pin == null) {
            return false;
        }

        return pin.matches("\\d{4}");
    }

    // Opening Balance Validation
    public static boolean isValidOpeningBalance(double balance) {

        return balance >= 1000;
    }

    // Deposit Validation
    public static boolean isValidDeposit(double amount) {

        return amount > 0;
    }

    // Withdraw Validation
    public static boolean isValidWithdraw(double amount) {

        return amount > 0;
    }

    // Status Validation
    public static boolean isValidStatus(String status) {

        return status.equalsIgnoreCase("ACTIVE")
                || status.equalsIgnoreCase("INACTIVE");
    }

}