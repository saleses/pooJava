public class _15_ControleFluxoForNumerosPrimos {
    public static void main(String[] args) {
        int primeNumber;

        //primeNumberAmount(11);
        System.out.println(primeNumberAmount(2147));
    }

    public static String primeNumberAmount(int primeNumber) {
        int count = 0;

        for (int i = 2; i <= primeNumber; i++) {
            if (primeNumber % i == 0) {
                count++;
            }
        }

        if (count == 1) {
            return "Número primo.";
        } else {
            return "Não é número primo";
        }
    }
}

