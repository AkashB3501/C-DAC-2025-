/* Question 4: Print Even Numbers from 1 to N
Problem Statement:
Write a Java program that asks the user for a number N and prints all the even numbers from 1 to N using a for loop.
Sample Input:
Enter a number: 10

Expected Output:
2 4 6 8 10
*/

import java.util.Scanner;

class EvenNum 
{
    public static void main(String args[]) 
	{
        int n,i;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = sc.nextInt();  

        for (i = 2; i <= n; i += 2) {
            System.out.print(i + " "); 
        }


    }
}

/* output:
PS D:\0 - CDAC 2025\3 - Assignment 4 (codes)> javac EvenNum.java
PS D:\0 - CDAC 2025\3 - Assignment 4 (codes)> java EvenNum
Enter a number: 10
2 4 6 8 10  */
