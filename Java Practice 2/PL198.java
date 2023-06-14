import java.lang.*;
import java.io.*;
import java.util.*;

class PL198
{
	public static void main(String a[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the String");
		String str = sobj.nextLine();
		
		String Arr[] = str.split(" ");
		System.out.println("White Space in String is :"+Arr.length);
		
	}
	
}