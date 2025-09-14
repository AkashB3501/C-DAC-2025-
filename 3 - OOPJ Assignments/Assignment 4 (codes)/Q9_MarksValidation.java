/*
Problem 9: Marks Validation

Scenario: An online examination system needs to validate that marks entered by teachers are within valid
range (0-100). Negative marks should not be allowed.
Task: Create a marks validation method that throws an exception for invalid marks.

Sample Input:
-5
Expected Output:
Invalid marks

*/

import java.util.*;

class Q9_MarksValidation
 {

    static void ValidMarks(int marks) throws Exception
	{
        if (marks < 0 || marks > 100) 
		{
            throw new Exception("Invalid marks"); 
			
        } else 
		{
            System.out.println("Marks are valid: " + marks);
        }
    }

    public static void main(String args[]) 
	{
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the marks: ");
        int marks = sc.nextInt();

        try {
            ValidMarks(marks);
			
        } catch (Exception e) 
		{
            System.out.println(e.getMessage());  
        }

        sc.close();
    }
}
/*
PS D:\0 - CDAC 2025\Assignment 4> javac Q9_MarksValidation.java
PS D:\0 - CDAC 2025\Assignment 4> java Q9_MarksValidation

Enter the marks: -5
Invalid marks
*/