import java.lang.*;
import java.util.*;

class PL165
{
	public static void main(String arg[])
	{
		int iRet = 0;
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the Number");
		int iValue = sobj.nextInt();
		
		System.out.println("Enter the Position");
		int iValue2 = sobj.nextInt();
		
		bitwise bobj = new bitwise();
		
		iRet = bobj.bitON(iValue ,iValue2);
		System.out.println("Updated Value : "+iRet);
		
	}
	
	
	
}

class bitwise
{
	public int bitON(int iNo, int iPos)
	{
		
		if((iPos <= 0) ||(iPos >= 32))
		{
			System.out.println("Invalied Position");
			return 0;
			
		}
		int iMask = 0X00000001;
		int iResult = 0;
		
		iMask = iMask << (iPos - 1);
		
		iResult = iNo ^ iMask;
		
		return iResult;
		
	}
	
}


