import java.lang.*;
import java.util.*;
import java.io.*;

class PL193
{
	public static void main(String a[])
	{
		
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the File Name");
		String FileName = sobj.nextLine();
		
		File fobj = new File(FileName);
		if(fobj.exists())
		{
			long iSize = fobj.length();
			System.out.println("File IS Succesfully Found");
			System.out.println("Size of File is : "+iSize);
			
		}
		else
		{
			System.out.println("File Not Found");
		}
	
		
		
	}
	
}