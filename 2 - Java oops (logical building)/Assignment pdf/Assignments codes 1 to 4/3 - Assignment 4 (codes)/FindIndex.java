import java.util.Scanner;
import java.util.Arrays;

class FindIndex {
	
    public static void main(String args[]) 
	{   
	    int searchNum;
		int i;
		int[] numbers = new int[5];
	
	
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 5 integers: ");
		
        for (i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.print("Enter the number to search: ");
         searchNum = sc.nextInt();
 
        Arrays.sort(numbers);
       
        int index = Arrays.binarySearch(numbers, searchNum);

        if (index >= 0) 
		{
            System.out.println("The number " + searchNum + " is found at index " + index);
        } else 
		{
            System.out.println("Not Found");
        }
        
    }
}
