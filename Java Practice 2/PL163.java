import java.lang.*;
import java.util.*;

class PL162
{
	public static void main(String arg[])
	{
		int iRet = 0;
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the Number");
		int iValue = sobj.nextInt();
		
		bitwise bobj = new bitwise();
		iRet = bobj.onBit(iValue);
		System.out.println("Updated Number is : "+iRet);
		
	}
	
}

class bitwise
{
	public int onBit(int iNo)
	{
		int iMask = 0X00000008;
		int iResult = 0;
		
		iResult = iNo | iMask;
		
		return iResult;
		
	}	
	
}

