public class Main {
    public static void main(String[] args) {
        // Instance
        Pessoa p1 = new Pessoa("Fulano", 32, 1.74, 75);
        Pessoa p2 = new Pessoa("Ciclano", 25, 1.87, 89);
        Pessoa p3 = new Pessoa("Beltrano", 41, 1.56, 64);

        System.out.println(p1.apresentar(p1.getNome(), p1.getIdade()));
        System.out.println(p1.calcularIMC(p1.getAltura(), p1.getPeso()));
        System.out.println();
        System.out.println(p2.apresentar(p2.getNome(), p2.getIdade()));
        System.out.println(p2.calcularIMC(p2.getAltura(), p2.getPeso()));
        System.out.println();
        System.out.println(p3.apresentar(p3.getNome(), p3.getIdade()));
        System.out.println(p3.calcularIMC(p3.getAltura(), p3.getPeso()));
    }
}
