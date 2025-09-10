/*

Problem 12: Bank Account Basic Info
Scenario:
Create BankAccount class with accountHolder and balance.
● Use parameterized constructor to initialize account.
● Create getter and setter for balance.
● In main, create one account and display details.

*/

class Q12_BankAccount 
{
     String accountHolder;
     double balance;

     Q12_BankAccount(String accountHolder, double balance)
	{
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    double getBalance() 
	{
        return balance;
    }

    void setBalance(double balance) 
	{
        if (balance < 0 || balance > 0) {
            this.balance = balance;
        }
    }

    public void displayInfo() 
	{
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }

    public static void main(String args[]) 
	{
        Q12_BankAccount  acc = new Q12_BankAccount("Akash", 15000.0);
        acc.displayInfo();
    }
	
	
}
/*
PS D:\0 - CDAC 2025\Assignment 2> javac Q12_BankAccount.java
PS D:\0 - CDAC 2025\Assignment 2> java Q12_BankAccount
Account Holder: Akash
Balance: 15000.0
*/