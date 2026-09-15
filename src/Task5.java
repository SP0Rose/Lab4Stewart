import java.util.Scanner;

public class Task5 {
    static void main(String[] args) {
        // Variables
        Scanner scan = new Scanner(System.in);
        double currentTemperature;

        // Output
        System.out.println("What temperature is it in fahrenheit?");
        currentTemperature = scan.nextDouble();

        // Extra variables
        double celsius = (currentTemperature - 32) / 1.8;

        // Output
        System.out.println("The temperature is " + celsius + " degrees celsius.");
    }
}