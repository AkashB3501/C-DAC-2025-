/*

Problem 17: Grade Distribution Counter

Use Case: Analyze the distribution of grades in a class.

Requirements:
● Count frequency of each grade
● Display grade distribution
● Handle multiple occurrences

Sample Input:
Grades: ["A", "B", "A", "C", "B", "A"]

Expected Output:
Grade Distribution: A=3, B=2, C=1

*/

import java.util.*;

class Q17_GradeCounter{
	
	public static void main(String args[])
	{
		String[] grade = {"A","B","A","C","B","A"};
		
		Map<String,Integer> dis = new HashMap<>();
		
	
        for (String g : grade) 
		{
			
            dis.put(g, dis.getOrDefault(g, 0) + 1);
			
        }
	 
	 System.out.println("Grade Distribution:" +dis);
	 
	}
	
}
/*

PS D:\Assignment 5> javac Q17_GradeCounter.java
PS D:\Assignment 5> java Q17_GradeCounter

Grade Distribution:{A=3, B=2, C=1}

*/
