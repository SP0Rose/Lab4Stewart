import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        // Variables
        Scanner scan = new Scanner(System.in);
        double purchase;
        double taxRate = 0.05;
        double fullPurchase;
        double tax;

        // Output and Input
        System.out.println("Enter the price of your purchase: ");
        purchase = scan.nextDouble();

        // Calculation
        tax = purchase * taxRate;
        fullPurchase = (double)(purchase + tax);
        System.out.println("Your new price (including tax) is $" + fullPurchase);
    }
}
