public class _08_MetodoVelocidade {
    public static void main(String[] args) {
        int acceleration;
        int slowdown;
        int speed = 0;

        speedUp(60,10);
        speedDown(60,61);
    }

    public static void speedUp(int speed, int acceleration) {
        speed += acceleration;

        if (speed > 100) {
            speed = 100;
            System.out.println("Velocidade máxima de "+ speed + " km/h alcançada!");
        } else {
            System.out.println("Velocidade = " + speed + " km/h");
        }
    }

    public static void speedDown(int speed, int slowdown) {
        speed -= slowdown;

        if  (speed < 0) {
            speed = 0;
            System.out.println("Velocidade mínima de " + speed + " km/h atingida.");
        } else {
            System.out.println("Velocidade = " + speed + " km/h");
        }
    }
}
