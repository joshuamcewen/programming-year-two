public class Controller {

    /**
    *   The Controller class instantiates objects of the Car and
    *   Motorbike classes for printing.
    *
    *   @author Joshua McEwen
    *
    * */

    public static void main(String[] args) {
        Car car1 = new Car(6);
        System.out.println(car1.vehicleType() + ", Tax: £" + car1.taxValue());

        Motorbike bike1 = new Motorbike(5);
        System.out.println(bike1.vehicleType() + ", Tax: £" + bike1.taxValue());
    }
}
