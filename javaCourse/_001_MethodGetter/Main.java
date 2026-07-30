public class Main {
    public static void main(String[] args) {

        Car eletricCar = new Car();

        System.out.println("Método Getter: acesso a atributos privados (private)");
        System.out.println("make = " + eletricCar.getMake());
        System.out.println("model = " + eletricCar.getModel());
        System.out.println("doors = " + eletricCar.getDoors());
        System.out.println("color = " + eletricCar.getColor());
        System.out.println("Convertible = " +  eletricCar.isConvertible());
        System.out.println("-------------------------------------");
        System.out.println("Método public: acesso a atributos através de um método público");
        eletricCar.describeCar();
    }
}
