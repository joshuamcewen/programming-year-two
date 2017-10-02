/**
 * Created by Joshua on 02/10/2017.
 */
public class BankAccount {
    private double balance;

    public BankAccount()
    {
        this.balance = 0;
    }

    public BankAccount(double balance)
    {
        this.balance = balance;
    }

    public void deposit(double amount)
    {
        this.balance += amount;
    }

    public void withdraw(double amount)
    {
        this.balance -= amount;
    }

    public double getBalance()
    {
        return this.balance;
    }

}
