public class Main {
    public static void main(String[] args) {

        SchoolEnrollment student1 = new SchoolEnrollment(43241, "Eduardo", 15, "Rua Fonseca, Casa 10");
        System.out.println(student1.getCodeID());
        System.out.println(student1.getName());
        System.out.println(student1.getAge());
        System.out.println(student1.getAddress());
        System.out.println("=======================");
        student1.registerStudent(52341, "Fabio", 15, "Bairro do Flamengo, Rua Paysandu");
    }
}
