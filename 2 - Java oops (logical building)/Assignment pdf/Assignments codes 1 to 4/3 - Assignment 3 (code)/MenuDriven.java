import java.util.Scanner;

public class MenuDriven {

    
    public static void gradeEvaluation() 
	{
        Scanner sc = new Scanner(System.in);
		
        System.out.print("Enter marks in 3 subjects: ");
		
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();

        int avg = (m1 + m2 + m3) / 3;

        if (avg >= 90) 
		{
            System.out.println("Grade A");
        }
		else if (avg >= 70) 
		{
            System.out.println("Grade B");
        } else if (avg >= 50) 
		{
            System.out.println("Grade C");
        } else if (avg >= 30) 
		{
            System.out.println("Grade D");
        } else 
		{
            System.out.println("Fail");
        }
    }

    
    public static void leapYearCheck() 
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
		
        int year = sc.nextInt();

        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) 
		{
            System.out.println(year + " is a Leap Year.");
			
        } else 
		{
            System.out.println(year + " is NOT a Leap Year.");
        }
    }

   
    public static void dayOfWeek() 
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter day number (1-7): ");
		
        int day = sc.nextInt();

        switch (day) 
		{
            case 1: 
			System.out.println("Monday"); 
			break;
			
            case 2: 
			System.out.println("Tuesday"); 
			break;
			
            case 3: 
			System.out.println("Wednesday"); 
			break;
			
            case 4: 
			System.out.println("Thursday"); 
			break;
			
            case 5: 
			System.out.println("Friday"); 
			break;
			
            case 6: 
			System.out.println("Saturday"); 
			break;
			
            case 7: 
			System.out.println("Sunday"); 
			break;
			
            default: 
			System.out.println("Invalid day number!");
        }
    }

  
    public static void defaultValues() 
	{
        System.out.println("Default values of instance variables in Java:");
        System.out.println("byte = 0");
        System.out.println("short = 0");
        System.out.println("int = 0");
        System.out.println("long = 0L");
        System.out.println("float = 0.0f");
        System.out.println("double = 0.0d");
        System.out.println("char = '\\u0000'");
        System.out.println("boolean = false");
        System.out.println("Objects = null");
    }

    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
          
            System.out.println("\n======== MENU ========");
			
            System.out.println("1. Grade Evaluation System");
            System.out.println("2. Leap Year Check");
            System.out.println("3. Day of the Week");
            System.out.println("4. Identify Default Values of Variables");
            System.out.println("5. Exit");
			
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

           
            switch (choice) 
			{
                case 1: gradeEvaluation();
				break;
				
                case 2: leapYearCheck(); 
				break;
				
                case 3: dayOfWeek();
				break;
				
                case 4: defaultValues();
				break;
				
                case 5: System.out.println("Exiting program...");
				break;
				
                default: System.out.println("Invalid choice! Please try again.");
            }

        } 
		while (choice != 5);

        sc.close();
    }
}
