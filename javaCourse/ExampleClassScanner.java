// Import class Scanner
import java.util.Scanner;

public class ExampleClassScanner {
    public static void main(String[] args) {
        // Instance Scanner
        Scanner scanner = new Scanner(System.in);

        // Enter name
        System.out.println("What's your name?");
        String name = scanner.nextLine();

        // Enter age
        System.out.println("What's your age?");
        int age = scanner.nextInt();

        System.out.println("Hello " + name + ", you are " + age + " years old.");

        // Condition If
        if (age < 18) {
            System.out.println("You don't have age to drink wine!");
        } else {
            System.out.println("Do you want to drink wine?");
        }

        // Good practice: close scanner
        scanner.close();
    }
}
