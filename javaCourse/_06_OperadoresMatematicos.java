public class _06_OperadorersMatematicos {
    public static void main(String[] args) {
        double primeiroNumero = 10;
        double segundoNumero = 7;

        double adicao = primeiroNumero + segundoNumero;
        double subtracao = primeiroNumero - segundoNumero;
        double multiplicacao = primeiroNumero * segundoNumero;
        double divisao = primeiroNumero / segundoNumero;
        double restoDaDivisao = primeiroNumero % segundoNumero;

        System.out.println("Adição: " + primeiroNumero + " + " + segundoNumero + " = " + adicao);
        System.out.println("Subtracao: " + primeiroNumero + " - " + segundoNumero + " = " + subtracao);
        System.out.println("Multiplicação: " + primeiroNumero + " * " + segundoNumero + " = " + multiplicacao);
        System.out.println("Divisão: " +  primeiroNumero + " / " + segundoNumero + " = " + divisao);
        System.out.println("Resto da divisão entre os números: " + primeiroNumero + " e " + segundoNumero + " = " + restoDaDivisao);
    }
}
