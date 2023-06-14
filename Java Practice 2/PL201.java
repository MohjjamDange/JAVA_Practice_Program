import java.io.*;
import java.util.*;

class PL201
{
	public static void main(String a[])
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sobj.nextLine();
		
		String strNew = str.replaceAll("\\s+"," ");
		String Arr[] = strNew.split(" ");
		
		for(int iCnt = 0; iCnt < Arr.length; iCnt++)
		{
			System.out.println(Arr[iCnt]);
			System.out.println(iCnt);
		}
		
	}
	
	
	
	
	
}