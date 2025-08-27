import java.util.Scanner;

public class Palindrome
{
    public static void main(String[] args) 
	{ 
        String rev;
		String str;
		
		
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
         str = sc.nextLine();

     
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        rev = new StringBuilder(str).reverse().toString();

     
        if (str.equals(rev)) 
		{
            System.out.println("The string ' "+str+" 'is a palindrome.");
        } 
		else
		{
            System.out.println("The string "+str+"is not a palindrome.");
        }

        sc.close();
    }
}
