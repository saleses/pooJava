import java.util.Scanner;

public class WelcomeToTheRealWorld {
    public static void main(String[] args) {
        printName();
    }

    public static void printName() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please, who are you? ");
        String name = scanner.nextLine();

        System.out.println("Welcome to the real world, " + name + "!");
    }
}
