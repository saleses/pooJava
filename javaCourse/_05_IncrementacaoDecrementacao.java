public class _05_IncrementacaoDecrementacao {
    public static void main(String[] args) {

        int number = 10;

        System.out.println("Incrementação de valor da variável number = " + number);

        number++;

        if (number > 10) {
            System.out.println("Valor incrementado com sucesso!");
            System.out.println("number = " + number);
        }

        number--;
        if (number < 11) {
            System.out.println("Valor decrementado com sucesso!");
            System.out.println("number = " + number);
        }
    }
}
