public class SchoolEnrollment {
    private int codeID;
    private String name;
    private int age;
    private String address;

    public SchoolEnrollment(int codeID, String name, int age, String address) {
        this.codeID = codeID;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public int getCodeID() {
        return  codeID;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public void registerStudent(int codeID, String name, int age, String address) {
        System.out.println("ID: " + codeID + "\nNome: " + name + "\nIdade: " + age + "\nEndereço: " + address);
    }
}
