public class Conta {
    private String titular;
    private String numero;
    private double saldo;

    public Conta(String titular, String numero, int saldo) {
        this.titular = titular;
        this.numero = numero;
        this.saldo = saldo;
    }

    public String getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valorDepositado) {
        this.saldo += valorDepositado;
    }

    public void sacar(double valorSacado) {
        this.saldo -= valorSacado;
    }

    public void transferir(double valorTransferencia) {
        this.saldo -= valorTransferencia;
    }

    public void imprimirExtrato() {
        System.out.println(this.titular);
        System.out.println(this.numero);
        System.out.println(this.saldo);
        System.out.println("--------------");
    }
}
