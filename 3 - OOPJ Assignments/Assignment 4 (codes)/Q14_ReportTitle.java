/*
Problem 14: Report Title

Scenario: A report generation system needs to modify document titles by adding department names and
updating formatting.
Task: Use StringBuilder method chaining to efficiently modify report titles.

Sample Input:
Original title: Annual Report
Department Name: CDAC

Expected Output:
Annual CDAC Report
*/

import java.util.*;

class Q14_ReportTitle {
	
    public static void main(String args[]) {
		
		 String original,department;
	
        Scanner sc = new Scanner(System.in);

         original = sc.nextLine();    
         department = sc.nextLine(); 

        int index = original.indexOf(" Report ");

        StringBuilder sb = new StringBuilder(original);

        if (index != -1) 
		{
            sb.insert(index, " " + department);
        }
		else 
		{
            
            sb.append(" " + department);
        }

        System.out.println(sb);

        
    }
}

/*

PS D:\0 - CDAC 2025\Assignment 4> javac Q14_ReportTitle.java
PS D:\0 - CDAC 2025\Assignment 4> java Q14_ReportTitle

Annual Report
CDAC

Annual CDAC Report
*/