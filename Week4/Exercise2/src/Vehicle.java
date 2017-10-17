public interface Vehicle {

    /**
    *   The Vehicle interface defines methods required by all those
    *   that implement it.
    *
    *   @author Joshua McEwen
    *
    * */

    /**
    *   Function which returns the tax required for a vehicle.
    *   @return Tax to be paid for this vehicle.
    * */
    int taxValue();

    /**
    *   Function which returns the vehicle type as a string.
    *   @return A description of the vehicle type.
    * */
    String vehicleType();
}
