public class Motorbike implements Vehicle {

    /**
    *   The Motorbike class defines standard methods for a Motorbike.
    *
    *   @author Joshua McEwen
    *
    * */

    private int yearsOld;

    /**
    *   Constructor for a Motorbike, sets the age of the vehicle.
    *   @param yearsOld The age of the Motorbike in years.
    * */
    public Motorbike(int yearsOld) {
        this.yearsOld = yearsOld;
    }

    @Override
    public int taxValue() {
        return 15 * this.yearsOld;
    }

    @Override
    public String vehicleType() {
        return "Motorbike";
    }
}
