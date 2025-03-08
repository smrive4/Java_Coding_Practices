/**
 * DCL50-J
 * Demonstrates proper use of distinct variable names to prevent confusion.
 */
public class Main {
    public static void main(String[] args) {
        //This would be a BAD example - you don't know what account
        // int accountBalance = 1000;
        //Good Example: clearly defined variable names
        int checkingAccountBalance = 1000;
        int savingsAccountBalance = 500;

        System.out.println("Checking Account Balance: " + checkingAccountBalance);
        System.out.println("Savings Account Balance: " + savingsAccountBalance);
    }
}

