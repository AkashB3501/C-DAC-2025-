/*
3. Employee Age Validation
Scenario: HR wants to ensure employees entered in the system are adults.
Problem Statement:
Create a class Employee with private age. Provide getter/setter. Setter should reject age < 18.
Fields:
● private int age
Methods:
● setAge(int age) → if age >=18, set; else show error
● getAge() → returns age
Sample Input:
age = 17
Sample Output:
“Invalid age”

*/
import java.util.Scanner;

class Q3_Employee 
{
    private int age;

    public void setAge(int age) 
	{
        if (age >= 18)
		{
            this.age = age;
        } 
		else 
		{
            System.out.println("Invalid age");
        }
    }

    public int getAge() {
        return age;
    }

    public static void main(String args[]) {
		
		int Age;
		
        Scanner sc = new Scanner(System.in);
        Q3_Employee emp = new Q3_Employee();

        System.out.print("Enter employee age: ");
         Age = sc.nextInt();

        emp.setAge(Age);
      
    }
}

/*
PS D:\0 - CDAC 2025\Assignment 3 (codes)> javac Q3_Employee.java
PS D:\0 - CDAC 2025\Assignment 3 (codes)> java Q3_Employee
Enter employee age: 17
Invalid age
*/