import java.lang.*;
import java.util.*;


class PL131
{
	public static void main(String a[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the Length of Array");
		int iNo = sobj.nextInt();
		
		
		Number nobj = new Number(iNo);
		
		nobj.Accept();
		nobj.Display();
		
	}
	
}

class Number
{
	private int Arr[];
	
	public Number(int iSize)
	{
		Arr = new int[iSize];
	}
	
	public void Accept()
	{
		System.out.println("Enter the Elements of Array");
		Scanner sobj = new Scanner(System.in);
		
		for(int iCnt = 0; iCnt < Arr.length; iCnt++)
		{
			Arr[iCnt] = sobj.nextInt();
		}
		
	}
	
	public void Display()
	{
		System.out.println("Array is :");
		for(int iCnt = 0; iCnt < Arr.length; iCnt++)
		{
			System.out.println(Arr[iCnt]);
			
		}
		
	}
	
}


