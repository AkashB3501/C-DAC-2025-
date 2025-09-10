/*
Problem 16: Employee Net Salary says:
Scenario:

Extend previous problem. Add method calculateNetSalary():
Add 10% HRA, 5% DA, deduct 2% PF from basicSalary.
Print net salary for 2 employees.

*/

class Q16_Employee 
{
    int id;
    String name;
    double basicSalary;

    private static int counter = 1001; 

    
    Q16_Employee() 
	{
        this.id = counter++;
        this.name = "Unknown";
        this.basicSalary = 20000;
    }

    
    Q16_Employee(String name, double salary)
	{
        this.id = counter++;
        this.name = name;
        this.basicSalary = salary;
    }

   
    public double calculateNetSalary()
	{
        double hra = 0.10 * basicSalary;  
        double da = 0.05 * basicSalary;   
        double pf = 0.02 * basicSalary;  
		
        return basicSalary + hra + da - pf;
    }

     void display() 
	{
        System.out.println("ID: " + id + ", Name: " + name + ", Basic Salary: " + basicSalary + ", Net Salary: " + calculateNetSalary());
    }

    public static void main(String args[])
	{
        Q16_Employee e1 = new Q16_Employee();              
        Q16_Employee e2 = new Q16_Employee("Akash", 30000); 

        e1.display();
        e2.display();
    }
}
/*
PS D:\0 - CDAC 2025\Assignment 2> javac Q16_Employee.java
PS D:\0 - CDAC 2025\Assignment 2> java Q16_Employee

ID: 1001, Name: Unknown, Basic Salary: 20000.0, Net Salary: 22600.0
ID: 1002, Name: Akash, Basic Salary: 30000.0, Net Salary: 33900.0

*/