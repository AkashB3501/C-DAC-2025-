/*

Problem 4: Employee Salary Manager

Scenario: A company in Bengaluru wants to maintain employee details and give a bonus to employees
who have worked more than 5 years.
Requirements:
1. Create a class Employee with instance variables: name (String), salary (double), yearsOfService
(int).
2. Create static variable totalEmployees to store the number of employees created.
3. Constructor should initialize all instance variables and increment totalEmployees.
4. Create getters and setters for all instance variables.
5. Create a method calculateBonus() that returns 5% of salary if yearsOfService > 5, otherwise 0.
6. Create a static method showTotalEmployees() to print total employees created.
7. Write a main class to create 3 employees, print their bonuses, and print total employees.
Input Example:
Employee1: Name: "Ravi", Salary: 150000, Years of Service: 6
Employee2: Name: "Anita", Salary: 120000, Years of Service: 3
Employee3: Name: "Suresh", Salary: 100000, Years of Service: 5
Expected Output:
Employee Ravi Bonus: 7500.0
Employee Anita Bonus: 0.0
Employee Suresh Bonus: 0.0
Total employees: 3

 */

class Q4_Employee {

    String name;
    double salary;
    int yearsOfService;

    static int totalEmployees = 0;

    Q4_Employee(String name, double salary, int yearsOfService) {
        this.name = name;
        this.salary = salary;
        this.yearsOfService = yearsOfService;

        totalEmployees++;

    }

    String getdetail(String name, double salary, int yearsOfService) {
        return "Name: " + name + ", Salary: " + salary + ", Years of Service: " + yearsOfService;
    }

    void setdetail(String name, double salary, int yearsOfService) {
        this.name = name;
        this.salary = salary;
        this.yearsOfService = yearsOfService;
    }

    double calculateBonus() {
        if (yearsOfService > 5) {
            return 0.5 * salary;
        } else {
            return 0.0;
        }
    }

    static void showTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);

    }

    public static void main(String args[]) {

        Q4_Employee e1 = new Q4_Employee("Ravi", 150000, 6);
        Q4_Employee e2 = new Q4_Employee("Anita", 120000, 3);
        Q4_Employee e3 = new Q4_Employee("Suresh", 100000, 5);

        System.out.println(e1.getdetail(e1.name, e1.salary, e1.yearsOfService));
        System.out.println(e2.getdetail(e2.name, e2.salary, e2.yearsOfService));
        System.out.println(e3.getdetail(e3.name, e3.salary, e3.yearsOfService));

        System.out.println("Employee " + e1.name + " Bonus: " + e1.calculateBonus());
        System.out.println("Employee " + e2.name + "Bonus: " + e2.calculateBonus());
        System.out.println("Employee " + e3.name + "Bonus: " + e3.calculateBonus());

        Q4_Employee.showTotalEmployees();

    }

}
/*
PS D:\0 - CDAC 2025\Assignment 2 > java Q4_Employee
Name: Ravi, Salary: 150000.0, Years of Service: 6
Name: Anita, Salary: 120000.0, Years of Service: 3
Name: Suresh, Salary: 100000.0, Years of Service: 5
Employee Ravi Bonus: 75000.0
Employee AnitaBonus: 0.0
Employee SureshBonus: 0.0
Total Employees: 0
*/
