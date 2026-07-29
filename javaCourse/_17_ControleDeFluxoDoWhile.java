import java.util.Scanner;

public class _17_ControleDeFluxoDoWhile {
    public static void main(String[] args) {
        System.out.println(ofLegalAge());
    }

    public static String ofLegalAge () {
        final int currentYear = 2026;
        boolean valid = false;
        int age;

        do {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite ano de nascimento: ");
            String dateOfBirth = scanner.nextLine();
            age = (currentYear - Integer.parseInt(dateOfBirth));

            if (age >= 18) {
                valid = true;
            } else {
                System.out.println("Acesso negado!");
            }
        } while (!valid);

        return "Você tem " + age + " anos. Acesso liberado!";
    }
}
