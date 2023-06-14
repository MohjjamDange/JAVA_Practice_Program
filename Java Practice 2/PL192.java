import java.lang.*;
import java.util.*;
import java.io.*;

class PL192
{
	public static void main(String a[])
	{
		try
		{
		Scanner sobj = new Scanner(System.in);
		
		
		System.out.print("Enter the File Name : ");
		String FileName = sobj.nextLine();
		
		File fobj = new File(FileName);
		boolean bobj = fobj.createNewFile();
		
		if(bobj == true)
		{
			System.out.println("File Succesfully Created");
		}
		else
		{
			System.out.println("File is Unable to Create");
		}
		}
		catch(IOException cobj)
		{
			System.out.println(cobj);
		}
		
	}
	
}