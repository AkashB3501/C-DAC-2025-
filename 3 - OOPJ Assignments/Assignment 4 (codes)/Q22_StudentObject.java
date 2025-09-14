/*
Problem 22: Student Object Cleanup
Scenario: A student management system creates student objects during registration. When these objects
are no longer needed, the system should clean up resources before garbage collection.
Task: Override finalize method to demonstrate cleanup during garbage collection.
Sample Input:
Student Name: Amit

Expected Output:
 Student object for Amit is being garbage collector
 
*/

import java.util.*;

class Student implements AutoCloseable 
{
    String name;

    Student(String name) {
        this.name = name;
    }

    @Override
    public void close() {
        System.out.println("Student object for " + name + " is being garbage collected");
    }
}

class Q22_StudentObject {
	
    public static void main(String args[])
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Student Name: ");
        String studentName = sc.nextLine();

        try (Student s = new Student(studentName)) 
		{
            System.out.println("Student " + studentName + " created");
        }
    }
}
/*
PS D:\0 - CDAC 2025\Assignment 4 (codes)> javac Q22_StudentObject.java
PS D:\0 - CDAC 2025\Assignment 4 (codes)> java Q22_StudentObject
Student Name: Amit
Student Amit created
Student object for Amit is being garbage collected
*/