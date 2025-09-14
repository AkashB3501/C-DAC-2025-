/*

Problem 16: Grade-Based Student Filter

Use Case: Remove students with failing grades from the honor roll.

Requirements:
● Store student grades in a map
● Remove students with marks below 60
● Display remaining student

Sample Input:
Student grades: "Amit" → 85, "Priya" → 52, "Rohan" → 78
Filter threshold: 60

Expected Output:
Honor Roll: {Amit=85, Rohan=78}

*/

import java.util.*;

class Q6_GradeFilter
{
   public static void main(String args[])
   {
	   Map<String,Integer> grades = new HashMap<>();
	   
	    grades.put("Amit",85);
	    grades.put("Priya",52);
		grades.put("Rohan",78);
		
	  grades.entrySet().removeIf(entry -> entry.getValue() < 60);
	 
	  System.out.println("Honor Roll: "+ grades);
	  
	   
   }
}
/*

PS D:\Assignment 5> javac Q6_GradeFilter.java
PS D:\Assignment 5> java Q6_GradeFilter

Honor Roll: {Amit=85, Rohan=78}

*/