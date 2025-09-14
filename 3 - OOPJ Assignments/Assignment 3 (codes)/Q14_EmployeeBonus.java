/*
Q14. Employee Bonus Calculation
Scenario: A company has different types of employees with specific bonus calculation rules.

Problem Statement:
Create an abstract class Employee with abstract method calculateBonus(). Subclass Manager →
bonus=20% of salary, Subclass Developer → bonus=10% of salary.

Classes/Fields:
● Employee → name, salary, calculateBonus() (abstract)
● Manager → bonus=20% of salary
● Developer → bonus=10% of salary

Sample Input:
Manager → name=Anita, salary=50000
Developer → name=Rohit, salary=40000

Sample Output:
Anita Bonus = 10000
Rohit Bonus = 4000
*/
abstract class Employee {
	
    String name;
    double salary;

    Employee(String name, double salary) {
		
        this.name = name;
        this.salary = salary;
    }

    abstract double calculateBonus();
}

class Manager extends Employee {
	
    Manager(String name, double salary) {
        super(name, salary);
    }

    double calculateBonus() {
        return salary * 0.20;
    }
}

class Developer extends Employee {
    Developer(String name, double salary) {
        super(name, salary);
    }

    double calculateBonus() {
        return salary * 0.10;
    }
}

class Q14_EmployeeBonus {
    public static void main(String args[])
	{
		
        Manager m = new Manager("Anita", 50000);
        Developer d = new Developer("Rohit", 40000);

        System.out.println(m.name + " Bonus = " + m.calculateBonus());
        System.out.println(d.name + " Bonus = " + d.calculateBonus());
    }
}

/*

PS D:\Assignment 3 (codes)> javac Q14_EmployeeBonus.java
PS D:\Assignment 3 (codes)> java Q14_EmployeeBonus

Anita Bonus = 10000.0
Rohit Bonus = 4000.0

*/