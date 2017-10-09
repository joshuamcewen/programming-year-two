public class Controller {
    public static void main(String[] args) {
        Student homeStud1 = new Student("Josh", 2124);
        System.out.println(homeStud1);

        Student homeStud2 = new Student("Khuram", 1938);
        System.out.println(homeStud2);

        Student overStud1 = new OverseasStudent("Pierre", 1059, "France");
        System.out.println(overStud1);

        Student overStud2 = new OverseasStudent("Alex", 1024, "Germany");
        System.out.println(overStud2);
    }
}
