public class _10_CastingToConvertNumber {
    public static void main(String[] args) {
        int integerToDouble;
        double doubleToInteger;

        System.out.println("inteiro para double: " + convertIntegerToDouble(33));
        System.out.println("double para inteiro: " + convertDoubleToInteger(10.3));
    }

    public static double convertIntegerToDouble(int integerToDouble) {
        return (double) integerToDouble;
    }

    public static int convertDoubleToInteger(double doubleToInteger) {
        return (int) doubleToInteger;
    }
}
