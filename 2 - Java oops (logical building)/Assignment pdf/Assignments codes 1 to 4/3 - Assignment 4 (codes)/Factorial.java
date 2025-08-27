/* Question 3: Calculate the Factorial of a Number
Problem Statement:
Write a Java program that asks the user for a number N and calculates the factorial of N using a for loop.
Sample Input:
Enter a number: 5
Expected Output:
Factorial of 5 is 120

*/


import java.util.Scanner;

class Factorial{
   public static void main(String args[])
  {
	int n,i;
	long fact = 1;
	
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number: ");
	n = sc.nextInt();
	
	for(i = 2; i<= n ;i++)
	{
		fact *= i;
		
	}
	System.out.println("Factorial of " + n + " is " + fact);
		
  }
}

/*
PS D:\0 - CDAC 2025\3 - Assignment 4 (codes)> javac Factorial.java
PS D:\0 - CDAC 2025\3 - Assignment 4 (codes)> java Factorial
Enter a number: 5
Factorial of 5 is 120
*/