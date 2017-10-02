/**
 * Created by Joshua on 02/10/2017.
 */
public class Controller {
    public static void main(String[] args)
    {
        PolySolve equation1 = new PolySolve(0, 2.7, 6.0);
        equation1.display();

        System.out.println();

        PolySolve equation2 = new PolySolve(1, 9, 20);
        equation2.display();

        System.out.println();

        PolySolve equation3 = new PolySolve(1, 6, -2);
        equation3.display();
    }
}
