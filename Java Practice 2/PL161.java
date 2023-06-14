import java.lang.*;
import java.util.*;

class PL161
{
	public static void main(String arg[])
	{
		boolean bRet;
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the Number");
		int iValue = sobj.nextInt();
		
		bitwise bobj = new bitwise();
		
		bRet = bobj.chkBit(iValue);
		if(bRet == true)
		{
			System.out.println("Bit Is ON");
		}
		else
		{
			System.out.println("Bit Is OFF");
		}			
		
	}
	
}

class bitwise
{
	public boolean chkBit(int iNo)
	{
		int iResult = 0;
		int iMask = 64;
		
		
		iResult = iNo & iMask;
		if(iResult == 0)
		{
			return false;
		}
		else
		{
			return true;
		}
		
	}
	
}

