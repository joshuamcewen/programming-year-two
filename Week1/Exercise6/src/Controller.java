/**
 * Created by Joshua on 26/09/2017.
 */
public class Controller {
    public static void main(String[] args)
    {
        int[] numbers = {1, 2, 3, 4, 5, 6};

        // Print number at index 0.
        //System.out.println("Number at index 0 is " + numbers[0]);

        // Load numbers into array
        for(int i = 0; i < numbers.length; i++)
        {
            numbers[i] = i * 2;
        }

        // Print numbers in array
        for(int i = 0; i < numbers.length; i++)
        {
            System.out.println("The number at index " + i + " is " + numbers[i]);
        }
    }
}


