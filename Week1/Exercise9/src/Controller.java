import java.util.Scanner;

public class Controller {
    public static void main(String[] args)
    {
        // Declare and initialise variables
        Scanner input = new Scanner(System.in);
        float amountGBP = 0.0f;

        // Initial prompt
        System.out.print("Enter GBP (£) amount > ");

        // If no float, repeat prompt.
        while(!input.hasNextFloat())
        {
            System.out.print("Enter GBP (£) amount > ");
        }

        amountGBP = input.nextFloat();

        // Print currency conversions
        System.out.println(amountGBP + "GBP is equivalent to " + convertToUSD(amountGBP) + "USD");
        System.out.println(amountGBP + "GBP is equivalent to " + convertToEUR(amountGBP) + "EUR");
        System.out.println(amountGBP + "GBP is equivalent to " + convertToAUD(amountGBP) + "AUD");
    }

    private static float convertToUSD(float pounds)
    {
        return 1.34f * pounds;
    }

    private static float convertToEUR(float pounds)
    {
        return 1.14f * pounds;
    }

    private static float convertToAUD(float pounds)
    {
        return 1.70f * pounds;
    }
}
