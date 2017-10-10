public class Student extends Person {

    private boolean enrolled;

    public Student(String name, String address, String phone_number, String email_address, boolean enrolled) {
        super(name, address, phone_number, email_address);
        this.setEnrolled(enrolled);
    }

    public void setEnrolled(boolean enrolled) { this.enrolled = enrolled; }
    public boolean getEnrolled() { return this.enrolled; }

    @Override
    public String toString() {
        return  super.toString() + ", " +
                "Enrolled: " + this.getEnrolled();
    }
}
