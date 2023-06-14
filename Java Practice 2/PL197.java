import java.lang.*;
import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

class PL197
{
	public static void main(String a[])
	{
		try
		{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the File Name");
		String FileName = sobj.nextLine();
		
		System.out.println("Enter the File Name which you Want Create");
		String NewFileName = sobj.nextLine();
		
		File fobj = new File(FileName);
		File fobj2 = new File(NewFileName);
		
		boolean bobj = fobj2.createNewFile();
		if(fobj.exists())
		{
			FileInputStream ifobj = new FileInputStream(fobj);
			FileOutputStream ofobj = new FileOutputStream(fobj2);
			
			byte Buffer[] = new byte[100];
			int iRet = 0;
			
			while((iRet = ifobj.read(Buffer)) != -1)
			{
				ofobj.write(Buffer);
			}
			
		}
		else
		{
			System.out.println("File is Not Available");
		}
		}
		catch(Exception obj)
		{
			System.out.println(obj);
		}
		
		
		
		
	}
	
}