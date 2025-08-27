/*
Question 12: Sort an Array in Ascending Order
Problem Statement:
Write a Java program that asks the user to input 5 integers, stores them in an array, and then sorts the array in ascending order using the Arrays.sort() method. After sorting, print the sorted array.
Sample Input:
Enter 5 integers: 12 45 23 8 90

Expected Output:
Sorted array: 8 12 23 45 90
*/

import java.util.Scanner;
import java.util.Arrays; 

class SortArray 
{
    public static void main(String args[]) 
	{
        int[] numbers = new int[5];
		int i;
		
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 5 integers: ");
		
        for (i = 0; i < numbers.length; i++) 
		{
            numbers[i] = sc.nextInt();
        }

        Arrays.sort(numbers);

        System.out.println("Sorted array: ");
		
        for (int n : numbers) 
		{
            System.out.print(n + " ");
        }

        sc.close();
    }
}
