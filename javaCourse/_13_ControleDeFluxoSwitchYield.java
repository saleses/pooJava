public class _13_ControleDeFluxoSwitchYield {
    public static void main(String[] args) {
        String month = "Março";

        System.out.println(month.toLowerCase() + " -> " + getQuarter(month));
    }

    public static String getQuarter(String month) {
        month = month.toUpperCase();

        return switch (month) {
            case "JANEIRO", "FEVEREIRO", "MARÇO" -> { yield "1st"; }
            case "ABRIL", "MAIO", "JUNHO" -> { yield "2nd"; }
            case "JULHO", "AGOSTO", "SETEMBRO" -> { yield "3rd"; }
            case "OUTUBRO", "NOVEMBRO", "DEZEMBRO" -> { yield "4th"; }
            default -> {
                String badResponse = "não existe!";
                yield badResponse;
            }
        };
    }
}
