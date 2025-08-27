import java.util.Scanner;

class MultiplicationTable
{
	
	public static void printMultiplicationTable(int n)
	{
		int i;
		for(i=1;i <= 10;i++)
		{
			System.out.println(n + " x " + i + " = " + (n * i));
	    }
	}

public static void main(String args[])
 {
	int num;
	
  Scanner se = new Scanner(System.in);

  System.out.print("Enter a number: ");
  num=se.nextInt();

  printMultiplicationTable(num);

 }	

}