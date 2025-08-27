
/* Question 1: Print Numbers from 1 to N
Problem Statement:
Write a Java program that asks the user for a number N and then prints the numbers from 1 to N using a for loop.
Sample Input:
Enter a number: 10
Expected Output:
1 2 3 4 5 6 7 8 9 10  */

import java.util.Scanner; 

class PrintNumber 
{
	public static void main(String args[])
	{
		int i,n;
		Scanner sc = new Scanner(System.in);
	
		System.out.print("Enter a number : ");
		n=sc.nextInt();
		
		for(i = 1;i<=n;i++)
		{
			System.out.println(i + " ");
		}
	}
}

/*PS D:\0 - CDAC 2025\3 - Assignment 4 (codes)> javac PrintNumber.java
PS D:\0 - CDAC 2025\3 - Assignment 4 (codes)> java PrintNumber
Enter a number : 10
1
2
3
4
5
6
7
8
9
10
PS D:\0 - CDAC 2025\3 - Assignment 4 (codes)>  */	
