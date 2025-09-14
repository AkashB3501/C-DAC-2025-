/*
Problem 7: Student List

Scenario: A school management system tries to load a student list from a file at the beginning of each
semester. Sometimes the file might not exist or be corrupted.
Task: Simulate file reading operation and handle FileNotFoundException.

Sample Input:
student_list.txt
Expected Output:
File not found

*/

import java.io.*;
import java.util.*;

class Q7_StudentList
{
  public static void main(String args[])
  {
	  String filename;
	  Scanner sc = new Scanner(System.in);
	  
	  System.out.print("Enter filename: ");
	  filename= sc.nextLine();
	  
	  try{
		  
	        File file = new File(filename);
            Scanner fileReader = new Scanner(file);
            System.out.println("File loaded successfully");
            fileReader.close();
			
        } catch (FileNotFoundException e)
		{
            System.out.println("File not found");
        }  	  
  }
} 

/*
PS D:\0 - CDAC 2025\Assignment 4> javac Q7_StudentList.java
PS D:\0 - CDAC 2025\Assignment 4> java Q7_StudentList

Enter filename: student_list.txt
File not found

PS D:\0 - CDAC 2025\Assignment 4> java Q7_StudentList
Enter filename: Q7_StudentList.java
File loaded successfully

*/