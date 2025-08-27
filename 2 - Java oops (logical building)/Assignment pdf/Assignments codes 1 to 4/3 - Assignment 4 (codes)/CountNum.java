/*
Question 11: Count Positive and Negative Numbers in an Array
Problem Statement:
Write a Java program that asks the user to input 6 integers, stores them in an array, and then counts how many positive and negative numbers are present in the array.
Sample Input:
Enter 6 integers: -5 3 7 -2 0 8

Expected Output:
Positive numbers: 3
Negative numbers: 2
*/

import java.util.Scanner;

class CountNum {
    public static void main(String args[]) 
	{
	   
        int[] numbers = new int[6];
        int positive = 0, negative = 0;
		int i;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 6 integers: ");
		
        for ( i = 0; i < numbers.length; i++) 
		{
            numbers[i] = sc.nextInt();
        }
      
        for (int n : numbers) 
		{
            if (n > 0) {
                positive++;
            } else if (n < 0) {
                negative++;
            }
        }
        System.out.println("Positive numbers: " + positive);
        System.out.println("Negative numbers: " + negative);

        sc.close();
    }
}
