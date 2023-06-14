import java.lang.*;
import java.util.*;

class PL130
{
	public static void main(String a[])
	{
		Number aobj = new Number();
		
		aobj.Accept();
		aobj.Display();
		
		aobj = null;
		
	}
	
}


class Number
{
	private int iNo;
	
	public void Accept()
	{
		System.out.println("Enter the Number");
		Scanner sobj = new Scanner(System.in);
		
		this.iNo = sobj.nextInt(); 
		
	}
	
	public void Display()
	{
		System.out.println(this.iNo);
		
	}
	
}


