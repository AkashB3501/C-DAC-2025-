/*
Q2. Student Marks
 Scenario: A teacher wants to update student marks but must ensure marks are valid.
 Problem Statement:
 Create a class Student with private marks. Create getter and setter with validation (0–100).
 Fields:
● private int marks
Methods:
● setMarks(int marks) → validate and set
● getMarks() → return marks
Sample Input:
marks = 85
Sample Output:
Marks = 85

*/
import java.util.Scanner;

class Q2_Student
 {
    private int marks;

    public void setMarks(int marks)
	{
        if (marks >= 0 && marks <= 100) 
		{
            this.marks = marks;
        } 
		else 
		{
            System.out.println("Invalid marks");
        }
    }

    public int getMarks() 
	{
        return marks;
    }

    public static void main(String args[]) 
	{
		int mar;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter marks :");
		mar=sc.nextInt();
		
        Q2_Student s = new Q2_Student();
        s.setMarks(mar);
		
        System.out.println("Marks = " + s.getMarks());
    }
}
/*

PS D:\0 - CDAC 2025\Assignment 3 (codes)> javac Q2_Student.java
PS D:\0 - CDAC 2025\Assignment 3 (codes)> java Q2_Student
Enter marks :85
Marks = 85

*/