/*
Problem 13: Order Number Display
Scenario: An e-commerce system generates invoice numbers and needs to display them in reverse order
for verification purposes.
Task: Use StringBuilder to reverse order numbers.

Sample Input:
INV2025
Expected Output:
5202VNI
*/

import java.util.*;

class Q13_OrderNumberDisplay
 {
    public static void main(String[] args)
	{
		String order;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter order number: ");
         order = sc.nextLine();

        StringBuilder sb = new StringBuilder(order); 
		
        sb.reverse();

        System.out.println(sb.toString());

    }
}
/*
PS D:\0 - CDAC 2025\Assignment 4> javac Q13_OrderNumberDisplay.java
PS D:\0 - CDAC 2025\Assignment 4> java Q13_OrderNumberDisplay
Enter order number: INV2025
5202VNI
*/