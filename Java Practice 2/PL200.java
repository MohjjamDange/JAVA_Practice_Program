import java.io.*;
import java.util.*;

class PL200
{
	public static void main(String a[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the String");
		String str = sobj.nextLine();
		
		String strNew = str.replaceAll("\\s+", " ");
		String strNew2 = strNew.trim();
		
		String arr[] = strNew2.split(" ");
		System.out.println("Total Count of Words is :"+arr.length);
		
	}
}