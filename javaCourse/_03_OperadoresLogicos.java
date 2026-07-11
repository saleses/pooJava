public class _03_OperadoresLogicos {
    public static void main(String[] args) {
        System.out.print("Humano ou Máquina?");

        boolean isHuman = true;
        boolean isMachine = false;

        if (isHuman) {
            System.out.print(" Sou um humano.");
        } else if (isMachine) {
            System.out.print(" Sou uma máquina.");
        } else if (isHuman || isMachine) {
            System.out.print(" Posso ser humano ou uma máquina.");
        } else if (isHuman && isMachine) {
            System.out.print(" Impossível! Humano ou máquina.");
        }

        System.out.println();
    }
}
