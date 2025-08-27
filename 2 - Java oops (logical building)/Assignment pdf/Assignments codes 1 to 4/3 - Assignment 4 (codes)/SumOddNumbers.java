/*
question 5: Sum of Odd Numbers between 1 and N
Problem Statement:
Write a Java program that asks the user for a number N and calculates the sum of all odd numbers between 1 and N using a for loop.
Sample Input:
Enter a number: 10

Expected Output:
The sum of odd numbers from 1 to 10 is: 25
*/

import java.util.Scanner;

class SumOddNumbers {
    public static void main(String args[]) 
	{   
	    int n,i;
		
        Scanner sc = new Scanner(System.in);
		
        System.out.print("Enter a number: ");
         n = sc.nextInt();

        int sum = 0;

        
        for ( i = 1; i <= n; i += 2) {
            sum += i;
        }

        System.out.println("The sum of odd numbers from 1 to " + n + " is: " + sum);
       
    }
}

/*

PS D:\0 - CDAC 2025\3 - Assignment 4 (codes)> javac SumOddNumbers.java
PS D:\0 - CDAC 2025\3 - Assignment 4 (codes)> java SumOddNumbers
Enter a number: 10
The sum of odd numbers from 1 to 10 is: 25

*/
