/*
Question 9: Find the Largest Element in an Array
Problem Statement:
Write a Java program that asks the user to input 5 integers, stores them in an array, and then finds and prints the largest element in the array. (Explore in-built method to solve this)
Sample Input:
Enter 5 integers: 12 45 67 23 89

*/

import java.util.Scanner;
import java.util.Arrays;

class LargestElement{
  public static void main(String args[])
  {
	  int[] num = new int[5];
	  int i,largest;
	  
	  Scanner sc = new Scanner(System.in);
	  
	  System.out.println("Enter 5 integers: ");
	  
	  for(i = 0; i< num.length; i++)
	  {
		  num[i]=sc.nextInt();
	  }
	  
	  largest =  Arrays.stream(num).max().getAsInt();
	  System.out.println("The largest element is: "+ largest);
	  
  }
}

/*
PS D:\0 - CDAC 2025\3 - Assignment 4 (codes)> javac LargestElement.java
PS D:\0 - CDAC 2025\3 - Assignment 4 (codes)> java LargestElement
Enter 5 integers:
12
45
67
23
89
The largest element is: 89

*/