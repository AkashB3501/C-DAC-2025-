import java.util.Scanner;
class ArraySum
{
	public static void main(String args[])
	{
		int[] number = new int[5];
		int i,sum=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 5 integers: ");
		
		for(i=0; i< number.length;i++)
		{
			number[i]=sc.nextInt();
		}
		for(int num : number)
		{
			sum += num;
		}
		System.out.println("The sum of all numbers is : "+ sum);
	}
}
