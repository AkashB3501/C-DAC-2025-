/*
Problem 17: Remove Outdated Information

Scenario: An academic system maintains course information that includes year details. When information
becomes outdated, the year needs to be removed.
Task: Use StringBuffer to remove outdated information.

Sample Input:
Original text: CDAC Kharghar 2024
Exact substring to delete: 2024
Expected Output:
CDAC Kharghar

*/

import java.util.*;

class Q17_RemoveOutdatedInfo 
{
    public static void main(String args[])
	{
        Scanner sc = new Scanner(System.in);

        String original = sc.nextLine();

        String toDelete = sc.nextLine();

        StringBuffer sb = new StringBuffer(original);

        int start = sb.indexOf(toDelete);
		
        if (start != -1)
		{
            sb.delete(start, start + toDelete.length());
        }

        System.out.println(sb.toString().trim());
      
    }
}
/*

PS D:\0 - CDAC 2025\Assignment 4> javac Q17_RemoveOutdatedInfo.java
PS D:\0 - CDAC 2025\Assignment 4> java Q17_RemoveOutdatedInfo

CDAC Kharghar 2024
2024
CDAC Kharghar

*/