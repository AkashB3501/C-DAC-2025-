 /*
 Problem 10: Student Marks Checker
Scenario:
Create a Student class with rollNo, name, and marks.
● Use a parameterized constructor to initialize all fields.
● Create a getter and setter for marks.
● In main, create one student, update marks using setter, and print student details.

 */
 
 class Q10_Student {

    int rollNo;
    String name;
    int marks;

    Q10_Student(int rollNo, String name, int marks) 
	{
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    void setMarks(int marks) 
	{
        this.marks = marks;
    }

    int getMarks() 
	{
        return marks;
    }

    void StudentDetails() 
	{
        System.out.println("Roll No=" + rollNo + ", Name=" + name + ", Marks=" + marks);
    }

    public static void main(String args[]) 
	{
        Q10_Student s1 = new Q10_Student(1, "Akash", 75);
        s1.setMarks(85);
        s1.StudentDetails();
    }
}
/*
PS D:\0 - CDAC 2025\Assignment 2 > javac Q10_Student.java
PS D:\0 - CDAC 2025\Assignment 2 > java Q10_Student

Roll No=1, Name=Akash, Marks=85
*/