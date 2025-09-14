/*
Problem 13: Student Registration Order Tracker
Use Case: Maintain the order in which students registered for a course.
Requirements:
● Record registration order
● Map student names to roll numbers
● Preserve insertion order
Sample Input:
Registrations: "Amit" → 101, "Rohan" → 102, "Priya" → 103
Expected Output:
Registration Order: Amit:101, Rohan=102, Priya=103
*/

import java.util.*;


class Q13_RegistrationOrder
{
	public static void main(String args[])
	{
		Map<String,Integer> r1 = new LinkedHashMap<>();
		
		r1.put("Amit",101);
		r1.put("Rohan",102);
		r1.put("Priya",103);
		
		System.out.println("Registration Order: "+r1);
		
		
	}
	
}
/*

PS D:\Assignment 5> javac Q13_RegistrationOrder.java
PS D:\Assignment 5> java Q13_RegistrationOrder

Registration Order: {Amit=101, Rohan=102, Priya=103}
*/