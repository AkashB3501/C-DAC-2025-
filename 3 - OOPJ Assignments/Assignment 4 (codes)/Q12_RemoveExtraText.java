/*
Problem 12: Remove Extra Text

Scenario: An automated message system sometimes adds extra text that needs to be removed before
sending messages to students.
Task: Use StringBuilder to clean up message content.

Sample Input:
Original Text: Please read - Do not disturb
Exact substring to delete: - Do not disturb

Expected Output:
Please read
*/
class Q12_RemoveExtraText 
{
    public static void main(String args[]) 
	{
        StringBuilder sb = new StringBuilder("Please read - Do not disturb");

        String remove = "- Do not disturb";
		
        int start = sb.indexOf(remove);

        if (start != -1)
		{
            sb.delete(start, start + remove.length());
        }

        System.out.println(sb.toString().trim());
    }
}
/*

PS D:\0 - CDAC 2025\Assignment 4> javac Q12_RemoveExtraText.java
PS D:\0 - CDAC 2025\Assignment 4> java Q12_RemoveExtraText
Please read

*/