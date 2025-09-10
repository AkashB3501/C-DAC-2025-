/*
Problem 11: Student Grade Calculator
Scenario:
Extend previous problem. Add method calculateGrade() which returns:
● "A" if marks ≥ 80
● "B" if marks ≥ 60
● "C" if marks ≥ 40
● "Fail" otherwise
● Create 2 students, print marks and grades.

*/

class Q11_Student {

    int rollNo;
    String name;
    int marks;

    Q11_Student(int rollNo, String name, int marks) 
	{
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    void setMarks(int marks) 
	{
        this.marks = marks;
    }

    int getMarks() {
        return marks;
    }

    String calculateGrade() 
	{
        if (marks >= 80) 
		{	
		    return "A";
		}
        else if (marks >= 60) 
		{
			return "B";
		}
        else if (marks >= 40) 
		{
			return "C";
		}
        else 
		{
			return "Fail";	
		}
    }

    void StudentDetails() 
	{
        System.out.println("Roll No=" + rollNo + ", Name=" + name + ", Marks=" + marks + ", Grade=" + calculateGrade());
    }

    public static void main(String args[])
	{
        Q11_Student s1 = new Q11_Student(1, "Rahul", 85);
        Q11_Student s2 = new Q11_Student(2, "Mohit", 55);

        s1.StudentDetails();
        s2.StudentDetails();
    }
}
/*
PS D:\0 - CDAC 2025\Assignment 2 > javac Q11_Student.java
PS D:\0 - CDAC 2025\Assignment 2 > java Q11_Student

Roll No=1, Name=Rahul, Marks=85, Grade=A
Roll No=2, Name=Mohit, Marks=55, Grade=C

*/