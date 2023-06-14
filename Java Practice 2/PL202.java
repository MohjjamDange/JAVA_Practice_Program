import java.io.*;
import java.util.*;

class PL202
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the String");
		String str = sobj.nextLine();
		
		String strNew = str.replaceAll("\\s"," ");
		
		String Arr[] = strNew.split(" ");
		
		int iMax = 0;
		
		for(int iCnt = 0; iCnt < Arr.length; iCnt++)
		{
			if(iMax < Arr[iCnt].length())
			{
				iMax = Arr[iCnt].length();
			}
			
		}
		System.out.println("maximum latter in word is : "+iMax);
		
	}
	
}