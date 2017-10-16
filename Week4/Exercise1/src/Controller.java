import java.util.Arrays;

public class Controller {
    public static void main(String[] args) {
        Person people[] = new Person[3];
        people[0] = new Person("Rick", "Sanchez", 86);
        people[1] = new Person("Morty", "Smith", 13);
        people[2] = new Person("Gerry", "Smith", 43);

        for(Person p : people) {
            System.out.println(p);
        }

        System.out.println();
        Arrays.sort(people);

        for(Person p : people) {
            System.out.println(p);
        }
    }
}
