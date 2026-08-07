public class _020_StringFormatted_AllAboutString {
    public static void main(String[] args) {

        printInformation("Hello World");
        printInformation("");
        printInformation("\t    \n");

        String helloWorld = "Hello World";
        System.out.printf("index of r = %d %n", helloWorld.indexOf('r'));
        System.out.printf("index of World = %d %n", helloWorld.indexOf("World"));

        System.out.printf("index of l = %d %n", helloWorld.indexOf('l'));
        System.out.printf("index of l = %d %n", helloWorld.lastIndexOf('l'));

        System.out.printf("index of l = %d %n", helloWorld.indexOf('l'));
        System.out.printf("index of l = %d %n", helloWorld.lastIndexOf('l'));

        String helloWorldLower = helloWorld.toLowerCase();
        if (helloWorld.equals(helloWorldLower)) {
            System.out.println("Valores são idênticos");
        }
        if (helloWorld.equalsIgnoreCase(helloWorldLower)) {
            System.out.println("Valores são ignorados");
        }
        if (helloWorld.startsWith("Hello")) {
            System.out.println("String inicia com \"Hello\"");
        }
        if (helloWorld.endsWith("World")) {
            System.out.println("String termina com \"World\"");
        }
        if (helloWorld.contains("World")) {
        System.out.println("String contém a palavra \"World\"");
        }
        if (helloWorld.contentEquals("Hello World")) {
            System.out.println("Valores são idẽnticos");
        }
    }

    public static void printInformation(String string) {
        int length = string.length();
        System.out.printf("Tamanho = %d %n", length);

        if (string.isEmpty()) {
            System.out.println("String vazia");
            return;
        }

        if (string.isBlank()) {
            System.out.println("String em branco");
        }

        System.out.printf("Primeiro caracter (char) = %c %n", string.charAt(0));
        System.out.printf("Último caracter (char) = %c %n", string.charAt(length - 1));
    }
}
