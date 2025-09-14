/*

Problem 22: Ticket Booking Queue
Use Case: Manage customer service in a ticket booking system.

Requirements:
● Queue customers for service
● Serve customers in FIFO order
● Display current queue status

Sample Input:
Queue: "Amit", "Priya", "Rohan"
Serve: 1 customer

Expected Output:
Serving: Amit, Queue:Priya, Rohan

*/

import java.util.*;

class Q22_TicketBooking {
	
 public static void main(String[] args) 
 {
       
   	    Queue<String> q = new LinkedList<>();
        q.add("Amit");
        q.add("Priya");
        q.add("Rohan");

        String serving = q.poll();
        System.out.println("Serving: " + serving + ", Queue: " + q);
    
	
	}

}
/*

PS D:Assignment 5> javac Q22_TicketBooking.java
PS D:Assignment 5> java Q22_TicketBooking

Serving: Amit, Queue: [Priya, Rohan]

*/