/*

Question 10: Find the Average of Elements in the Array.

Problem Statement:
Write a Java program that asks the user to input 5 integers, stores them in an array, and then calculates and prints the average of the elements in the array.
Sample Input:
Enter 5 integers: 10 20 30 40 50

Expected Output:
The average of the numbers is: 30.0

*/

import java.util.Scanner;

class AverageArray {
    public static void main(String args[]) 
	{
        int[] num = new int[5];
        int sum = 0;
		int i;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 integers: ");

        
        for ( i = 0; i < num.length; i++) 
		{
            num[i] = sc.nextInt();
        }

        
        for (int n : num) 
		{
            sum += n;
        }

        
        double average = (double) sum / num.length;
        System.out.println("The average of the numbers is: " + average);

        
    }
}
/*

PS D:\0 - CDAC 2025\3 - Assignment 4 (codes)> javac AverageArray.java
PS D:\0 - CDAC 2025\3 - Assignment 4 (codes)> java AverageArray
Enter 5 integers:
10
20
30
40
50

*/