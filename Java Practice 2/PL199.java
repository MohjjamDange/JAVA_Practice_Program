import java.lang.*;
import java.util.*;
import java.io.*;

class PL199
{
	public static void main(String a[])
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sobj.nextLine();
		
		String strNew = str.replaceAll("\\s+"," ");
		
		String Arr[] = strNew.split(" ");
		System.out.println("Totaln Number of World is : "+Arr.length);
		
	}
	
}