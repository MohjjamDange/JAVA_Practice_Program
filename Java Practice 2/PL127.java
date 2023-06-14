import java.lang.*;
import java.util.*;

class PL127
{
	public static void main(String a[])
	{
		int iRet = 0;
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the Length of Array");
		int iLength = sobj.nextInt();
		
		ArrayX aobj = new ArrayX(iLength);
		
		aobj.Accept();
		aobj.Display();
		
		iRet = aobj.Summetion();
		System.out.println("Summetion is :"+iRet);
		
		aobj = null;
		
	}
	
}

class ArrayX
{
	private int Arr[];
	
	public ArrayX(int iNo)
	{
		Arr = new int [iNo];
	}
	
	public void Accept()
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enetr the Elements of Array");
		
		for(int iCnt = 0; iCnt< Arr.length; iCnt++)
		{
			Arr[iCnt] = sobj.nextInt();
		}
		
	}
	
	public void Display()
	{
		System.out.println("Array Elemnets is : ");
		for(int iCnt = 0; iCnt < Arr.length; iCnt++)
		{
			System.out.println(Arr[iCnt]);
		}
		
	}
	
	public int Summetion()
	{
		int iSum = 0;
		for(int iCnt = 0; iCnt < Arr.length; iCnt++)
		{
			iSum = iSum + Arr[iCnt];
		}
		
		return iSum;
	}
	
	
	
}

