/*
Problem 21: Text Editor Undo System

Use Case: Implement undo functionality for a text editor.

Requirements:
● Track user actions in order
● Implement undo operation (LIFO)
● Display current action history

Sample Input:
Actions: "Type A", "Type B", "Delete"
Operation: Undo last action

Expected Output:
Current actions: Type A, Type B

*/

import java.util.*;

class Q21_TextEditor{
	
  public static void main(String args[])
  {
	  
     Stack<String> actions = new Stack<>();
	 actions.push("Type A");
	 actions.push("Type B");
	 actions.push("Delete");
	 
	 actions.pop();
	 
	 System.out.println("Current actions: "+actions);
	 

  } 
}
/*

PS D:\Assignment 5> javac Q21_TextEditor.java
PS D:\\Assignment 5> java Q21_TextEditor

Current actions: [Type A, Type B]

*/