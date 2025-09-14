/*
Problem 2: Lab Access Queue System
Use Case: A computer lab needs to manage students waiting for access using a first-come-first-served
system.
Requirements:
● Students join the queue for lab access
● Process students in FIFO order
● Display remaining queue
Sample Input:
Enqueue: "Amit", "Priya", "Rohan"
Dequeue: 1 student
Expected Output:
Queue: Priya, Rohan
*/

import java.util.*;

class Q2_LabAccess {

public static void main(String args[])
 {
   Queue<String> q1 = new LinkedList<>();
   
   q1.add("Amit");
   q1.add("Priya");
   q1.add("Rohan");
   
   q1.poll();
   
   System.out.println("Queue: "+q1);
   
 
 }
 
}

/*
PS D:\Assignment 5> javac Q2_LabAccess.java
PS D:\Assignment 5> java Q2_LabAccess

Queue: [Priya, Rohan]
*/