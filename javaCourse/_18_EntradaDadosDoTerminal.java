import java.util.Scanner;

public class _18_EntradaDadosDoTerminal {
    public static void main(String[] args) {
        int currentYear = 2026;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.print("Qual o ano de nascimento: ");
        String inputYear = scanner.nextLine();

        int year = currentYear - Integer.parseInt(inputYear);

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + year);
    }
}
