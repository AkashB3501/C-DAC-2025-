/*

Problem 3: Age Input

Scenario: A registration form for an online course asks for the user's age. Sometimes users accidentally
enter text instead of numbers, causing the system to crash.
Task: Create a registration system that safely converts age input from string to integer.

Sample Input:
eighteen
Expected Output:
Invalid number format

*/

import java.util.*;

class Q3_AgeInput{
	
 public static void main(String args[])
 {
	  String str;
	  int age;
	  
	  
	  Scanner sc = new Scanner(System.in);
 	  System.out.print("Enter age :");
	  str = sc.nextLine();
	  
	 try{
		 
		 age = Integer.parseInt(str);
		 System.out.println("Age: "+age);
		 
		 
	 }catch(NumberFormatException e){
		 
		System.out.println("Invalid number format ");
		 
	 }	 
   }
}

/*
PS D:\0 - CDAC 2025\Assignment 4 (codes)> javac Q3_AgeInput.java
PS D:\0 - CDAC 2025\Assignment 4 (codes)> java Q3_AgeInput

Enter age :eighteen
Invalid number format

PS D:\0 - CDAC 2025\Assignment 4 (codes)> java Q3_AgeInput
Enter age :18
Age: 18

*/