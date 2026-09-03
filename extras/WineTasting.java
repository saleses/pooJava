import java.util.Scanner;

public class WineTasting {
    public static void main(String[] args) {

        identifyCustomer();
    }

    public static void identifyCustomer() {
        Scanner customer = new Scanner(System.in);

        System.out.print("What's your name? ");
        String enterName = customer.nextLine();

        System.out.print("What's your age? ");
        int enterAge = customer.nextInt();

        if (enterAge >= 18) {
            System.out.printf("Welcome to Wine Tasting %s!", enterName);
        }  else {
            System.out.printf("Sorry, you are not welcome to Wine Tasting %s!", enterName);
        }
    }
}