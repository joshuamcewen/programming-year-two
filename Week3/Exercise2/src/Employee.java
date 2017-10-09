import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee extends Person {
    private String department;
    private double salary;
    private Date startDate;
    private SimpleDateFormat dateFormat;

    public Employee() {
        super();
        this.department = "Undefined";
        this.salary = 0;
        this.startDate = new Date("01/01/1970");
        this.dateFormat = new SimpleDateFormat("dd/mm/yy");
    }

    public Employee(String name, String address, String phone_number, String email_address) {
        super(name, address, phone_number, email_address);
    }

    public Employee(String department, double salary, Date startDate) {
        super();
        this.department = department;
        this.salary = salary;
        this.startDate = startDate;
    }

    public void setDepartment(String department) { this.department = department; }
    public String getDepartment() { return this.department; }

    public void setSalary(double salary) { this.salary = salary; }
    public double getSalary() { return this.salary; }

    public void setStartDate(Date startDate) { this.startDate = startDate; }
    public Date getStartDate() { return this.startDate; }

    @Override
    public String toString() {
        return  super.toString() + ", " +
                "Department: " + this.getDepartment() + ", " +
                "Salary: " + this.getSalary() + ", " +
                "Start date: " + this.getStartDate();
    }
}
