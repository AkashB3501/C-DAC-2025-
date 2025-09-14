/*
Problem 14: Bank Name Display
Scenario:
Add a static variable bankName = "CDAC Bank" and static method displayBankName() to
BankAccount.
● Call displayBankName() from main.
● Create one account to verify instance creation.

*/

class Q14_BankName {

    String accountHolder;
    double balance;
	static String bankName = "CDAC Bank";

  
    Q14_BankName(String accountHolder, double balance) 
	{
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    static void displayBankName() 
	{
        System.out.println("Bank Name: " + bankName);
    }

    
    void AccountDetails()
	{
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }

  public static void main(String args[]) 
   {
        
        Q14_BankName.displayBankName();

        Q14_BankName acc1 = new Q14_BankName("Akash", 5000);    
        acc1.AccountDetails();
   }
}
/*
PS D:\0 - CDAC 2025\Assignment 2 (Codes)> javac Q14_BankName.java
PS D:\0 - CDAC 2025\Assignment 2 (Codes)> java Q14_BankName
Bank Name: CDAC Bank
Account Holder: Akash
Balance: 5000.0

*/