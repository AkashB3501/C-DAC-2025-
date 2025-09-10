/*
Problem 8: Bank Account Initialization
Scenario:
A bank wants to initialize the interest rate for all accounts once when the system starts. Each account
has account holder name, balance, and interest rate. Students should practice static blocks for
initialization and setters/getters to modify and access account details.
Tasks:
1. Create a BankAccount class.
2. Use a static block to initialize interest rate to 4%.
3. Create instance variables: name (String) and balance (double).
4. Create setters and getters for name and balance.
5. Print account details including interest rate.
Input Example:
Account1: Name="Rohit", Balance=5000
Account2: Name="Priya", Balance=15000
Expected Output:
Bank Interest Rate Initialized: 4.0%
Account1: Name=Rohit, Balance=5000.0, Interest Rate=4.0%
Account2: Name=Priya, Balance=15000.0, Interest Rate=4.0%
*/


public class Q8_BankAccount {

    String name;
    double balance;
    static double interestRate;

    static 
	{
        interestRate = 4.0;
        System.out.println("Bank Interest Rate Initialized: " + interestRate + "%");
    }

    void setdetails(String name, double balance) 
	{
        this.name = name;
        this.balance = balance;
    }

    String getName() 
	{
        return name;
    }

    double getBalance()
	{
        return balance;
    }

    static double getInterestRate() 
	{
        return interestRate;
    }

    void AccountDetails() 
	{
        System.out.println("Name=" + name + ", Balance=" + balance + ", Interest Rate=" + interestRate + "%");
    }

    public static void main(String args[])
	{
        Q8_BankAccount a1 = new Q8_BankAccount();
        a1.setdetails("Rohit", 5000);

        Q8_BankAccount a2 = new Q8_BankAccount();
        a2.setdetails("Priya", 15000);

        System.out.print("Account1: ");
        a1.AccountDetails();

        System.out.print("Account2: ");
        a2.AccountDetails();
    }
}
/*
PS D:\0 - CDAC 2025\Assignment 2 > javac  Q8_BankAccount.java
PS D:\0 - CDAC 2025\Assignment 2 > java  Q8_BankAccount

Bank Interest Rate Initialized: 4.0%
Account1: Name=Rohit, Balance=5000.0, Interest Rate=4.0%
Account2: Name=Priya, Balance=15000.0, Interest Rate=4.0%
*/