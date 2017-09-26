/**
 * Created by Joshua on 26/09/2017.
 */
import java.util.Scanner;

public class Controller {
    public static void main(String[] args)
    {
        float balance, withdraw, deposit;
        balance = withdraw = deposit = 0.0f;

        // Input balance
        System.out.println("Please enter bank balance > ");
        Scanner input = new Scanner(System.in);

        // Print balance
        balance = input.nextFloat();
        System.out.println("Balance: " + balance);

        String commandStr = "";

        do
        {
            System.out.print("Enter q = Quit, w = Withdraw, d = Deposit > ");
            commandStr = input.next();

            // Withdraw money
            if(commandStr.equals("w"))
            {
                System.out.println("Enter amount to withdraw > ");
                withdraw = input.nextFloat();
                balance -= withdraw;
            }
            // Deposit money
            else if(commandStr.equals("d"))
            {
                System.out.println("Enter amount to deposit > ");
                deposit = input.nextFloat();
                balance += deposit;
            }

            // Print new balance
            System.out.println("End balance: " + balance);
        } while(!commandStr.equals("q"));
    }

}
