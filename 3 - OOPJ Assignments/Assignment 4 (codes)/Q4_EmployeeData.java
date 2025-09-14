import java.util.*;

class Q4_EmployeeData {

    static void calculateWage(int[] salaries, int index, int hours) {
        try {
            int salary = salaries[index];  

            try {

                int wage = salary / hours;  
               
            } catch (ArithmeticException e) 
			{
                System.out.println("Division by zero");
            }

        } catch (ArrayIndexOutOfBoundsException e) 
		{
            System.out.println("Invalid index");
        }
    }

    public static void main(String args[]) 
	{   
	    int n,i,h;
        Scanner sc = new Scanner(System.in);

         n = sc.nextInt();  
        int[] s = new int[n];

        for ( i = 0; i < n; i++) 
		{
            s[i] = sc.nextInt();
        }

         i = sc.nextInt(); 
         h = sc.nextInt(); 

        calculateWage(s, i, h);

        
    }
}
/*
PS D:\0 - CDAC 2025\Assignment 4(codes)> javac Q4_EmployeeData.java
PS D:\0 - CDAC 2025\Assignment 4(codes)> java Q4_EmployeeData
2
5000
6000
0
5

PS D:\0 - CDAC 2025\Assignment 4 (codes)> java Q4_EmployeeData
2
5000
6000
0
0
Division by zero

*/