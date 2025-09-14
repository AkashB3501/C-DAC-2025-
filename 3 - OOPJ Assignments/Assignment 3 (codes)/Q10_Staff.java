/*
Q10.Academic Staff
Scenario: University has teaching and non-teaching staff.
Problem Statement:
Superclass Staff with name, salary. Subclass TeachingStaff adds subject, Subclass NonTeachingStaff
adds department. Display staff info.
Classes/Fields:
● Staff → name, salary
● TeachingStaff → subject
● NonTeachingStaff → department
Sample Input:
Teaching → name=Anita, salary=50000, subject=Math
NonTeaching → name=Ramesh, salary=40000, department=Admin
Sample Output:
Anita → Math, 50000
Ramesh → Admin, 40000
*/

class Staff {
    String name;
    double salary;

    Staff(String name, double salary)
	{
        this.name = name;
        this.salary = salary;
    }
}

class TeachingStaff extends Staff 
{
    String subject;

    TeachingStaff(String name, double salary, String subject)
	{
        super(name, salary);
        this.subject = subject;
    }

    void display()
	{
        System.out.println(name + " → " + subject + ", " + salary);
    }
}

class NonTeachingStaff extends Staff 
{
    String department;

    NonTeachingStaff(String name, double salary, String department) 
	{
        super(name, salary);
        this.department = department;
    }

    void display() 
	{
        System.out.println(name + " -> " + department + ", " + salary);
    }
}

class Q10_Staff 
{
    public static void main(String args[]) 
	{
        TeachingStaff t1 = new TeachingStaff("Anita", 50000, "Math");
		
        NonTeachingStaff n1 = new NonTeachingStaff("Ramesh", 40000, "Admin");

        t1.display();
        n1.display();
    }
}

/*
PS D:\0 - CDAC 2025\Assignment 3(codes)> javac Q10_Staff.java
PS D:\0 - CDAC 2025\Assignment 3(codes)> java Q10_Staff

Anita -> Math, 50000
Ramesh -> Admin, 40000
*/