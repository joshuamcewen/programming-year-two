/**
 * Created by Joshua on 02/10/2017.
 */
public class PolySolve {

    private double a, b, c, d;

    public PolySolve(double a, double b, double c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = b * b - 4 * a * c;
    }

    private double getFirstRoot()
    {
        return (-this.b + Math.sqrt(this.d)) / (2 * a);
    }
    private double getSecondRoot()
    {
        return (-this.b - Math.sqrt(this.d)) / (2 * a);
    }

    public void display()
    {
        System.out.println(a + "x^2 + " + b + "x + " + c + " = 0");

        if(this.a == 0)
        {
            System.out.println("This is not a quadratic.");
        }
        else if(this.d >= 0)
        {
            System.out.println("First root: " + this.getFirstRoot());
            System.out.println("Second root: " + this.getSecondRoot());
        }
        else
        {
            System.out.println("No real roots for this quadratic.");
        }
    }

}
