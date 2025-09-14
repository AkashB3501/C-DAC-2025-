/*
Problem 19: Grade Report Generator

Use Case: Display all student grades using proper iteration techniques.

Requirements:
● Iterate through student-grade mappings
● Display formatted grade report
● Use Iterator pattern

Sample Input:
Student grades: "Amit" → 85, "Priya" → 92

Expected Output:
Grade Report: Amit:85,Priya:92
*/

import java.util.*;

class Q19_GradeReport {
	
 public static void main(String args[]) 
 {
       
	   Map<String,Integer> grade = new HashMap<>();
	   
	   grade.put("Amit",85);
	   grade.put("Priya",92);
	   
	   System.out.println("Grade Report: ");
	   
	   Iterator<Map.Entry<String,Integer>> i1 = grade.entrySet().iterator();
	   
	   while (i1.hasNext())
	   {
		   Map.Entry<String,Integer> entry = i1.next();
		   
		    System.out.print(entry.getKey() + ":" + entry.getValue());
		   
		   if(i1.hasNext())
		   {
			   System.out.print(", ");
			   
		   }
	   }
	   
	   
	   
 }
}

/*
PS D:\Assignment 5> javac Q19_GradeReport.java
PS D:\Assignment 5> java Q19_GradeReport

Grade Report:
Priya:92, Amit:85
*/