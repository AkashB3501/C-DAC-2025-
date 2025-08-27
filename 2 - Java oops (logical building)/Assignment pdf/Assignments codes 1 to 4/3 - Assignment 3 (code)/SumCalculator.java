import java.util.Scanner;

public class SumCalculator {

    
    public static int calculateSum(int num) 
	{
        int sum = 0;
		int i;
        for (i = 1; i <= num; i++) 
		{
            sum += i;  
        }
        return sum;
    }

    public static void main(String[] args) 
	{
	int N;
	
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter a number: ");
		
         N = sc.nextInt();

        
        int result = calculateSum(N);

        
        System.out.println("The sum of numbers from 1 to " + N + " is: " + result);

        
    }
}
