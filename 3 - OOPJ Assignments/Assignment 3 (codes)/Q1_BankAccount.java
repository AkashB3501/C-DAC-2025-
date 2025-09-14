/*
1. Bank Account Protection
Scenario: You are creating a simple banking system. A user should not be able to directly change their
balance.
Problem Statement:
Create a class BankAccount with a private variable balance. Provide deposit() and withdraw() methods to
change balance. Provide a getter to view balance. Validate that withdrawal cannot exceed balance.
Class/Fields:
● private double balance
Methods:
● deposit(double amount) → add to balance
● withdraw(double amount) → subtract from balance if sufficient
● getBalance() → returns current balance
Sample Input:
Deposit = 5000
Withdraw = 2000
Sample Output:
Updated Balance = 3000


*/

import java.util.Scanner;

class Q1_BankAccount 
{
    private double balance;

    public void deposit(double amount) 
	{
        balance += amount;
    }

    public void withdraw(double amount)
	{
        if (amount <= balance) 
		{
            balance -= amount;
        } 
		else 
		{
            System.out.println("Insufficient balance");
        }
    }

    public double getBalance()
	{
        return balance;
    }

    public static void main(String args[]) 
	{
		int D;
		int W;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Deposite = ");
		D = sc.nextInt();
		
		System.out.print("Withdraw = ");
		W = sc.nextInt();
		
        Q1_BankAccount acc = new Q1_BankAccount();
        acc.deposit(D);
        acc.withdraw(W);
		
        System.out.println("Updated Balance = " + acc.getBalance());
	
		
    }
}
/*
PS D:\0 - CDAC 2025\Assignment 3(codes)> javac Q1_BankAccount.java
PS D:\0 - CDAC 2025\Assignment 3(codes)> java Q1_BankAccount

Deposite = 5000
Withdraw = 2000
Updated Balance = 3000.0



*/