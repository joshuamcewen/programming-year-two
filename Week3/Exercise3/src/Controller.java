import java.util.Date;

public class Controller {
    public static void main(String[] args) {
        // Person object.
        Person person1 = new Person("Jeff", "32 Oxford Road", "+44759230131", "jeff@mmu.ac.uk");
        System.out.println(person1.toString());
        System.out.println();

        // Declared as a Person object, polymorphism.
        Person student1 = new Student("Sam", "43 Corporation Street", "+44753920421", "sam@stu.mmu.ac.uk", true);
        System.out.println(student1.toString());
        System.out.println();

        // Administrator object
        Administrator admin1 = new Administrator("James", "12 Oldfield Moor", "+44161320453", "james@adm.mmu.ac.uk");
        admin1.setDepartment("Administration");
        admin1.setSalary(25000);
        admin1.setStartDate(new Date("01/02/2009"));
        admin1.setOfficeHours("Thursdays 12-2pm");
        admin1.setRank(1);
        System.out.println(admin1.toString());
        System.out.println();

        // Lecturer object
        Lecturer lecturer1 = new Lecturer("Alan", "Man Met", "+44161234562", "alan@mmu.ac.uk", "Dr");
        lecturer1.setDepartment("Computing");
        lecturer1.setSalary(123456);
        lecturer1.setStartDate(new Date("04/01/2003"));
        System.out.println(lecturer1.toString());
    }
}
