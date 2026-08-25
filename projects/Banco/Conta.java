public class Conta {
    private int numeroConta;
    private double saldo;
    Cliente cliente;

    public Conta(int numeroConta, double saldo, Cliente cliente) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.cliente = cliente;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public double depositar(double valorDeDeposito) {
        return saldo += valorDeDeposito;
    }

    public double sacar(double valorDeSaque) {
        if (saldo - valorDeSaque > 0) {
            saldo -= valorDeSaque;
            System.out.printf("Saque de $ %.2f realizado com sucesso.\n", valorDeSaque);
        } else {
            System.out.printf("Saque de $%.2f é insuficiente.\n", valorDeSaque);
        }
        return saldo;
    }

    public void consultarSaldo() {
        System.out.println("Seu saldo é de $" + saldo);
    }

    @Override
    public String toString() {
        return "Cliente {" + cliente + "}\n" +
                "Conta: {" + "numeroConta: " + getNumeroConta() +
                ", saldo: " + getSaldo() +
                '}';
    }
}
