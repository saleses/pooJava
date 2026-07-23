public class _09_MethodMinMaxValuesPrimitivesTypes {
    public static void main(String[] args) {

        System.out.println("Intervalo de valores válidos dos tipos primitivos:\n");
        System.out.println("byte: " + minByteValue() + " a " + maxByteValue());
        System.out.println("short: " + minShortValue() + " a " + maxShortValue());
        System.out.println("integer: " + minIntegerValue() + " a " + maxIntegerValue());
        System.out.println("long: " + minLongValue() + " a " + maxLongValue());
        System.out.println("float: " + minDoubleValue() + " a " + maxDoubleValue());
        System.out.println("double: " + minDoubleValue() + " a " + maxDoubleValue());
    }

    public static byte minByteValue() {
        byte minByteValue = Byte.MIN_VALUE;
        return minByteValue;
    }

    public static byte maxByteValue() {
        byte maxByteValue = Byte.MAX_VALUE;
        return maxByteValue;
    }

    public static short minShortValue() {
        short minShortValue = Short.MIN_VALUE;
        return minShortValue;
    }

    public static short maxShortValue() {
        short maxShortValue = Short.MAX_VALUE;
        return maxShortValue;
    }

    public static int minIntegerValue () {
        int minValue = Integer.MIN_VALUE;
        return minValue;
    }

    public static int maxIntegerValue () {
        int maxValue = Integer.MAX_VALUE;
        return maxValue;
    }

    public static long minLongValue () {
        long minValue = Long.MIN_VALUE;
        return minValue;
    }

    public static long maxLongValue () {
        long maxValue = Long.MAX_VALUE;
        return maxValue;
    }

    public static float minFloatValue () {
        float minValue = Float.MIN_VALUE;
        return minValue;
    }

    public static float maxFloatValue () {
        float maxValue = Float.MAX_VALUE;
        return maxValue;
    }

    public static double minDoubleValue () {
        double minValue = Double.MIN_VALUE;
        return minValue;
    }

    public static double maxDoubleValue () {
        double maxValue = Double.MAX_VALUE;
        return maxValue;
    }
}
