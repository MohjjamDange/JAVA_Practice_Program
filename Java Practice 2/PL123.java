import java.lang.*;
import java.util.*;

class PL123
{
	public static void main(String a[])
	{
		int iRet = 0;
		Number nobj = new Number();
		
		nobj.Accept();
		
		iRet = nobj.Display();
		System.out.println("Factorial is :"+iRet);
		
	}
	
}

class Number
{
	private int iNo;
	
	public void Accept()
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enetr the Number :");
		this.iNo = sobj.nextInt();
		
	}
	public int Display()
	{
		int iCnt = 1,iFact = 1;
		
		for(iCnt = 1; iCnt <= iNo; iCnt++)
		{
			iFact = iFact * iCnt;
			
		}
		
		return iFact;
	}
	
}

