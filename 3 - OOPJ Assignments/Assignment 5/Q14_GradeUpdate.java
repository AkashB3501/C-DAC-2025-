/*
Problem 14: Grade Update System

Use Case: Update a student's marks in the grading system.
Requirements:

● Store student grades
● Update existing student's marks
● Display updated information

Sample Input:
Initial: "Rohan" → 78
Update: "Rohan" → 88

Expected Output:
Updated Grade: Rohan:88
*/

import java.util.*;


class Q14_GradeUpdate {
	
	public static void main(String args[])
	{
		
		Map <String,Integer> grades = new HashMap<>();
		
		grades.put("Rohan",78);
		
		grades.put("Rohan",88);
		
	    System.out.println("Update Grade: "+grades);
	  			
	}
	
}
/*

PS D:\Assignment 5> javac Q14_GradeUpdate.java
PS D:\Assignment 5> java Q14_GradeUpdate

Update Grade: {Rohan=88}

*/