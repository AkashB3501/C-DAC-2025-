import java.util.Scanner;
class AgeChecker{
	
	
	public static void checkAgeCategory(int age)
	{
		if(age < 18)
		{
			System.out.println("You are a minor");
		}
		else if(age >= 18 && age< 60)
		{
			System.out.println("You are an Adult");
		}
		else
		{
			System.out.println("You are a senior citizen");
	    }
	}
			
		
	public static void main(String args[])
	{
		int age;
		Scanner se = new Scanner(System.in);
		
		System.out.print("Enter your age: ");
		age = se.nextInt();
		
        checkAgeCategory(age);
	}
}
        
        