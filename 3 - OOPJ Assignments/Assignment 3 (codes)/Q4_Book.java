/*
Q4. Library Book Availability
Scenario: A library wants to keep track of available copies without letting external code change it
directly.
Problem Statement:
Create a class Book with private copiesAvailable. Provide getter/setter to update or read copies.
Fields:
● private int copiesAvailable
Methods:
● addCopies(int n) → add copies
● removeCopies(int n) → subtract if enough copies
● getCopiesAvailable() → return current copies
Sample Input:
add 3 copies, remove 1 copy
Sample Output:
Copies available = 2

*/
import java.util.Scanner;

class Q4_Book 
{
    private int copiesAvailable;

    public void addCopies(int n)
	{
        copiesAvailable += n;
    }

    public void removeCopies(int n)
	{
        if (n <= copiesAvailable) 
		{
            copiesAvailable -= n;
        } 
		else 
		{
            System.out.println("Not copies available");
        }
    }

    public int getCopiesAvailable()
	{
        return copiesAvailable;
    }

    public static void main(String args[]) 
	{
		int a,r;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Add copies :");
		a =sc.nextInt();
		
	
		System.out.print("Remove copy :");
		r =sc.nextInt();
		
		
        Q4_Book b = new Q4_Book();
        b.addCopies(a);
        b.removeCopies(r);
		
        System.out.println("Copies available = " + b.getCopiesAvailable());
    }
}
/*

PS D:\0 - CDAC 2025\Assignment 3(codes)> javac Q4_Book.java
PS D:\0 - CDAC 2025\Assignment 3(codes)> java Q4_Book
Add copies :3
Remove copy :1
Copies available = 2

*/