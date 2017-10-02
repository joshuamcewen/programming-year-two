/**
 * Created by Joshua on 02/10/2017.
 */
import java.util.Random;

public class Controller {
    public static void main(String[] args)
    {
        // Generate five random numbers between 1-10 inclusively.
        Random rand = new Random();

        for(int i = 0; i < 5; i++)
        {
            System.out.print((rand.nextInt(10) + 1) + " ");
        }

        System.out.println();
        // Generate 5 random doubles.
        Random rand2 = new Random(System.currentTimeMillis());

        for(int i = 0; i < 5; i++)
        {
            System.out.print(rand2.nextDouble() + " ");
        }
    }
}
