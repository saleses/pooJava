public class Main {
    public static void main(String[] args) {

        Conta c1 = new Conta("Pedro", "1241-2", 0);
        c1.depositar(1000);
        c1.sacar(250);
        c1.transferir(150);
        c1.imprimirExtrato();

        Conta c2 = new Conta("Maria", "4313-3", 100);
        c2.depositar(300);
        c2.depositar(100);
        c2.sacar(150);
        c2.transferir(100);
        c2.imprimirExtrato();

        Conta c3 = new Conta("Geraldo", "1401-1", 1000);
        c3.depositar(500);
        c3.transferir(200);
        c3.imprimirExtrato();
    }
}
