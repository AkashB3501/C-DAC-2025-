/*
Problem 20: Bank Account Security
Scenario: A banking system needs to ensure that once a bank account ID is assigned, it cannot be
changed for security and audit purposes.

Task: Demonstrate the use of final variables in a banking context.
Sample Input:
Account ID: 101
Expected Output:
Account ID = 101 (cannot be changed)

*/

import java.util.*;

class Q20_BankAccountSecurity 
{
    public static void main(String[] args) 
	{
		int accountId;
        Scanner sc = new Scanner(System.in);

       
         accountId = sc.nextInt();

        
        final int ACCOUNT_ID = accountId;

       
        System.out.println("Account ID = " + ACCOUNT_ID + " (cannot be changed)");

    }
}
/*

PS D:\0 - CDAC 2025\Assignment 4> javac Q20_BankAccountSecurity.java
PS D:\0 - CDAC 2025\Assignment 4> java Q20_BankAccountSecurity

101
Account ID = 101 (cannot be changed)

*/