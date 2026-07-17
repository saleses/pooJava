public class _07_MethodVoid {
    public static void main(String[] args) {
        boolean dogNoise;
        boolean catNoise;
        boolean birdNoise;

        animalNoise(false, false, true);
    }

    public static void animalNoise(boolean dogNoise, boolean catNoise, boolean birdNoise) {
        if (dogNoise) {
            barkingDog();
        }

        if (catNoise) {
            meowingCat();
        }

        if (birdNoise) {
            chirpingBird();
        }
    }

    public static void barkingDog() {
        System.out.println("Woof Woof");
    }

    public static void meowingCat() {
        System.out.println("Miau Miau");
    }

    public static void chirpingBird() {
        System.out.println("Piu Piu");
    }
}