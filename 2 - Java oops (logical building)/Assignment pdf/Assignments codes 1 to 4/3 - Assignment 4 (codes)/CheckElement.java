import java.util.Scanner;
import java.util.Arrays;

class CheckElement {
	
    public static void main(String args[]) 
	{
 
        Integer[] numbers = new Integer[5];
		int i;
		
		
		Scanner sc = new Scanner(System.in);

        System.out.println("Enter 5 integers: ");
		
        for(i = 0; i < numbers.length; i++) 
		{
            numbers[i] = sc.nextInt();
        }
      
        System.out.print("Enter the number to search: ");
        int searchNum = sc.nextInt();

        
        if (Arrays.asList(numbers).contains(searchNum)) 
		{
            System.out.println("Found");
			
        } else 
		{
            System.out.println("Not Found");
        }

       
    }
}
