/*
Problem 20: Even Roll Number Filter

Use Case: Filter and display only students with even roll numbers.

Requirements:
● Process list of roll numbers
● Remove odd roll numbers
● Display filtered results

Sample Input:
Roll numbers: 101, 102, 103, 104

Expected Output:
Even Roll Numbers: 102, 104
*/

import java.util.*;


class Q20_EvenRollNumbers {
	 
	public static void main(String args[])
	{
		
		
		
      List<Integer> rollnum = new ArrayList<>(Arrays.asList(101,102,103,104));
	  
	  rollnum.removeIf(n -> n % 2 != 0);
	  
	  System.out.println("Even Roll Numbers: "+rollnum);

	

	}	
}
/*
PS D:\Assignment 5> javac Q20_EvenRollNumbers.java
PS D:\Assignment 5> java Q20_EvenRollNumbers

Even Roll Numbers: [102, 104]
*/