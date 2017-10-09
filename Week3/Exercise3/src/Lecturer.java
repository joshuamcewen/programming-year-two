public class Lecturer extends Employee {
    private String title;

    public Lecturer(String name, String address, String phone_number, String email_address, String title) {
        super(name, address, phone_number, email_address);
        this.title = title;
    }

    public void setTitle(String title) { this.title = title; }
    public String getTitle() { return this.title; }

    @Override
    public String toString() {
        return  "Title: " + this.getTitle() + ", " + super.toString();
    }
}
