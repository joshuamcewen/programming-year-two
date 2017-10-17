public class Car implements Vehicle {

    /**
    *   The Car class defines standard methods for a Car.
    *
    *   @author Joshua McEwen
    *
    * */

    private int yearsOld;

    /**
    *   Constructor for a Car, sets the age of the vehicle.
    *   @param yearsOld The age of the Car in years.
    * */
    public Car(int yearsOld) {
        this.yearsOld = yearsOld;
    }

    @Override
    public int taxValue() {
        return 25 * this.yearsOld;
    }

    @Override
    public String vehicleType() {
        return "Car";
    }
}
