/*
Problem 11: Notification Update

Scenario: A university notification system needs to update announcements when exam schedules change.
The system should efficiently replace old information with new information.
Task: Use StringBuilder to update notification messages.

Sample Input:
Original text: Exam postponed
Text to find: postponed
Replacement Text: rescheduled

Expected Output:
Exam rescheduled
*/

class Q11_Notification 
{
    public static void main(String args[])
	{
        int start;
	    String find,replace;
	   
        StringBuilder sb1 = new StringBuilder("Exam postponed");

        
         find = "postponed";
        replace = "rescheduled";

       
         start = sb1.indexOf(find);

        if (start != -1)
		{ 
            int end = start + find.length();
            sb1.replace(start, end, replace);
        }

       
        System.out.println(sb1.toString());
    }
}
/*
PS D:\0 - CDAC 2025\Assignment 4> javac Q11_Notification.java
PS D:\0 - CDAC 2025\Assignment 4> java Q11_Notification

Exam rescheduled
*/