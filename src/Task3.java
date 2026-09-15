import java.util.Scanner;

public class Task3 {
    static void main(String[] args) {
        // Variables
        Scanner scan = new Scanner(System.in);
        double springCost;
        double summerCost;
        double autumnCost;
        double winterCost;
        double totalCost;

        // Outputs and Inputs
        System.out.println("What is your home maintenance cost for Spring? ");
        springCost = scan.nextDouble();

        System.out.println("What is your home maintenance cost for Summer? ");
        summerCost = scan.nextDouble();

        System.out.println("What is your home maintenance cost for Autumn? ");
        autumnCost = scan.nextDouble();

        System.out.println("What is your home maintenance cost for Winter? ");
        winterCost = scan.nextDouble();

        totalCost = springCost + summerCost + autumnCost + winterCost;
        System.out.println("Your total yearly maintenance cost is " + totalCost + ".");
    }
}