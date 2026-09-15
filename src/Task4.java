public class Task4 {
    static void main(String[] args) {
        // Variables
        double creditBalance = 5000;
        double taxRate = 0.17;
        double tax = creditBalance * taxRate;
        double newCreditBalance = creditBalance + tax;

        // Output
        System.out.println("Your new balance is now $" + newCreditBalance + " for month one.");
        newCreditBalance = creditBalance + tax * 2;
        System.out.println("The new balance for month two is now $" + newCreditBalance + ".");
    }
}