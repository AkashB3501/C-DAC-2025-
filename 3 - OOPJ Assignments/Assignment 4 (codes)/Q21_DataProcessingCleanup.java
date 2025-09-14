/*
Problem 21: Data Processing Cleanup

Scenario: A data processing system handles user form submissions and must always close database
connections and clean up resources, whether the processing succeeds or fails.
Task: Use finally block to ensure proper resource cleanup.

Sample Input:
(No input required)
Expected Output:
Exception occurred: Invalid inp
*/

class Q21_DataProcessingCleanup
 {
    public static void main(String[] args) 
	{
        try {
            
            throw new Exception("Invalid inp");
			
        } catch (Exception e) 
		{
            System.out.println("Exception occurred: " + e.getMessage());
			
        } finally {
            
            System.out.println("Cleanup done");
        }
    }
}
/*

PS D:\0 - CDAC 2025\Assignment 4> javac Q21_DataProcessingCleanup.java
PS D:\0 - CDAC 2025\Assignment 4> java Q21_DataProcessingCleanup

Exception occurred: Invalid inp
Cleanup done

*/