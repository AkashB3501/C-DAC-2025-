/*
Problem 10: Greeting Message

Scenario: A learning management system generates personalized greeting messages for students. The
system starts with a basic greeting and adds course-specific information.
Task: Use StringBuilder to create a personalized greeting message.

Sample Input:
Initial Text: Hello
Text to insert: CDAC
Insert Index: 6
Text to append: Java Student

Expected Output:
Hello CDAC Java Student
*/

import java.util.*;

class Q10_GreetingMessage 
{
    public static void main(String args[]) 
	{
      
        StringBuilder sb1 = new StringBuilder("Hello");

        
        sb1.insert(5, " CDAC ");

        sb1.append("Java Student");

   
        System.out.println(sb1.toString());
    }
}
/*
PS D:\0 - CDAC 2025\Assignment 4> javac Q10_GreetingMessage.java
PS D:\0 - CDAC 2025\Assignment 4> java Q10_GreetingMessage
Hello CDAC Java Student
*/