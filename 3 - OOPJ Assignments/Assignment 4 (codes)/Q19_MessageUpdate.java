import java.util.*;

class Q19_MessageUpdate 
{
    public static void main(String args[]) {
		
        Scanner sc = new Scanner(System.in);

        String original = sc.nextLine();
        
        String findText = sc.nextLine();
       
        String replaceText = sc.nextLine();
 
        StringBuffer sb = new StringBuffer(original);
        int start = sb.indexOf(findText);
		
        if (start != -1) 
		{
            sb.replace(start, start + findText.length(), replaceText);
        }

        
        System.out.println(sb.toString());
   
    }
}

/*
PS D:\0 - CDAC 2025\Assignment 4> javac Q19_MessageUpdate.java
PS D:\0 - CDAC 2025\Assignment 4> java Q19_MessageUpdate

Old Notice
Old
Updated

Updated Notice

*/