public class _07_PrimeiroMetodo {
    public static void main(String[] args) {
        String animalName;
        String animalSound;

        animalExpression("Totó","Au au");
        animalExpression("Félix","Miau miau");
    }

    public static void animalExpression(String animalName, String animalSound) {
        System.out.println(animalName + " faz " + animalSound);
    }
}
