public class _14_ControleFluxoSwitchYield {
    public static void main(String[] args) {

        System.out.print("Dia da Semana: ");
        System.out.println(dayOfWeek(6));

    }

    public static String dayOfWeek(int dayNumber) {
        return switch (dayNumber) {
            case 0 -> "Domingo";
            case 1 -> "Segunda-feira";
            case 2 -> "Terça-feira";
            case 3 -> "Quarta-feira";
            case 4 -> "Quinta-feira";
            case 5 -> "Sexta-feira";
            case 6 -> "Sábado";
            default -> {
                String invalidDay = "inválido";
                yield invalidDay;
            }
        };
    }
}
