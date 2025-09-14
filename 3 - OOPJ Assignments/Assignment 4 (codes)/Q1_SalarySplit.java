/*   Assignment no: 4
Problem 1: Salary Split
Scenario: You are developing a payroll system for a company. The HR department wants to distribute a
bonus equally among employees in a department. However, sometimes a department might have zero
employees due to restructuring.
Task: Create a method that divides a bonus amount among employees and handles the case when the
number of employees is zero.
Sample Input:
10000
0
Expected Output:
Error: Division by zero not allowed

*/

public class Q1_SalarySplit 
{


    static void divideBonus(int bonus, int employees)
	{
		
       try{
		
            int res = bonus / employees;   
            System.out.println("Each employee receives: " + res);
			
        } catch (ArithmeticException e) 
		{
            System.out.println("Error: Division by zero not allowed");
        }
    }

    public static void main(String args[]) 
	{
        int bonus = 10000;  
        int emp = 0;   

        divideBonus(bonus, emp);
    }
}
/*
PS D:\0 - CDAC 2025\Assignment 4(codes)> javac Q1_SalarySplit.java
PS D:\0 - CDAC 2025\Assignment 4(codes)> java Q1_SalarySpli
Error: Division by zero not allowed

*/