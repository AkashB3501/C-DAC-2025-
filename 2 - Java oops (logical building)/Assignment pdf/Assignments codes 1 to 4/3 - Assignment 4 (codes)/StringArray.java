import java.util.Scanner;

class StringArray
{
  public static void main(String args[])
   {
	String[] name = new String[4];
	int i;
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter 4 names: ");
	
	for(i=0; i< name.length; i++)
	{
		name[i]=sc.next();
	}
	
	System.out.println("The names are: ");
	
	for(String names : name)
	{
		System.out.print(names + " ");
	}
  }
}

