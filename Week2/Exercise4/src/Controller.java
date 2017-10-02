/**
 * Created by Joshua on 02/10/2017.
 */
public class Controller {
    public static void main(String[] args)
    {
        // First account
        BankAccount crtAccount = new BankAccount();
        System.out.println("Current account : £" + crtAccount.getBalance());

        crtAccount.deposit(100);

        System.out.println("Current account : £" + crtAccount.getBalance());

        crtAccount.withdraw(25.42);
        System.out.println("Current account : £" + crtAccount.getBalance());

        System.out.println();

        // Second account
        BankAccount svgAccount = new BankAccount(2000.50);
        System.out.println("Savings account : £" + svgAccount.getBalance());

        svgAccount.deposit(1020.25);

        System.out.println("Savings account : £" + svgAccount.getBalance());

        svgAccount.withdraw(125.35);
        System.out.println("Savings account : £" + svgAccount.getBalance());
    }
}
