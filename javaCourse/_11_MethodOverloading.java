public class _11_MethodOverloading {
    public static void main(String[] args) {
        String name;
        String secondName;
        int age;

        System.out.println();
        personalId("Olga", "Maria",72);
        System.out.println("-------------");
        personalId("João", 45);
    }

    public static void personalId(String name, String secondName, int age) {
        System.out.println("Name: " + name + " " + secondName);
        System.out.println("Age: " + age);
    }

    public static void personalId(String name, int age) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Pendência: sobrenome não informado.");
    }
}