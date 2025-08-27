import java.util.Scanner;

public class PositiveNum {

    public static void askForPositiveNumber() 
	{
        Scanner se = new Scanner(System.in);
        int num;

        
        do 
		{
            System.out.print("Enter a positive number: ");
            num = se.nextInt();
			
        } while (num <= 0);  

        System.out.println("You entered a positive number: " + num);

        se.close();
    }

    public static void main(String[] args) 
	{
        askForPositiveNumber();
    }
}
