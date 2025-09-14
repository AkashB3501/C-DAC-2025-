/*

Problem 30: Grade-Based Student Filter

Use Case: Filter students based on minimum grade requirements.

Requirements:
● Store student objects with grades
● Remove students below grade B
● Display filtered results

Sample Input:
Students: ("Amit", "A"), ("Priya", "C"), ("Rohan", "B")
Filter: Grade >= B

Expected Output:
Qualified Students: Amit:A, Rohan:B

*/

import java.util.*;

class Q30_GradeBasedFilter{
	
  public static void main(String args[])
  {
	  List<student> s1 = new ArrayList<>();
	  
	  s1.add(new student("Amit","A"));
	  s1.add(new student("Priya","C"));
	  s1.add(new student("Rohan","B"));
	  
	  s1.removeIf(s -> s.grade.compareTo("B") > 0);
	  
	  System.out.println("Qualifided Students: "+s1);	  
	  
  }

}
/*

PS D:\Assignment 5> javac Q30_GradeBasedFilter.java
PS D:\Assignment 5> java Q30_GradeBasedFilter

Qualifided Students: [Amit:A, Rohan:B]

*/