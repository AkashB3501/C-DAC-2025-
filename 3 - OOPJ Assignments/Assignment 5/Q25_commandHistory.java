/*
Problem 25: Command History Tracker

Use Case: Store recent commands in a terminal with limited history.

Requirements:
● Maintain last 3 commands
● Remove oldest when limit exceeded
● Display recent commands

Sample Input:
Commands: "ls", "pwd", "cd ..", "mkdir"
History limit: 3

Expected Output:
Recent Commands: pwd, cd..,mkdir

*/

import java.util.*;

class Q25_commandHistory{
	
  public static void main(String args[])
  {
	  
	Deque<String> his = new LinkedList<>();
	
	String[] commands = {"ls","pwd","cd..","mkdir"};
	
	for(String cmd : commands)
	{
		if(his.size()==3) his.pollFirst();
		his.addLast(cmd);
		
	}

   System.out.println("Recent Commands: "+his);

	
  }

}
/*

PS D:\Assignment 5> javac Q25_commandHistory.java
PS D:\Assignment 5> java Q25_commandHistory

Recent Commands: [pwd, cd.., mkdir]

*/