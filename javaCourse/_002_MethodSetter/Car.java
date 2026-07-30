public class Car {
    private String make = "Porsche";
    private String model = "911-Turbo";
    private String color = "Black";
    private int doors = 4;
    private boolean convertible = true;

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public void setMake(String make) {
        String lowerCaseMake = make.toLowerCase();

        if(make == null || make != "porsche") make = "It's not important!";

        switch (lowerCaseMake) {
            case "tesla" -> this.make = "Eletric car: Tesla";
            default -> {
                this.make = "Unsupported";
            }
        }
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public void describeCar() {
        System.out.println(make + " " +
                model + " " +
                color + " " +
                doors + "-doors " +
                (convertible ? "Convertible" : "Not convertible"));
    }
}
