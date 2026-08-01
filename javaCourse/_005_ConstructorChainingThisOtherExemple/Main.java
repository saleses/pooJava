public class Main {
    public static void main(String[] args) {

        Customer joao = new Customer();
        System.out.println(joao.getName());
        System.out.println(joao.getCreditLimit());
        System.out.println(joao.getEmail());
        System.out.println("-----");

        Customer luiz = new Customer("Luiz", "luiz@email.com");
        System.out.println(luiz.getName());
        System.out.println(luiz.getCreditLimit());
        System.out.println(luiz.getEmail());
        System.out.println("-----");

        Customer fabio  = new Customer("Fabio", 2000, "fabio@email.com");
        System.out.println(fabio.getName());
        System.out.println(fabio.getCreditLimit());
        System.out.println(fabio.getEmail());
    }
}
