package SorteOpgaver.ch8.aske1208_a_08_13;

public class BankAccount
{
    //This is my variables, name of the owner, the owners balance, and the transactionfee associated with the account
    private String name;
    private double balance;
    private double transactionFee;

    public BankAccount(String name, double balance)
    {
        this.name = name;
        this.balance = balance;
    }

    //deposits money, adds amount to the balance of the account owner
    public void deposit(double amount)
    {
        balance = balance + amount;
    }

    //withdraws money, substracts amount from balance plus the transaction fee associated with the transaction, default 0
    public void withdraw(double amount)
    {
        double postBalance = balance - amount - transactionFee;

        if (postBalance > 0)
        {
            balance = postBalance;
        }else{
            System.out.println("Not enough funds");
        }
    }

    //Transfers money, transfers amount to another BankAccount and substracts the transfer fee from the transferer.
    public void transfer(double amount, BankAccount reciever)
    {
        transactionFee = 5;
        double postBalance = this.balance - amount - transactionFee;
        System.out.println(postBalance);

        if (postBalance > 0)
        {
            this.balance = postBalance;
            reciever.balance = reciever.balance + amount;
        }else{
            System.out.println("Not enough funds");
        }
    }

    //a custom toString returning a string with accountholders name and balance
    @Override
    public String toString() {
        String str = this.name + ", " + this.balance + "$";
        return str;
    }
}
