/*
Problem 15: Employee Auto-ID Generator

Scenario:
Create Employee class with id, name, basicSalary.
● Add static counter starting from 1001 for IDs.
● Default constructor → name = "Unknown", salary = 20000
● Parameterized constructor → accept name and salary
● Getter for all variables
● Create 2 employees and display their IDs, names, salary
*/
 
 class Q15_Employee {
	
    int id;
    String name;
    double basicSalary;

    private static int counter = 1001; 


    Q15_Employee() 
	{
        id = counter++;
        name = "Unknown";
        basicSalary = 20000;
    }

   
    Q15_Employee(String name, double salary) 
	{
        id = counter++;
        this.name = name;
        this.basicSalary = salary;
    }

    
    void display() 
	{
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + basicSalary);
    }

    
    public static void main(String args[]) 
	{
        Q15_Employee e1 = new Q15_Employee();              
        Q15_Employee e2 = new Q15_Employee("Akash", 30000); 

        e1.display();
        e2.display();
    }
}

/*
PS D:\0 - CDAC 2025\Assignment 2> javac  Q15_Employee.java
PS D:\0 - CDAC 2025\Assignment 2> java  Q15_Employee
ID: 1001, Name: Unknown, Salary: 20000.0
ID: 1002, Name: Akash, Salary: 30000.0
*/
