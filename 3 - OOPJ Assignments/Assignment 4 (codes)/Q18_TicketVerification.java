/*
Problem 18: Ticket Number Verification

Scenario: A ticketing system generates verification codes by reversing ticket numbers for security
purposes.
Task: Use StringBuffer to create verification codes.

Sample Input:
12345
Expected Output:
54321


*/

import java.util.*;

class Q18_TicketVerification 
{
    public static void main(String args[]) 
	{
        Scanner sc = new Scanner(System.in);
   
        String ticket = sc.nextLine();
        
        StringBuffer sb = new StringBuffer(ticket);
		
        sb.reverse();

        
        System.out.println(sb);

        
    }
}
/*

PS D:\0 - CDAC 2025\Assignment 4> javac Q18_TicketVerification.java
PS D:\0 - CDAC 2025\Assignment 4> java Q18_TicketVerification

12345
54321

*/