import java.util.Arrays;

public class OverseasStudent extends Student {
    private String homeCountry;
    private String[] possibleCountries = {"Spain", "France", "Nigeria", "Germany"};

    OverseasStudent(String name, int stuNumber, String homeCountry) {
        super(name, stuNumber);

        if(Arrays.asList(this.possibleCountries).contains(homeCountry)) {
            this.homeCountry = homeCountry;
        } else {
            throw new IllegalArgumentException("Home country is invalid.");
        }
    }

    public String getCountry() {
        return this.homeCountry;
    }

    @Override
    public String toString() {
        return super.toString() + ", Country: " + this.getCountry();
    }
}
