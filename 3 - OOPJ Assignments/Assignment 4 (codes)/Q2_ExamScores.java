/*
Problem 2: Exam Scores

Scenario: A teacher is using a digital gradebook system to access student scores. Sometimes they might
accidentally try to access the score of a student number that doesn't exist in the class roster.
Task: Create a program that stores exam scores in an array and safely accesses student scores by index.
Sample Input:
3
78 90 85
5
Expected Output:
Invalid index accessed
*/

import java.util.*;
class Q2_ExamScores{

  public static void main(String args[])
  {
	   int n,i;
	   int index;  
	  
	  Scanner sc = new Scanner(System.in);
	  n =sc.nextInt();
	 
     int[] s = new int[n];
   
    for(i = 0; i < n; i++)
     {
	   s[i] = sc.nextInt();
     }
   
    index = sc.nextInt();
   
   try{
	   System.out.println(s[index]);
   }
   catch(ArrayIndexOutOfBoundsException e){
	   
	   System.out.println("Invalid index accessed");
    }   
	   
  }
}
/*
PS D:\0 - CDAC 2025\Assignment 4 (codes)> javac Q2_ExamScores.java
PS D:\0 - CDAC 2025\Assignment 4 (codes)> java Q2_ExamScores
3
78
90
85
5
Invalid index access
*/