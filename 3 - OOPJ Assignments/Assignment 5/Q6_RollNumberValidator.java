/*
Problem 6: Unique Roll Number Validator
Use Case: A registration system must ensure no duplicate roll numbers are assigned.
Requirements:
● Accept roll numbers for registration
● Automatically remove duplicates
● Display unique roll numbers
Sample Input:
Roll numbers: 101, 102, 101, 103
Expected Output:
Unique Roll Numbers: 101, 102, 103

*/
import java.util.*;

class Q6_RollNumberValidator{
	
	
	public static void main(String args[])
	{
		Set<Integer> rollNum = new HashSet<>();
		
		int[] num = {101,102,101,103};
		
		for(int n : num) rollNum.add(n);
		{
			System.out.println("Unique ROll Numbers: "+rollNum);
			
		}
	}
}
/*
PS D:\Assignment 5> javac Q6_RollNumberValidator.java
PS D:\Assignment 5> java Q6_RollNumberValidator

Unique ROll Numbers: [101, 102, 103]

*/