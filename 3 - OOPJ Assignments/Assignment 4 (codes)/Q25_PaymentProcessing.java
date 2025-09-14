/*
Problem 25: Payment Processing

Scenario: An e-commerce system receives payment amounts as strings from web forms and needs to
convert them to integers for financial calculations.
Task: Parse string input to integer and perform calculations.

Sample Input:
Amount as string: 1000
Additional amount to add: 500

Expected Output:
1000 + 500 = 1500

*/

import java.util.*;

class Q25_PaymentProcessing {
	
    public static void main(String args[]) 
	{
		
        Scanner sc = new Scanner(System.in);

        System.out.print("Amount as string: ");
        String amountStr = sc.nextLine();
  
        System.out.print("Additional amount to add: ");
		
        int additional = sc.nextInt();

        int amount = Integer.parseInt(amountStr);
       
        int total = amount + additional;
       
        System.out.println(amount + " + " + additional + " = " + total);

    }
}
/*
 PS D:\0 - CDAC 2025\Assignment 4 (codes)> java Q25_PaymentProcessing
Amount as string: 1000
Additional amount to add: 500
1000 + 500 = 1500

*/