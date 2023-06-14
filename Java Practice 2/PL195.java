import java.lang.*;
import java.util.*;
import java.io.*;

class PL195
{
	public static void main(String a[])
	{
		try
		{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter The File Name");
		String Filename = sobj.nextLine();
		
		File fobj = new File(Filename);
		
		if(fobj.exists())
		{
			BufferedReader bobj = new BufferedReader(new FileReader(fobj));
			String str;
			while((str = bobj.readLine()) != null)
			{
				System.out.println(str);
			}
		}
		}
		catch(Exception obj)
		{
			System.out.println(obj);
		}
		
	}
	
	
	
	
}