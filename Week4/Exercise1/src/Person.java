public class Person implements Comparable {

    private String firstName, lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getAge() {
        return this.age;
    }

    public int compareTo(Object anotherPerson) throws ClassCastException {
        if(!(anotherPerson instanceof Person)) {
            throw new ClassCastException("An object of the type Person was expected.");
        } else {
            int anotherPersonAge = ((Person) anotherPerson).getAge();
            return this.age - anotherPersonAge;
        }
    }

    @Override
    public String toString() {
        return this.getFirstName() + " " + this.getLastName() + ", age: " + this.getAge();
    }
}
