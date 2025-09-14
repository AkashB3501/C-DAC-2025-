/*

Problem 10: Electronic Voting System
Use Case: Track unique voters in an election system to prevent duplicate voting.
Requirements:
● Record voter IDs
● Ensure one vote per voter
● Count total unique voters
Sample Input:
Voter IDs: 201, 202, 203, 202
Expected Output:
Total voters: 3

*/

import java.util.*;

class Q10_VotingSystem 
{
    public static void main(String args[]) 
	{
	
        Set<Integer> voters = new HashSet<>();
		
        voters.add(201);
        voters.add(202);
        voters.add(203);
        voters.add(202);
        
        System.out.println("Total voters: " + voters.size());
    }
}
/*
PS D:\Assignment 5> javac Q10_VotingSystem.java
PS D:\Assignment 5> java Q10_VotingSystem

Total voters: 3

*/