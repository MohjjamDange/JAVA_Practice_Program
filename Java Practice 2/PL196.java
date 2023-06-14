import java.lang.*;
import java.util.*;
import java.io.*;

class PL196
{
	public static void main(String a[])
	{
		int iCnt = 0;
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the String");
		String str = sobj.nextLine();
		
		char Arr[] = str.toCharArray();
		for(int i = 0; i < Arr.length; i++)
		{
			if((Arr[i] >= 'a') && (Arr[i]<= 'z'))
			{
				iCnt++;
			}
		}
		System.out.println("Tottal COunt is Small Later is :"+iCnt);
	}
	
}