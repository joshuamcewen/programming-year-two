import java.util.Date;

public class Controller {
    public static void main(String[] args) {

        // No details provided
        Employee employee1 = new Employee();
        System.out.println(employee1);

        // Add details
        employee1.setStartDate(new Date("09/03/2016"));
        employee1.setDepartment("Computing");
        employee1.setAddress("10 Copperfield Lane");
        System.out.println(employee1);

        System.out.println();

        // Personal details provided
        Employee employee2 = new Employee("Josh", "Man Met Ave.", "+447000000001", "josh@stu.mmu.ac.uk");
        System.out.println(employee2);
        System.out.println();

        // Employment details provided
        Employee employee3 = new Employee("Josh", 28000, new Date("09/22/2017"));
        System.out.println(employee3);
    }
}
