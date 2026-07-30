public class Main {
    public static void main(String[] args) {

        Car porsche = new Car();
        System.out.println(porsche.getMake());
        System.out.println(porsche.getModel());
        System.out.println(porsche.getColor());
        System.out.println(porsche.getDoors());
        System.out.println(porsche.isConvertible());
        System.out.println("");
        porsche.describeCar();
        System.out.println("----------------------------");

        Car tesla = new Car();
        tesla.setMake("TESLA");
        tesla.setModel("Model-X");
        tesla.setColor("Red");
        tesla.setDoors(2);
        tesla.setConvertible(false);
        System.out.println("");
        tesla.describeCar();
        System.out.println("----------------------------");

        Car byd = new Car();
        byd.setMake("BYD");
        byd.setModel("Song");
        byd.setColor("Blue");
        byd.setDoors(4);
        byd.setConvertible(false);
        System.out.println("");
        byd.describeCar();
        System.out.println("----------------------------");
    }
}
