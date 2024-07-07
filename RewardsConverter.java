import java.util.Scanner;

/**
 * This class provides a command-line interface for converting cash values
 * to airline miles using the RewardValue class.
 */
public class RewardsConverter {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        // Display welcome message and prompt user for input
        System.out.println("Welcome to the Credit Card Rewards Converter!");
        System.out.println("Please enter a cash value to convert to airline miles: ");

        // Read user input
        var input_value = scanner.nextLine();
        double cashValue;

        try {
            // Attempt to parse user input as a double
            cashValue = Double.parseDouble(input_value);
        } catch (NumberFormatException exception) {
            // Handle exception if input cannot be parsed
            System.out.println("Could not parse input value as a double, exiting");
            return;
        }

        // Convert cash value to miles using RewardValue class
        System.out.println("Converting $" + input_value + " to miles");
        var rewardsValue = new RewardValue(cashValue);

        // Display the conversion result
        System.out.println("$" + input_value + " is worth " + rewardsValue.getMilesValue() + " miles");
    }
}
