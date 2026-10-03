import java.util.Scanner;

public class LoanEMICalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("========================================");
        System.out.println("          LOAN EMI CALCULATOR");
        System.out.println("========================================");

        // Input
        System.out.print("Enter Loan Amount (₹): ");
        double principal = sc.nextDouble();

        System.out.print("Enter Annual Interest Rate (%): ");
        double annualRate = sc.nextDouble();

        System.out.print("Enter Loan Tenure (Years): ");
        int years = sc.nextInt();

        // Validation
        if (principal <= 0 || annualRate < 0 || years <= 0) {
            System.out.println("\nInvalid input!");
            System.out.println("Please enter valid loan details.");
            sc.close();
            return;
        }

        // Convert annual interest rate to monthly interest rate
        double monthlyRate = annualRate / (12 * 100);

        // Convert years into months
        int months = years * 12;

        // Calculate EMI
        double emi;

        if (monthlyRate == 0) {
            emi = principal / months;
        } else {
            emi = (principal * monthlyRate *
                    Math.pow(1 + monthlyRate, months))
                    / (Math.pow(1 + monthlyRate, months) - 1);
        }

        // Calculate total payment and interest
        double totalPayment = emi * months;
        double totalInterest = totalPayment - principal;

        // Output
        System.out.println("\n========================================");
        System.out.println("             LOAN SUMMARY");
        System.out.println("========================================");

        System.out.printf("Loan Amount       : ₹%,.2f%n", principal);
        System.out.printf("Interest Rate     : %.2f%%%n", annualRate);
        System.out.printf("Loan Tenure       : %d months%n", months);

        System.out.println("----------------------------------------");

        System.out.printf("Monthly EMI       : ₹%,.2f%n", emi);
        System.out.printf("Total Interest    : ₹%,.2f%n", totalInterest);
        System.out.printf("Total Payment     : ₹%,.2f%n", totalPayment);

        System.out.println("========================================");

        sc.close();
    }
}
