/**
 * Created by Joshua on 02/10/2017.
 */
public class Controller {
    public static void main(String[] args)
    {
        Person bob = new Person("Bob", 48);

        Person peter = Person.newInstance(bob);
        peter.setName("Peter");

        System.out.println(bob);
        System.out.println(peter);
    }
}
