/**
 * Created by Joshua on 02/10/2017.
 */
public class Controller {
    public static void main(String[] args) {
        // Quadratic one
        PolySolve equation1 = new PolySolve(0, 2.7, 6.0);
        equation1.display();

        System.out.println();

        // Quadratic two
        PolySolve equation2 = new PolySolve(1, 9, 20);
        equation2.display();

        System.out.println();

        // Quadratic three
        PolySolve equation3 = new PolySolve(1, 6, -2);
        equation3.display();

        System.out.println();

        // Add two polynomials
        PolySolve sum = equation3.add(equation2);
        sum.display();
    }
}
