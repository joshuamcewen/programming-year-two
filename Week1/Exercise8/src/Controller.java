public class Controller {
    public static void main(String[] args)
    {
        System.out.println("35c is equivalent to " + celsiusToFahrenheit(35) + "f");
        System.out.println("95f is equivalent to " + fahrenheitToCelsius(95) + "c");
    }

    private static int celsiusToFahrenheit(int c)
    {
        return (int)(1.8 * c) + 32;
    }

    private static int fahrenheitToCelsius(int f)
    {
        return (int) ((f - 32) * 5)/9;
    }
}
