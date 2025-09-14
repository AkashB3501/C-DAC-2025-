/*
Problem 9: Event Attendance Counter
Use Case: Count unique attendees at an event, handling duplicate check-ins.
Requirements:
● Record attendee names
● Count only unique attendees
● Handle duplicate entries
Sample Input:
Attendees: "Amit", "Rohan", "Amit", "Priya"
Expected Output:
Total unique attendees: 3

*/


import java.util.*;

class Q9_AttendanceCount
{
	public static void main(String args[])
	{
		Set<String> a1 = new HashSet<>();
		a1.add("Amit");
		a1.add("Rohan");
		a1.add("Amt");
		a1.add("Priya");
		
		System.out.println("Total unique attendees: "+a1.size());		
		
	}
}
/*

PS D:Assignment 5> javac Q9_AttendanceCount.java
PS D:Assignment 5> java Q9_AttendanceCount

Total unique attendees: 4

*/