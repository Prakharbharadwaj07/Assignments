package assignment7;

public class LoanEvaluator {

    public static String evaluateLoan(int creditScore, double income, boolean isEmployed, double dtiRatio) {
        // 1. Credit Score check
        if (creditScore > 750) {
            return "Loan Approved: Credit score above 750.";
        } else if (creditScore < 650) {
            return "Loan Denied: Credit score below 650.";
        } else {
            // Credit score between 650 and 750 requires additional checks
            if (income < 50000) {
                return "Loan Denied: Income less than $50,000 for credit score between 650 and 750.";
            }

            if (!isEmployed) {
                return "Loan Denied: Unemployed applicant.";
            }

            if (dtiRatio < 40) {
                return "Loan Approved: Debt-to-Income ratio less than 40%.";
            } else {
                return "Loan Denied: Debt-to-Income ratio 40% or greater.";
            }
        }
    }

    public static void main(String[] args) {
        // Example test cases
        System.out.println(evaluateLoan(760, 60000, true, 30));  // Approved automatically
        System.out.println(evaluateLoan(700, 52000, true, 35));  // Approved based on criteria
        System.out.println(evaluateLoan(700, 52000, false, 35)); // Denied, unemployed
        System.out.println(evaluateLoan(700, 48000, true, 35));  // Denied, income too low
        System.out.println(evaluateLoan(700, 52000, true, 45));  // Denied, DTI high
        System.out.println(evaluateLoan(640, 70000, true, 30));  // Denied, credit score too low
    }
}
