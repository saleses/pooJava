public class Main {
    public static void main(String[] args) {

        Banco cliente1 = new Banco("Banco do Brasil", new Conta(4231, 100.00, new Cliente("João")));
        Banco cliente2 = new Banco("Itaú", new Conta(4385, 500, new Cliente("Bartolomeu")));

        cliente1.printContaCliente();
        cliente1.conta.consultarSaldo();
        cliente1.conta.depositar(100.00);
        cliente1.conta.sacar(80);
        cliente1.conta.consultarSaldo();
        System.out.println("============================");

        cliente2.printContaCliente();
        cliente2.conta.consultarSaldo();
        cliente2.conta.sacar(200);
        cliente2.conta.consultarSaldo();
        cliente2.conta.depositar(100);
        cliente2.conta.consultarSaldo();
        cliente2.conta.sacar(400);
        cliente2.conta.consultarSaldo();


    }
}
