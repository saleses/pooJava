public class Main {
    public static void main(String[] args) {

        Employee julio = new Employee("Júlio", "10/04/1983", "01/01/2020");
        System.out.println(julio);
        System.out.println("Age = " + julio.getAge());
        System.out.println("Pay = " + julio.collectPay());

        Employee vanessa = new Employee("Vanessa", "11/01/1989", "03/03/2020");
        System.out.println(vanessa);
        System.out.println("Vanessa Paycheck = $" + vanessa.collectPay());

        //vanessa.retire();
        System.out.println("Vanessa Pension check = $" + vanessa.collectPay());

        HourlyEmployee maria = new HourlyEmployee("Maria", "16/10/1978", "10/10/2022", 15);
        System.out.println(maria);
        System.out.println("Maria Paycheck = $" + maria.collectPay());
        System.out.println("Maria Pension check = $" + maria.collectPay());
    }
}
