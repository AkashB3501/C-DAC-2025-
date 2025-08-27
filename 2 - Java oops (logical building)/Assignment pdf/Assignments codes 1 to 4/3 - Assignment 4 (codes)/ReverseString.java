import java.util.Scanner;
class ReverseString {
	
	public static void main(String args[])
	{
		
		String str ;
		String rev;
		
		
		Scanner sc =new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		str = sc.nextLine();
		
		rev = new StringBuilder(str).reverse().toString();
		System.out.println("Reversed string: " + rev);
		
	}	
		

}