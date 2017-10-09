public class Administrator extends Employee {
    private String officeHours;
    private int rank;

    public Administrator(String name, String address, String phone_number, String email_address) {
        super(name, address, phone_number, email_address);
    }

    public void setOfficeHours(String officeHours) { this.officeHours = officeHours; }
    public String getOfficeHours() { return this.officeHours; }

    public void setRank(int rank) { this.rank = rank; }
    public int getRank() { return this.rank; }

    @Override
    public String toString() {
        return  super.toString() + ", " +
                "Office Hours: " + this.getOfficeHours() + ", " +
                "Rank: " + this.getRank();
    }
}
