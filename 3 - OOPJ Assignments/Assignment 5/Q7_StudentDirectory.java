/*
Problem 7: Alphabetical Student Directory
Use Case: A school wants to maintain student names in alphabetical order.
Requirements:
● Add student names
● Automatically maintain alphabetical sorting
● Display sorted name
Sample Input:
Students: "Rohan", "Amit", "Priya"
Expected Output:
Students: Amit, Priya, Rohan
*/

import java.util.*;

class Q7_StudentDirectory
{
	
   public static void main(String args[])
   {
	   
	   Set<String> s1 = new TreeSet<>();
	   
	   s1.add("Rohan");
	   s1.add("Amit");
	   s1.add("Priya");
	   
	   System.out.println("Students: "+ s1);

	   
   }
}
/*

PS D:\Assignment 5> javac Q7_StudentDirectory.java
PS D:\Assignment 5> java Q7_StudentDirectory

Students: [Amit, Priya, Rohan]

*/