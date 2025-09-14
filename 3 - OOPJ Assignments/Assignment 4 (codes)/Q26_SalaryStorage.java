/*
Problem 26: Salary Storage

Scenario: A financial system needs to convert primitive double salary values to Double objects for
storage in collections and database operations.
Task: Use valueOf method to convert primitives to wrapper objects.

Sample Input:
45000.5

Expected Output:
Double object: 45000.5

*/

import java.util.*;

class Q26_SalaryStorage
 {
    public static void main(String args[]) 
	{
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter salary: ");
        double salary = sc.nextDouble(); 

        
        Double salaryObject = Double.valueOf(salary);

        System.out.println("Double object: " + salaryObject);

    }
}
/*
PS D:\0 - CDAC 2025\Assignment 4> javac Q26_SalaryStorage.java
PS D:\0 - CDAC 2025\Assignment 4> java Q26_SalaryStorage
Enter salary: 45000.5
Double object: 45000.5
*/