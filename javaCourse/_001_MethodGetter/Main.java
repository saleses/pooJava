public class Main {
    public static void main(String[] args) {

        Car eletric = new Car();

        System.out.println("Método Getter: acesso a atributos privados (private)");
        System.out.println("make = " + eletric.getMake());
        System.out.println("model = " + eletric.getModel());
        System.out.println("doors = " + eletric.getDoors());
        System.out.println("color = " + eletric.getColor());
        System.out.println("Convertible = " +  eletric.isConvertible());
        System.out.println("-------------------------------------");
        System.out.println("Método public: acesso a atributos através de um método público");
        eletric.describeCar();
    }
}
