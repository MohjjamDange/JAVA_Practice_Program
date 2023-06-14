import java.lang.*;
import java.util.*;

class PL122
{
	public static void main(String a[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("What is Your Name");
		String name = sobj.nextLine();
		
		System.out.println("What is your Age");
		int iNo = sobj.nextInt();
		
		System.out.println("What is your Percentage");
		float per = sobj.nextFloat();
		
		System.out.println("My name is :"+name);
		System.out.println("My age is :"+iNo);
		System.out.println("My percentage is :"+per);
	}
	
}