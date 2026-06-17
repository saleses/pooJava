import java.util.Scanner;

public class ExampleException {
    public static void main(String[] args) {

        // Instance object
        Scanner scanner = new Scanner(System.in);

        // Variable declaration
        final int currentYear = 2026;

        // Enter user data
        System.out.println("Find out your friend's year of birthday.");
        System.out.println("What's the name? ");
        String name = scanner.nextLine();

        System.out.println("What year were your friend born? ");
        String enterYear = scanner.nextLine();

        // Exception: try-catch
        try {
            // Age calculation
            int birthYear = Integer.parseInt(enterYear);
            int age = (currentYear - birthYear);

            // Condition if
            if (age <= 0) {
                System.out.println("Are you sure? Your friend " + name + " hasn't been born!");
            } else if (age >= 100) {
                System.out.println("Do you have a sure? Your friend " + name + " have " +  age + " years old?");
            } else {
                System.out.println("Your friend " + name + " has " + age + " years old!");
            }

        } catch (NumberFormatException nfe) {
            System.out.println("Invalid value entered.");
        }
    }
}
