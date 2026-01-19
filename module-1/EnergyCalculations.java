package module1;

import java.util.Scanner;

public class EnergyCalculations {

    public static void main(String[] args) {

        // Prepare Scanner for user input
        Scanner input = new Scanner(System.in);

        // Ask user for water mass in kilograms
        System.out.print("Enter the amount of water in kilograms: ");
        double waterMass = input.nextDouble();

        // Ask user for initial temperature
        System.out.print("Enter the initial temperature (Celsius): ");
        double initialTemperature = input.nextDouble();

        // Ask user for desired temperature
        System.out.print("Enter the desired temperature (Celsius): ");
        double finalTemperature = input.nextDouble();

        // Calculate energy needed using formula conversion
        double q = waterMass * (finalTemperature - initialTemperature) * 4184;

        // Display the result
        System.out.println("You will need " + q + " Joules to get from " + initialTemperature + "°C to " + finalTemperature + "°C");

        // Close scanner
        input.close();
    }
}
