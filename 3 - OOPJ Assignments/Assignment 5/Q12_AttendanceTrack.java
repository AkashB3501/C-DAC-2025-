/*

Problem 12: Attendance Tracking System
Use Case: Track student attendance percentages in alphabetical order.

Requirements:
● Map student names to attendance percentages
● Maintain alphabetical order of students
● Display sorted attendance report

Sample Input:
Attendance: "Amit" → 90, "Rohan" → 85, "Priya" → 95
Expected Output:
Attendance Report: Amit:90, Priya:95, Rohan:85

*/

import java.util.*;

class Q12_AttendanceTrack{
	
	
	public static void main(String args[])
	{
		Map<String,Integer> a1 = new TreeMap<>();
		
		a1.put("Amit",90);
		a1.put("Rohan",85);
		a1.put("Priya",95);
		
		System.out.println("Attendance Repost: "+a1);


	}
}
/*

PS D:\Assignment 5> javac Q12_AttendanceTrack.java
PS D:\Assignment 5> java Q12_AttendanceTrack

Attendance Repost: {Amit=90, Priya=95, Rohan=85}

*/