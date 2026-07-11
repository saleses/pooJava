public class _04_OperadorTernario {
    public static void main(String[] args) {
        boolean isCar = true;
        boolean isMotocycle = true;
        int yearOfProduction = 2026;

        if (isCar && (yearOfProduction == 2026)) {
            System.out.println("Carro é novo.");
        }  else if (isMotocycle && (yearOfProduction == 2026)) {
            System.out.println("Moto é nova.");
        }

        String carManufacturer = "Ford";
        boolean isAmerican = carManufacturer == "Ford" ? true : false;

        String motocycleManufacturer = "Halley Davidson";
        boolean isJapan = motocycleManufacturer == "Honda" ? true : false;

        if (isAmerican) {
            System.out.println("Carro Ford é americana");
        }

        if (!isJapan) {
            System.out.println("Moto Halley Davidson não é japonesa");
        }
    }
}
