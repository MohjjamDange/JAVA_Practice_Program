import java.lang.*;
import java.util.*;

class PL126
{
	public static void main(String a[])
	{
		int iRet = 0;
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the of Array : ");
		int iSize = sobj.nextInt();
		
		ArrayX aobj = new ArrayX(iSize);
		
		aobj.Accept();
		aobj.Display();
		iRet = aobj.Summetion();
		System.out.println("Summetion is : "+iRet);
		
		
	}
	
}

class ArrayX
{
	private int Arr[];
	
	
	public ArrayX(int iNo)
	{
		Arr = new int[iNo];
	}
	
	public void Accept()
	{
		int iCnt = 0;
		
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the Array Elements");
		
		for(iCnt = 0; iCnt < Arr.length; iCnt++)
		{
			Arr[iCnt] = sobj.nextInt();
		}
		
	}
	
	public void Display()
	{
		int iCnt = 0;	
		
		System.out.println("Array is : ");
		
		for(iCnt = 0; iCnt < Arr.length; iCnt++)
		{
			System.out.println(Arr[iCnt]);
			
		}
		
	}
	
	public int Summetion()
	{
		int iCnt = 0;
		int iSum = 0;
	
		
		for(iCnt = 0; iCnt < Arr.length; iCnt++)
		{
			iSum = iSum + Arr[iCnt];
			
		}
		return iSum;
		
	}
	
}

