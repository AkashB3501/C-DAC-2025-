/*
Problem 3: Daily Task Tracker
Use Case: A student wants to track their daily tasks and mark completed ones.
Requirements:
● Add tasks to the list
● Mark tasks as completed (remove them)
● Display remaining tasks
Sample Input:
Add tasks: "Study Java", "Complete Assignment", "Exercise"
Complete task: "Exercise"
Expected Output:
Remaining tasks: Study Java, Complete Assignment
*/
import java.util.*;

class Q3_TaskTracker
 {
	 
    public static void main(String args[])
    {
		
	  List<String> t1 = new ArrayList<>();
	  
	  t1.add("Study Java");
	  t1.add("Complete Assignment");
	  t1.add("Exercise");
	  
	  t1.remove("Exercise");
	  
	  System.out.println("Remaining task: "+ t1);
	  

	
   }
}
/*
PS D:\Assignment 5> javac Q3_TaskTracker.java
PS D:\Assignment 5> java Q3_TaskTracker

Remaining task: [Study Java, Complete Assignment]
*/