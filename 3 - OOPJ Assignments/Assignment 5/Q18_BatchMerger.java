/*

Problem 18: Batch Merger System
Use Case: Merge student lists from morning and evening batches, removing duplicates.

Requirements:
● Combine two student lists
● Remove duplicate students
● Maintain unique student list

Sample Input:
Morning batch: "Amit", "Priya"
Evening batch: "Rohan", "Priya"

Expected Output:
Combined batches: Amit, Priya, Rohan

*/

import java.util.*;

class Q18_BatchMerger {


    public static void main(String args[]) {
	
        Set<String> students = new HashSet<>();
		
        students.addAll(Arrays.asList("Amit", "Priya"));
        students.addAll(Arrays.asList("Rohan", "Priya"));
		

        System.out.println("Combined batches: " + students);
		
    }
	
	
}
/*

PS D:\Assignment 5> javac Q18_BatchMerger.java
PS D:\Assignment 5> java Q18_BatchMerger

Combined batches: [Priya, Amit, Rohan]

*/