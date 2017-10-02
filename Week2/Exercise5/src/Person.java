/**
 * Created by Joshua on 02/10/2017.
 */
public class Person {

    private String name;
    private int age;

    public Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public static Person newInstance(Person original)
    {
        return new Person(original.getName(), original.getAge());
    }

    public void setName(String name)
    {
        this.name = name;
    }
    public String getName() { return this.name; }

    public void setAge(int age)
    {
        this.age = age;
    }
    public int getAge() { return this.age; }

    public String toString()
    {
        return "Name: " + this.getName() + ", Age: " + this.getAge();
    }
}
