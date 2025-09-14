/*
Problem 16: Room Allocation Update

Scenario: A facility management system assigns rooms to different activities and needs to insert building
information into existing room numbers.
Task: Use StringBuffer to update room allocation information.

Sample Input:
Original text: 101
Text to insert: New Building
Insert index: 0

Expected Output:
New Building 101
*/
import java.util.*;

class Q16_RoomAllocation
{
    public static void main(String args[]) 
	{
        Scanner sc = new Scanner(System.in);

        String original = sc.nextLine();
     
        String insertText = sc.nextLine();
       
        int index = sc.nextInt();
        
        StringBuffer sb = new StringBuffer(original);
        sb.insert(index, insertText + " ");  // Add a space after inserted text

        System.out.println(sb.toString());

        sc.close();
    }
}
/*
PS D:\0 - CDAC 2025\Assignment 4 (codes)> javac Q16_RoomAllocation.java
PS D:\0 - CDAC 2025\Assignment 4 (codes)> java Q16_RoomAllocation
101
New Building
0
New Building 101
*/