public class _12_ControleDeFluxoSwitchTradicional {
    public static void main(String[] args) {
        double firstNumber = 100;
        double secondNumber = 20;

        String switchValue = "SOMA";
        String operation = switchValue.toLowerCase();

        switch (operation) {
            case "soma":
                double addition = firstNumber + secondNumber;
                System.out.println(firstNumber + " + " + secondNumber + " = " + addition);
                break;
            case "subtracao":
                double subtraction = firstNumber - secondNumber;
                System.out.println(firstNumber + " - " + secondNumber + " = " + subtraction);
                break;
            case "multiplicacao":
                double multiplication = firstNumber * secondNumber;
                System.out.println(firstNumber + " * " + secondNumber + " = " + multiplication);
                break;
            case "divisao":
                double division = firstNumber / secondNumber;
                System.out.println(firstNumber + " / " + secondNumber + " = " + division);
                break;
            default:
                System.out.println("Operação matemática inválida!");
                break;
        }
    }
}
