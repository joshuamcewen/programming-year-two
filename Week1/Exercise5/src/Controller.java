/**
 * Created by Joshua on 26/09/2017.
 */
import java.util.Scanner;

public class Controller {
    public static void main(String[] args)
    {
        float amount, amountReturn;
        char accountType;

        // Initialise variables
        amount = amountReturn = 0;

        Scanner input = new Scanner(System.in);

        // Take amount input
        System.out.print("Enter the investment amount > ");
        amount = input.nextFloat();

        // Take amount input
        System.out.print("Enter s =  Saver, d = Deposit, c = Child, l = Long > ");
        accountType = input.next().charAt(0);
        switch(accountType)
        {
            case 's': amountReturn = amount * 1.03f;  break; // Saver account (3%)
            case 'd': amountReturn = amount * 1.005f; break; // Deposit account (0.5%)
            case 'c': amountReturn = amount * 1.015f; break; // Child account (1.5%)
            case 'l': amountReturn = amount * 1.04f;  break; // Long term account (4%)
        }

        System.out.println("After year one, your returned investment will be " + amountReturn);
        System.out.println("That's an interest amount of " + (amountReturn - amount));

    }
}
