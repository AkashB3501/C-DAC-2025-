/*
Problem 1: Student Names Management System
Use Case: A school administrator needs to maintain a list of student names for a class roster.
Requirements:
● Add student names to the roster
● Display all students
● Remove a student from the roster
Sample Input:
Add students: "Amit", "Priya", "Rohan"
Remove student: "Priya"
Expected Output:
Students: Amit, Rohan

*/

import java.util.*;

class Q1_StudentManagement {
	
  public static void main(String args[])
  {
	  
	 List<String> s1 = new ArrayList<>();
      
	  s1.add("Amit");
	  s1.add("Priya");
	  s1.add("Rohan");
   
      s1.remove("Priya");
	
	
    System.out.println("Students: "+ s1);

	 
  }

}
/*
PS D:\Assignment 5> javac StudentManagement.java
PS D:\Assignment 5> java StudentManagement

Students: [Amit, Rohan]
*/