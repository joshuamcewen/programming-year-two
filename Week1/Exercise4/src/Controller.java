/**
 * Created by Joshua on 26/09/2017.
 */
import java.util.Scanner;

public class Controller {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int nextInt, largestInt, total;
        nextInt = largestInt = total = 0;

        System.out.print("Enter an integer. Enter -9999 to terminate > ");

        // While sentinel value is not met
        while((nextInt = input.nextInt()) != -9999)
        {
            // If valid then increment total
            if(nextInt >= 1 && nextInt <= 100)
            {
                total += nextInt;
                largestInt = nextInt > largestInt ? nextInt : largestInt;
            }
            else
            {
                System.out.println("Integers must be between 1 and 100 inclusively.");
            }

            // Iterate integer prompt
            System.out.print("Enter an integer. Enter -9999 to terminate > ");
        }

        // Final output
        System.out.println("Final total is " + total);
        System.out.println("Largest number entered is " + largestInt);
    }
}
