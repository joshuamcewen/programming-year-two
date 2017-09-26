/**
 * Created by Joshua on 26/09/2017.
 */
import java.util.Scanner;

public class Controller {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        char ans;

        System.out.println("Do you want to go into the loop [Y/N] >");
        ans = sc.next().charAt(0);

        while(ans == 'Y')
        {
            System.out.println("Do you want to stay into the loop [Y/N] >");
            ans = sc.next().charAt(0);
        }

        System.out.println("Program finished.");
    }
}
