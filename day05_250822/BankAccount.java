package day05_250822;

public class BankAccount {
    final int id;
    String name;
    private double balance;

    public BankAccount(int id, String name, double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public void deposit(double cash)
    {
        if (cash < 0)
        {
            System.out.println("입금액은 최소 0원입니다.");
        }
        else
        {
            balance += cash;
        }
    }

    public void withdraw(double cash)
    {
        if (balance >= cash) {
            balance -= cash;
        }
        else
        {
            System.out.println("잔액 부족");
        }

    }

    public double getBalance()
    {
        return balance;
    }
}
