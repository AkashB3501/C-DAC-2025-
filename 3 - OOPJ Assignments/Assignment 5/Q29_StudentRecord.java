/*

Problem 29: Student Record System

Use Case: Maintain student records with name and grade information.

Requirements:
● Create Student objects with name and grade
● Store in a collection
● Display student records

Sample Input:
Students: Student("Amit", "A"), Student("Priya", "B")

Expected Output:
Student Records: Amit:A, Priya:B

*/

import java.util.*;

class student{
	
	String name;
	String grade;
	
	student(String name,String grade){
		
		this.name=name;
		this.grade=grade;
			
	}
	
	public String toString(){
		
	  return name + ":" + grade; 
	
	}
}


class Q29_StudentRecord{
	
  public static void main(String args[])
  {
	  
	 List<student> s1 = new ArrayList<>();
     
     s1.add(new student("Amit","A"));
     s1.add(new student("Priya","B"));

     System.out.println("Student Records: "+s1);	 
  
	  
  }

}
/*

PS D:\Assignment 5> javac Q29_StudentRecord.java
PS D:\Assignment 5> java Q29_StudentRecord

Student Records: [Amit:A, Priya:B]

*/