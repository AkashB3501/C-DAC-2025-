/*
Problem 6: Age Restriction

Scenario: A professional workshop registration system only allows participants who are 18 years or
older. The system needs a custom exception for age validation.
Task: Create a custom exception class and use it to validate user age during registration.

Sample Input:
16

Expected Output:
AgeNotValidException: Age must be ≥ 18

*/

import java.util.*;

class AgeValid extends Exception
{
     public AgeValid(String m)
    {
	      super(m);
    }
} 
 
 class Q6_AgeRestriction{
	
	 public static void main(String args[])
	 {
		int age;
		
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age: ");
		
		age = sc.nextInt();
		
		try {
			
			if(age < 18)
			{
				throw new AgeValid("Age must > 18");
			}
			System.out.println("Registration successful");
		}	
		catch(AgeValid e)
		{
			System.out.println("AgeNotValidException: "+e.getMessage());
		}
		
		
	}
 
  } 
	 
/*
PS D:\0 - CDAC 2025\Assignment 4(codes)> javac Q6_AgeRestriction.java
PS D:\0 - CDAC 2025\Assignment 4(codes)> java Q6_AgeRestriction
Enter the age: 16
AgeNotValidException: Age must > 18

PS D:\0 - CDAC 2025\Assignment 4(codes)> java Q6_AgeRestriction
Enter the age: 20
Registration successful

*/ 
 
 