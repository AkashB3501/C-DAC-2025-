/*
Problem 11: Student Grade Management
Use Case: A teacher needs to map student names to their exam marks.
Requirements:
● Store student name and marks pairs
● Retrieve marks by student name
● Display all student-marks mappings
Sample Input:
Students and marks: "Amit" → 85, "Priya" → 92, "Rohan" → 78
Expected Output:
Grade Report: Amit:85, Priya:92, Rohan:78
*/


import java.util.*;

class Q11_GradeManagement
{
   public static void main(String args[])
   {
	   Map<String,Integer> grade = new HashMap<>();
	   
	   grade.put("Amit",85);
	   grade.put("Priya",92);
	   grade.put("Rohan",78);
	   
	   System.out.println("Grade Report: "+grade);
	   System.out.println("Marks of Priya: "+grade.get("Priya"));
	   
	   
   }
} 

/*
PS D:\Assignment 5> javac Q11_GradeManagement.java
PS D:\Assignment 5> java Q11_GradeManagement

Grade Report: {Priya=92, Amit=85, Rohan=78}
Marks of Priya: 92

*/