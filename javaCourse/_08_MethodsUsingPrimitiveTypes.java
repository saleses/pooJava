public class _08_MethodsUsingPrimitiveTypes {
    public static void main(String[] args) {
        boolean logic;
        boolean character;
        boolean integer;
        boolean floatingPoint;

        logicValue(true);
        characterValue('C');
        integerValue(27);
        floatingPointValue(74);
    }

    public static boolean logicValue(boolean logic) {
        if (logic) {
            System.out.println("Valor lógico é '" +logic + "'");
            return logic;
        } else {
            System.out.println("Valor lógico é '" +logic + "'");
            return false;
        }
    }

    public static char characterValue(char character) {
        if (character == 'A' || character == 'a') {
            System.out.println("Caracter igual a '" + character + "'");
            return 'A';
        } else {
            System.out.println("Caracter não esperado '" + character + "' é diferente de 'A' e 'a'");
            return character;
        }
    }

    public static int integerValue(int integer) {
        if (integer > 10 && integer < 100) {
            System.out.println("Inteiro " + integer + " é maior que 10 E menor que 100");
            return integer;
        } else if (integer == 10) {
            System.out.println("Inteiro igual a " + integer);
            return integer;
        } else if (integer == 100) {
            System.out.println("Inteiro igual a " + integer);
            return integer;
        } else {
            System.out.println("Inteiro " + integer + " é menor que 10 OU maior que 100");
            return integer;
        }
    }

    public static double floatingPointValue(double floatingPoint) {
        if (floatingPoint <= 10 ||  floatingPoint >= 100) {
            System.out.println("Double " + floatingPoint + " é menor ou igual a 10 OU maior ou igual a 100");
            return floatingPoint;
        } else {
            System.out.println("Double " + floatingPoint + " é maior ou igual a 10 E menor ou igual a 100");
            return floatingPoint;
        }
    }
}
