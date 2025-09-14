/*

Problem 23: Browser History Management

Use Case: Maintain browser history with back functionality.

Requirements:
● Store visited pages
● Implement back navigation (LIFO)
● Display current history

Sample Input:
Pages visited: "Google", "YouTube", "GFG"
Action: Back (1 page)

Expected Output:
Current history: Google, YouTube

*/

import java.util.*;

class Q23_BrowserHistory{
	
  public static void main(String args[])
  {
	 Stack<String> his = new Stack<>();
	 
     his.push("Google");
     his.push("YouTube");
	 his.push("GFG");
	 
	 his.pop();
	 
	 System.out.println("Current history: "+his);
	 

	  
  }
}
/*

PS D:\Assignment 5> javac Q23_BrowserHistory.java
PS D:\Assignment 5> java Q23_BrowserHistory

Current history: [Google, YouTube]

*/