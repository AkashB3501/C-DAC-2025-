/*

Problem 27: Employee Salary Sorting

Use Case: Sort employees by salary for payroll processing.

Requirements:
● Store employee objects
● Sort by salary in ascending order
● Display sorted employee list

Sample Input:
Employees: ("Amit", 50000), ("Priya", 60000), ("Rohan", 45000)
`
Expected Output:
Sorted by salary: Rohan:45000, Amit:50000, Priya:60000

*/

import java.util.*;

class Q27_EmployeeSalary {
	
   public static void main(String args[])
   {
	   
        List<Employee> emp = new ArrayList<>();
		
        emp.add(new Employee("Amit", 50000));
        emp.add(new Employee("Priya", 60000));
        emp.add(new Employee("Rohan", 45000));

        emp.sort(Comparator.comparingInt(e -> e.salary));

        System.out.println("Sorted by salary: " + emp);
    
	
	}

}
/*

PS D:\Assignment 5> javac Q27_EmployeeSalary.java
PS D:\Assignment 5> java Q27_EmployeeSalary

Sorted by salary: [Rohan:45000, Amit:50000, Priya:60000]

*/