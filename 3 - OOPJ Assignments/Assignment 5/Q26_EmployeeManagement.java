/*
Problem 26: Employee Management System

Use Case: Manage employee information including name and salary.

Requirements:
● Create Employee objects with name and salary
● Store employees in a collection
● Display employee information

Sample Input:
Employees: Employee("Amit", 50000), Employee("Priya", 60000)

Expected Output:
Employee List: Amit:50000, Priya:60000

*/

import java.util.*;

class Employee{
	
	String name;
	int salary;
	
	Employee(String name,int salary)
	{
		this.name=name;
		this.salary=salary;
		
	}
	public String toString() {
		
		return name + ":" + salary;
		
	}	
}

class Q26_EmployeeManagement{
	
 public static void main(String args[])
 {
	 
    List<Employee> emp1 = new ArrayList<>();
	
	emp1.add(new Employee("Amit",50000));
	emp1.add(new Employee("Priya",60000));
	
	System.out.println("Employee List: "+emp1);
	

 }

}
/*

PS D:\Assignment 5> javac Q26_EmployeeManagement.java
PS D:\Assignment 5> java Q26_EmployeeManagement

Employee List: [Amit:50000, Priya:60000]

*/