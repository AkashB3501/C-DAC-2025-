/*
Problem 24: Salary Calculation
Scenario: A payroll system retrieves employee ages from a database as Integer objects but needs
primitive int values for mathematical calculations.
Task: Demonstrate unboxing by extracting primitive values from wrapper objects.
Sample Input:
25
Expected Output:
int value: 25	
*/
import java.util.*;

class Q24_SalaryCalculation {
	
    public static void main(String args[]) 
	
	{
		int age;
		
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter employee age: ");
        Integer ageObject = sc.nextInt();  
 
        age = ageObject;

        System.out.println("int value: " + age);
    }
}
/*
PS D:\0 - CDAC 2025\Assignment 4> javac Q24_SalaryCalculation.java
PS D:\0 - CDAC 2025\Assignment 4> java Q24_SalaryCalculation
Enter employee age: 25
int value: 25
*/