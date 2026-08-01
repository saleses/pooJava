public class Main {
    public static void main(String[] args) {
        ContaBancaria viviane =  new ContaBancaria();
        System.out.println(viviane.getNumber());
        System.out.println(viviane.getBalance());
        System.out.println(viviane.getCustomerName());
        System.out.println(viviane.getCustomerEmail());
        System.out.println(viviane.getCustomerPhone());
        System.out.println();

        System.out.println("Viviane: Transação bancária");
        viviane.withdrawFunds(100.0);
        viviane.depositFunds(250.0);
        viviane.withdrawFunds(50.0);
        System.out.println();

        System.out.println("Savio: Transação bancária");
        ContaBancaria savio = new ContaBancaria("Savio", "savio@email.com", "432123");
        System.out.println("Conta bancária: " + savio.getNumber() + "; Nome: " + savio.getCustomerName());
    }
}
