package assignment8;

import java.util.ArrayList;

public class BankTransactions {

    public static void main(String[] args) {
        // Store transactions (positive = credit, negative = debit)
        ArrayList<Integer> transactions = new ArrayList<>();
        transactions.add(50000);
        transactions.add(-2000);
        transactions.add(3000);
        transactions.add(-15000);
        transactions.add(-200);
        transactions.add(-300);
        transactions.add(4000);
        transactions.add(-3000);

        int creditCount = 0, debitCount = 0;
        int totalCredit = 0, totalDebit = 0;
        int suspiciousCount = 0;

        for (int amount : transactions) {
            // Count credit and debit transactions
            if (amount > 0) {
                creditCount++;
                totalCredit += amount;
            } else if (amount < 0) {
                debitCount++;
                totalDebit += amount;  // totalDebit will be negative sum
            }

            // Check suspicious limits
            if (amount > 10000) {
                System.out.println("Suspicious credit transaction with Amount: " + amount);
                suspiciousCount++;
            } else if (amount < -10000) {
                System.out.println("Suspicious debit transaction with Amount: " + amount);
                suspiciousCount++;
            }
        }

        int totalBalance = totalCredit + totalDebit; // since totalDebit is negative

        // Print outputs
        System.out.println("Total number of credit transactions: " + creditCount);
        System.out.println("Total number of debit transactions: " + debitCount);
        System.out.println("Total amount credited: " + totalCredit);
        System.out.println("Total amount debited: " + Math.abs(totalDebit)); // absolute value
        System.out.println("Total amount remaining in account: " + totalBalance);
        System.out.println("Total number of suspicious transactions: " + suspiciousCount);
    }
}
