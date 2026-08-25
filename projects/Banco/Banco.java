public class Banco {
    private String nome;
    Conta conta;

    public Banco(String nome, Conta conta) {
        this.nome = nome;
        this.conta = conta;
    }

    public String getNome() {
        return nome;
    }

    public void printContaCliente() {
        System.out.println("Banco: " + getNome() + "\n" +
                conta.toString() + "\n"
        );
    }
}
