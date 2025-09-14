/*
Q7. Employee Hierarchy
Scenario: A company has regular and contractual employees with different pay structures.
Problem Statement:
Create a superclass Employee with name and basicSalary. Subclass RegularEmployee adds HRA 10%,
Subclass ContractEmployee adds allowance 5%. Display net salary.
Classes/Fields:
● Employee → name, basicSalary
● RegularEmployee → HRA 10%
● ContractEmployee → allowance 5%
Sample Input:
Regular → name=Rahul, basicSalary=20000
Contract → name=Riya, basicSalary=15000
Sample Output:
Rahul Net Salary = 22000
Riya Net Salary = 15750

*/

class Employee 
{
    String name;
    double basicSalary;

    Employee(String name, double basicSalary)
	{
        this.name = name;
        this.basicSalary = basicSalary;
    }
}

class RegularEmployee extends Employee 
{
    RegularEmployee(String name, double basicSalary)
	{
        super(name, basicSalary);
    }

    double getNetSalary() 
	{
        return basicSalary + (basicSalary * 0.10);
    }
}

class ContractEmployee extends Employee 
{
    ContractEmployee(String name, double basicSalary) 
	{
        super(name, basicSalary);
    }

    double getNetSalary()
	{
        return basicSalary + (basicSalary * 0.05);
    }
}

class Q7_Employee 
{
    public static void main(String args[]) 
	{
        RegularEmployee e1 = new RegularEmployee("Rahul", 20000);
        ContractEmployee e2 = new ContractEmployee("Riya", 15000);

        System.out.println(e1.name + " Net Salary = " + e1.getNetSalary());
        System.out.println(e2.name + " Net Salary = " + e2.getNetSalary());
    }
}
/*
PS D:\0 - CDAC 2025\Assignment 3(codes)> javac Q7_Employee.java
PS D:\0 - CDAC 2025\Assignment 3(codes)> java Q7_Employee

Rahul Net Salary = 22000
Riya Net Salary = 15750

*/