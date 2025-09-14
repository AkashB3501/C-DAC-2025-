/*
Problem 13: Bank Deposit & Withdrawal
Scenario:
Extend previous problem. Add methods:
● deposit(double amount) → adds to balance
● withdraw(double amount) → subtracts from balance
● Create two accounts, perform deposit/withdraw, display updated balance.

*/

class Q13_BankAccount 
{
    
	String accountHolder;
    private double balance;

     Q13_BankAccount(String accountHolder, double balance) 
	{
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    double getBalance() 
    {
        return balance;
    }

    public void setBalance(double balance)
	{
        if (balance < 0 || balance > 0)
		{
            this.balance = balance;
        }
    }

    public void deposit(double amount)
	{
        if (amount > 0) 
		{
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) 
		{
            balance -= amount;
        }
    }

    public void displayInfo() 
	{
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }

    public static void main(String args[]) 
	{
        Q13_BankAccount acc1 = new Q13_BankAccount("Akash", 1000.0);
        Q13_BankAccount acc2 = new Q13_BankAccount("Bhushan", 500.0);

        acc1.deposit(200.0);
        acc1.withdraw(150.0);

        acc2.deposit(100.0);
        acc2.withdraw(50.0);

        System.out.println("Account 1 Details: ");
        acc1.displayInfo();

        System.out.println("Account 2 Details: ");
        acc2.displayInfo();
    }
}
/*
PS D:\0 - CDAC 2025\Assignment 2 (Codes)> javac  Q13_BankAccount.java
PS D:\0 - CDAC 2025\Assignment 2 (Codes)> java  Q13_BankAccount
Account 1 Details:
Account Holder: Akash
Balance: 1050.0
Account 2 Details:
Account Holder: Bhushan
Balance: 550.0

*/