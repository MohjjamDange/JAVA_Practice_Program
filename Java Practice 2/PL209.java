import java.lang.*;
import java.util.*;

class PL203
{
	public static void main(String a[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the String");
		String str = sobj.nextLine();
		
		String strNew = str.replaceAll("\\s+"," ");
		String Arr[] = strNew.split(" ");
		
		for(int iCnt =0; iCnt < Arr.length; iCnt++)
		{
			StringBuffer sb = new StringBuffer(Arr[iCnt]);
			System.out.println(sb.reverse());
		}
		
	}
}