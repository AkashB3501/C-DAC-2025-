/*  Question 2: Print Multiples of 3 between 1 and N
Problem Statement:
Write a Java program that asks the user for a number N and prints all the multiples of 3 between 1 and N using a for loop.
Sample Input:
Enter a number: 20

Expected Output:
3 6 9 12 15 18           */

import java.util.Scanner;

class Multiples {
	public static void main(String args[])
	{
		int n,i;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		n = sc.nextInt();
		
		for(i=3; i<= n; i +=3)
		{
			System.out.println(i + " ");
		}
	}
}
		
/*OUTPUT  : PS D:\0 - CDAC 2025\3 - Assignment 4 (codes)> javac Multiples.java
PS D:\0 - CDAC 2025\3 -Assignment 4 (codes)> java Multiples
Enter a number: 20
3
6
9
12
15
18
PS D:\0 - CDAC 2025\3 - Assignment 4 (codes)> */	
