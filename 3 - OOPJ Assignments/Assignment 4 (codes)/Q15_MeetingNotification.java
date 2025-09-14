/*
Problem 15: Meeting Notification

Scenario: A corporate meeting scheduler needs to build complete meeting notifications by adding time
and location details to basic meeting announcements.
Task: Use StringBuffer to create detailed meeting notifications.

Sample Input:
Base text: Meeting:
Text to append: Friday at 5 PM

Expected Output:
Meeting: Friday at 5 PM

*/

import java.util.*;

class Q15_MeetingNotification 
{
    public static void main(String args[]) 
	{
		
        Scanner sc = new Scanner(System.in);

        String Text = sc.nextLine();
  
        String appendText = sc.nextLine();

        StringBuffer sb = new StringBuffer(Text);
        sb.append(" " + appendText);

      
        System.out.println(sb.toString());

       
    }
}
/*
PS D:\0 - CDAC 2025\Assignment 4> javac Q15_MeetingNotification.java
PS D:\0 - CDAC 2025\Assignment 4> java Q15_MeetingNotification

Meeting:
Friday at 5 PM

Meeting: Friday at 5 PM

*/