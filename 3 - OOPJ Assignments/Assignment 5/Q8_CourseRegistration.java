/*
Problem 8: Course Registration System
Use Case: A student registers for courses, ensuring no duplicate course codes.
Requirements:
● Register for courses using course codes
● Prevent duplicate registrations
● Display registered courses
Sample Input:
Course codes: "CS101", "MA101", "CS101"
Expected Output:
Registered Courses: CS101, MA101
*/

import java.util.*;

class Q8_CourseRegistration
{
	public static void main(String args[])
	{
		Set<String> courses = new HashSet<>();
		
		courses.add("CS101");
        courses.add("MA101");
        courses.add("CS101");
		
		System.out.println("Registered Courses: "+courses);
		
		
	}
}
/*
PS D:\Assignment 5> javac Q8_CourseRegistration.java
PS D:\Assignment 5> java Q8_CourseRegistration

Registered Courses: [CS101, MA101]

*/