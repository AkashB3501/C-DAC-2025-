/*
Question 6: Find the Average of Elements in the Array.
Problem Statement:
Write a Java program that uses a for-each loop to print all elements of an integer array. The program should ask the user to input 5 integers, store them in an array, and then print all the elements using a for-each loop.
Sample Input:
Enter 5 integers: 3 7 12 5 8

Expected Output:
3 7 12 5 8

*/


import java.util.Scanner;
class ForEachArray {
	public static void main(String args[])
	{
		
		int i;
		int num[] = new int[5];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 5 integers: ");
		
		for(i =0; i<5; i++)
		{
			num[i] = sc.nextInt();
			
		}
		
		System.out.println(" Array elements are :");
		
		for(int num1 : num)
		{
			System.out.print(num1 + " ");
		}
	}
}

 /* PS D:\0 - CDAC 2025\3 - Assignment 4 (codes)> javac ForEachArray.java
PS D:\0 - CDAC 2025\3 - Assignment 4 (codes)> java ForEachArray
Enter 5 integers:
3
7
12
5
8
 Array elements are :
3 7 12 5 8             */	