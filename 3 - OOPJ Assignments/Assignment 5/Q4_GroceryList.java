/*

Problem 4: Grocery Shopping List
Use Case: A person maintains a grocery list and removes items as they purchase them.
Requirements:
● Add items to grocery list
● Remove purchased items
● Display remaining items
Sample Input:
Add items: "Milk", "Eggs", "Bread"
Purchase: "Milk"
Expected Output:
Items to buy: Eggs, Bread

*/
import java.util.*;

class Q4_GroceryList 
{
    public static void main(String args[]) 
	{
        List<String> l1 = new ArrayList<>();
		
        l1.add("Milk");
        l1.add("Eggs");
        l1.add("Bread");
        
        l1.remove("Milk");
        
        System.out.println("Items to buy: " + l1);
    }
}
/*
PS D:\Assignment 5> javac Q4_GroceryList.java
PS D:\Assignment 5> java Q4_GroceryList

Items to buy: [Eggs, Bread]

*/