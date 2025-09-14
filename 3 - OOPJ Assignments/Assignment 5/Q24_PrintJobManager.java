/*

Problem 24: Print Job Queue Manager

Use Case: Manage print jobs in a shared printer system.

Requirements:
● Queue print jobs
● Process jobs in order
● Display job status

Sample Input:
Jobs: "Doc1", "Doc2", "Doc3"
Process: 1 job

Expected Output:
Printing Doc1, Queue: Doc2, Doc3

*/

import java.util.*;

class Q24_PrintJobManager{

   public static void main(String args[])
  {
	  
	Queue<String> job = new LinkedList<>();
	
	job.add("Doc1");
	job.add("Doc2");
	job.add("Doc3");
	
	String printing = job.poll();
	
	System.out.println("Printing "+printing+", Queue: "+job);
	
	
  }

}
/*

PS D:\Assignment 5> javac Q24_PrintJobManager.java
PS D:\Assignment 5> java Q24_PrintJobManager

Printing Doc1, Queue: [Doc2, Doc3]

*/