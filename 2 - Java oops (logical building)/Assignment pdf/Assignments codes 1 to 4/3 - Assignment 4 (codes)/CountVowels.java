import java.util.Scanner;

public class CountVowels 
{
    public static void main(String[] args) 
	{
        String str;
		int count = 0;
		
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        str = sc.nextLine();

        str = str.toLowerCase();  
       
        for (int i = 0; i < str.length(); i++) 
		{
            char c = str.charAt(i);

            
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
			{
                count++;  
            }
        }

        System.out.println("The number of vowels in '" + str + "' is: " + count);

       
    }
}
