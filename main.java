package SorteOpgaver.ch8.aske1208_a_08_13;

public class main
{
    public static void main(String[] args)
    {
        BankAccount yana = new BankAccount("Yana", 3.03);
        BankAccount ben = new BankAccount("Ben", 100.54);

        System.out.println(ben);
        System.out.println(yana);

        ben.transfer(50, yana);

        System.out.println(ben);
        System.out.println(yana);

    }
}
