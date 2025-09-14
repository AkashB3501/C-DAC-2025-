/*
Problem 23: Employee Age Management
Scenario: An HR system stores employee ages in a database. The system needs to convert primitive int
values to Integer objects for database storage and collection operations.
Task: Demonstrate autoboxing by converting primitive int to Integer object.
Sample Input:
30
Expected Output:
Integer object: 30
*/

import java.util.*;

class Q23_EmployeeAgeManagement 
{
    public static void main(String args[])
	{
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter employee age: ");
        int age = sc.nextInt(); 

        Integer ageObject = age;

        System.out.println("Integer object: " + ageObject);
    }
}

/*

PS D:\0 - CDAC 2025\Assignment 4> javac Q23_EmployeeAgeManagement.java
PS D:\0 - CDAC 2025\Assignment 4> java Q23_EmployeeAgeManagement

Enter employee age: 30
Integer object: 30

*/