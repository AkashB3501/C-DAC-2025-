
/*

Problem 28: Department Employee Mapping

Use Case: Organize employees by department for HR management.

Requirements:
● Map departments to employee lists
● Group employees by department
● Display departmental structure

Sample Input:
Department mapping: "IT" → ["Amit", "Rohan"], "HR" → ["Priya"]

Expected Output:
Department Structure: IT: Amit,Rohan; Hr:Priya
*/

import java.util.*;

class Q28_DepartmentMapping{
	
  public static void main(String args[])
  {
	  
	  Map<String,List<String>> dept = new HashMap<>();
	  
	  dept.put("IT",Arrays.asList("Amit","Rohan"));
	  dept.put("HR",Arrays.asList("Priya"));
	  
	  
	 System.out.println("Department structure: "+dept); 
	    
  }

}

/*

PS D:\Assignment 5> javac Q28_DepartmentMapping.java
PS D:\Assignment 5> java Q28_DepartmentMapping

Department structure: {HR=[Priya], IT=[Amit, Rohan]}

*/