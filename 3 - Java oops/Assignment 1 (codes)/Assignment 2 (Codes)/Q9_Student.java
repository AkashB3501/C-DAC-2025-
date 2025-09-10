/*
Problem 9: School Fee System

Scenario:
A school wants to initialize the tuition fee for all students once at program start. Each student has name
and class. Use static blocks to set the fee and setters/getters to update/access student information.
Tasks:
1. Create a Student class.
2. Use a static block to initialize tuitionFee to 30000.
3. Create instance variables: name (String) and className (String).
4. Create setters and getters for name and className.
5. Print student details including tuition fee.
Input Example:
Student1: Name="Anjali", Class="10th"
Student2: Name="Vikram", Class="12th"
Expected Output:
School Tuition Fee Initialized: 30000
Student1: Name=Anjali, Class=10th, Tuition Fee=30000
Student2: Name=Vikram, Class=12th, Tuition Fee=30000

*/
 
 class Q9_Student {

    String name;
    String className;
    static int tuitionFee;

    static 
	{
        tuitionFee = 30000;
        System.out.println("School Tuition Fee Initialized: " + tuitionFee);
    }

    void setDetails(String name, String className) 
	{
        this.name = name;
        this.className = className;
    }

    String getName() 
	{
        return name;
    }

    String getClassName() 
	{
        return className;
    }

    static int getTuitionFee() 
	{
        return tuitionFee;
    }

    void StudentDetails() 
	{
        System.out.println("Name=" + name + ", Class=" + className + ", Tuition Fee=" + tuitionFee);
    }

    public static void main(String args[]) 
	{
        Q9_Student s1 = new Q9_Student();
        s1.setDetails("Anjali", "10th");

        Q9_Student s2 = new Q9_Student();
        s2.setDetails("Vikram", "12th");

        System.out.print("Student1: ");
        s1.StudentDetails();

        System.out.print("Student2: ");
        s2.StudentDetails();
    }
}
/*

PS D:\0 - CDAC 2025\Assignment 2 (Codes)> javac Q9_Student.java
PS D:\0 - CDAC 2025\Assignment 2 (Codes)> java Q9_Student
School Tuition Fee Initialized: 30000
Student1: Name=Anjali, Class=10th, Tuition Fee=30000
Student2: Name=Vikram, Class=12th, Tuition Fee=30000

*/