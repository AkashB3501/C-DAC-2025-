/*
11. Bank Account Types

Scenario: Bank provides different account types.

Problem Statement:
Superclass Account → accountNo, balance. Subclass SavingAccount → interestRate. Subclass
CurrentAccount → overdraftLimit. Display account details.
Classes/Fields:
● Account → accountNo, balance
● SavingAccount → interestRate
● CurrentAccount → overdraftLimit

Sample Input:
Saving → accountNo=101, balance=5000, interestRate=5%
Current → accountNo=102, balance=10000, overdraftLimit=2000

Sample Output:
Saving → 101, Balance=5000, Interest=5%
Current → 102, Balance=10000, Overdraft=2000

*/

class Account {
    int accountNo;
    double balance;

    Account(int accountNo, double balance) 
	{
        this.accountNo = accountNo;
        this.balance = balance;
    }

    void display() 
	{
        System.out.println("Account No: " + accountNo + ", Balance=" + balance);
    }
}

class SavingAccount extends Account
 {
    double interestRate;

    SavingAccount(int accountNo, double balance, double interestRate)
	{
        super(accountNo, balance);
        this.interestRate = interestRate;
    }

    void display()
	{
        System.out.println("Saving → " + accountNo + ", Balance=" + balance + ", Interest=" + interestRate + "%");
    }
}

class CurrentAccount extends Account
 {
    double overdraftLimit;

    CurrentAccount(int accountNo, double balance, double overdraftLimit) 
	{
        super(accountNo, balance);
        this.overdraftLimit = overdraftLimit;
    }

    void display()
	{
        System.out.println("Current -> " + accountNo + ", Balance=" + balance + ", Overdraft=" + overdraftLimit);
    }
}

class Q11_Account 
{
    public static void main(String[] args) {
        SavingAccount s = new SavingAccount(101, 5000, 5);
        CurrentAccount c = new CurrentAccount(102, 10000, 2000);

        s.display();
        c.display();
    }
}

/*

PS D:\Assignment 3 (codes)> javac Q11_Account.java
PS D:\Assignment 3 (codes)> java Q11_Account

Saving -> 101, Balance=5000.0, Interest=5.0%
Current -> 102, Balance=10000.0, Overdraft=2000.0

*/