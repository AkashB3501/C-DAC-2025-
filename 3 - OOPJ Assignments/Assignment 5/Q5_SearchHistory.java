/*
Problem 5: Recent Search History
Use Case: A search application maintains the last 5 searches, removing the oldest when the limit is
exceeded.
Requirements:
● Store recent searches (maximum 5)
● Remove oldest search when limit exceeded
● Maintain insertion order
Sample Input:
Searches: "Java", "Python", "C++", "DSA", "OOP", "Spring"
Expected Output:
Recent searches: Python, C++, DSA, OOP, Spring
*/

import java.util.*;

class Q5_SearchHistory
{
  public static void main(String args[])
  {
	   Deque<String> h1 = new LinkedList<>();
	  
	  String[] searches = {"Java", "Python", "C++", "DSA", "OOP", "Spring"};
	  
	  for(String s : searches)
	  {
		  if(h1.size() == 5) h1.pollFirst();
		  h1.addLast(s);
		  
	  }
	  
	  System.out.println("Recent Searches: "+h1);
	  
	  
	  
  }
}
/*
PS D:\Assignment 5> javac Q5_SearchHistory.java
PS D:\Assignment 5> java Q5_SearchHistory

Recent Searches: [Python, C++, DSA, OOP, Spring]
*/