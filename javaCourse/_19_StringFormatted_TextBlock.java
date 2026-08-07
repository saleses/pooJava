public class _019_TextBlock {
    public static void main(String[] args) {

        // First example
        String bulletIt = "Imprime uma lista em tópicos:\n" +
                "\t\u2022 Primeiro tópico\n" +
                "\t\t\u2022 Sub-tópico";

        System.out.println(bulletIt);

        // Second example
        String textBlock = """
                Imprime lista de tópico:
                    \u2022 Primeiro ponto
                        \u2022 Sub-tópico""";

        System.out.println(textBlock);

        int age = 35;
        System.out.printf("Sua idade é %d%n", age);

        int yearOfBirth = 2026 - age;
        System.out.printf("Age = %d, Birth year = %d%n", age, yearOfBirth);
        System.out.printf("Sua idade é %.2f%n", (float) age);

        for (int i = 1; i <= 100000; i *= 10) {
            System.out.printf("Imprimindo %6d %n", i);
        }

        // First format for same result
        String formattedString = String.format("Sua idade é %d", age);
        System.out.println(formattedString);

        // Second format for same result
        formattedString = "Sua idade é %d".formatted(age);
        System.out.println(formattedString);
    }
}
