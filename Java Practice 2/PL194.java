import java.lang.*;
import java.util.*;
import java.io.*;


class PL194
{
	public static void main(String a[])
	{
		try
		{
		InputStreamReader iobj = new InputStreamReader(System.in);
		
		BufferedReader bobj = new BufferedReader(iobj);
		
		System.out.println("Enter the Your Name");
		String fName = bobj.readLine();
		
		System.out.println("Enter Your Age");
		int age = Integer.parseInt(bobj.readLine());
		
		System.out.println("Enter your Percentage");
		float percentage = Float.parseFloat(bobj.readLine());
		
		System.out.println("Your Name is : "+fName);
		System.out.println("Your Age is : "+age);
		System.out.println("Your percentage is : "+percentage);
		}
		catch(IOException obj)
		{
			System.out.println(obj);
		}
		 
	}
	
}