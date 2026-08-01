public class ContaBancaria {
    private String number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhone;

    public ContaBancaria() {
        this("43123", 5.50, "Default name", "Default address", "Default phone");
        System.out.println("Chamada de construtor vazio");
    }

    public ContaBancaria(String number, double balance,  String customerName, String customerEmail, String customerPhone) {
        System.out.println("Construtor de Conta Bancária com parâmetros");
        this.number = number;
        this.balance = balance;
        customerName = customerName;
        customerEmail = customerEmail;
        customerPhone = customerPhone;
    }

    public ContaBancaria(String customerName,  String customerEmail, String customerPhone) {
        this("58941", 100.00, customerName, customerEmail, customerPhone);
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public void depositFunds(double depositAmount) {
        balance += depositAmount;
        System.out.println("Depósito de $" + depositAmount + " feito. Novo saldo: " + balance);
    }

    public void withdrawFunds(double withdrawAmount) {
        if (balance - withdrawAmount < 0) {
            System.out.println("Fundo insuficiente! Você tem somente $" + balance +
                    " processado. Saldo remanescente = $" + balance);
        }
    }
}
