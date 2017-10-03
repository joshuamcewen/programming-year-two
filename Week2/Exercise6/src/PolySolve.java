/**
 * Created by Joshua on 02/10/2017.
 */
public class PolySolve {

    // Declare variables and discriminant
    private double a, b, c, d;

    // Initialise equation
    public PolySolve(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = b * b - 4 * a * c;
    }

    // Calculate and return the roots.
    private double[] getRoots()
    {
        return new double[]{(-this.b + Math.sqrt(this.d)) / (2 * a), (-this.b - Math.sqrt(this.d)) / (2 * a)};
    }

    // Getters for different variables.
    private double getA() { return this.a; }
    private double getB() { return this.b; }
    private double getC() { return this.c; }

    // Add a quadratic object to another and return a new quadratic object.
    public PolySolve add(PolySolve product) {
        return new PolySolve(this.a + product.getA(), this.b + product.getB(), this.c + product.getC());
    }

    // Display the quadratic along with its roots.
    public void display()
    {
        double roots[] = this.getRoots();

        System.out.println(a + "x^2 + " + b + "x + " + c + " = 0");

        if(this.a == 0) {
            System.out.println("This is not a quadratic.");
        } else if(this.d >= 0) {
            System.out.println("First root: " + roots[0]);
            System.out.println("Second root: " + roots[1]);
        } else {
            System.out.println("No real roots for this quadratic.");
        }
    }

}
