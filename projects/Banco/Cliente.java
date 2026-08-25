public class Cliente {
    private String titular;

    public Cliente(String titular) {
        this.titular = titular;
    }

    public String getTitular() {
        return titular;
    }

    @Override
    public String toString() {
        return getTitular();
    }
}