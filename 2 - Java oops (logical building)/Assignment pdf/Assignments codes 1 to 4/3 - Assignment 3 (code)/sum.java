import java.util.Scanner;

class sum {
	public static int sumOfTwoNumbers(int a,int b)
	{
		return a+b;
		
	}
 public static void main(String args[])
 {
	 int num1,num2,result;
	 
   Scanner se = new Scanner(System.in);
   
   System.out.print("Enter frist number :");
   num1 = se.nextInt();
   
   System.out.print("Enter second number:");
   num2 = se.nextInt();
   
   result = sumOfTwoNumbers(num1,num2);
   
   System.out.println("The sum of " + num1 + " and " + num2 + " is " +result);
   
 }
}