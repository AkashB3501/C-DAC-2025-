/*

Problem 15: Library Book Inventory

Use Case: Track available copies of books in a library system.

Requirements:
● Map book titles to available copies
● Update copies when books are borrowed
● Display current inventory

Sample Input:
Initial inventory: "Java" → 3, "Python" → 5
Borrow: "Java" (1 copy)

Expected Output:
Current inventory: Java:2, Python:5
*/

import java.util.*;

class Q15_LibraryInventory {
	
  public static void main(String args[]) 
  
  {
        Map<String, Integer> books = new HashMap<>();
        
		books.put("Java", 3);
        books.put("Python", 5);

        
        books.put("Java", books.get("Java") - 1);

        System.out.println("Current inventory: " + books);
    }
	
}
/*

PS D:\Assignment 5> javac Q15_LibraryInventory.java
PS D:\Assignment 5> java Q15_LibraryInventory

Current inventory: {Java=2, Python=5}
*/