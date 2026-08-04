public class Main {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            Student register = new Student("260800" + i,
                switch (i) {
                    case 1 -> "Maria";
                    case 2 -> "Fernanda";
                    case 3 -> "Maurício";
                    case 4 -> "Felipe";
                    case 5 -> "Paula";
                    default -> "Desconhecido";
                    },
                    "03/08/1972",
                    "Curso de Filosofia");
            System.out.println(register);
        }
    }
}