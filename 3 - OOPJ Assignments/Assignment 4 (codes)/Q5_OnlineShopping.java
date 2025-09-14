/*

Problem 5: Online Shopping
Scenario: An e-commerce platform processes orders by calculating the total price (quantity × unit price).
The system needs to handle invalid quantities and accessing non-existent products.
Task: Create an order processing method that handles multiple exception types.

Sample Input:
0
3
299.99 499.99 199.99
5

Expected Output:
Arithmetic Exception caught
or
Array Index Exception
*/

import java.util.*;

class Q5_OnlineShopping {
    
    static void processOrder(double[] products, int index, int quantity) 
	{
        try 
		{
            double price = products[index]; 
            try
			{
                double total = price * quantity; 
				
                if (quantity <= 0) 
				{
                    throw new ArithmeticException();
                }
                System.out.println("Total price: " + total);
				
            } catch (ArithmeticException e) 
			{
                System.out.println("Arithmetic Exception caught");
            }
        } catch (ArrayIndexOutOfBoundsException e)
		{
            System.out.println("Array Index Exception");
        }
    }

    public static void main(String args[]) 
	{   
	
	      int q,n,index;
	
         Scanner sc = new Scanner(System.in);

         q = sc.nextInt();   
         n = sc.nextInt();          

        double[] products = new double[n];
		
        for (int i = 0; i < n; i++)
		{
            products[i] = sc.nextDouble();   
        }

        index = sc.nextInt();    

        processOrder(products, index, q);

        
    }
}
/*
PS D:\0 - CDAC 2025\Assignment 4 (codes)> javac Q5_OnlineShopping.java
PS D:\0 - CDAC 2025\Assignment 4 (codes)> java Q5_OnlineShopping
0
3
299.99
499.99
199.99
5
Array Index Exception
*/