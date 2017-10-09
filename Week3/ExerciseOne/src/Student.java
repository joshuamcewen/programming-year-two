public class Student {
    private String name;
    private int stuNumber;

    Student(String name, int stuNumber) {
        this.name = name;

        if(stuNumber >= 1 && stuNumber <= 10000) {
            this.stuNumber = stuNumber;
        } else {
            throw new IllegalArgumentException("Student number must be between 1 and 10000.");
        }
    }

    public String getName() {
        return this.name;
    }

    public int getNum() {
        return this.stuNumber;
    }

    @Override
    public String toString() {
        return "Name: " + this.getName() + ", ID: " + this.getNum();
    }
}
