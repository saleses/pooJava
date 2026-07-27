public class _16_ControleDeFluxoWhileNumeroPar {
    public static void main(String[] args) {

        System.out.println(sumNumbers(55));
    }

    public static int sumNumbers(int choiceNumber) {
        boolean limit = false;
        int sum = 0;

        while (!limit) {
            for (int i = 0; i <= choiceNumber; i++) {
                sum += i;
            }
            limit = true;
        }

        return sum;
    }
}
