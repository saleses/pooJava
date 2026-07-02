public class Pessoa {
    private String nome;
    private int idade;
    private double altura;
    private double peso;

    public Pessoa(String nome, int idade, double altura, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    public String apresentar(String nome, int idade) {
        return "Meu nome é " + this.nome + " e minha idade é " + this.idade + " anos.";
    }

    public double calcularIMC(double altura, double peso) {
        return this.peso / (this.altura * this.altura);
    }
}
