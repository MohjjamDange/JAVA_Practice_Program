import java.lang.*;

class PL133
{
	public static void main(String a[])
	{
		Pattern nobj = new Pattern(4, 4);
		
		nobj.Display();
		
	}
	
}


class Pattern
{
	private int iRow, iCol;
	
	public Pattern(int a, int b)
	{
		iRow = a;
		iCol = b;
		
	}
	
	public void Display()
	{
		int i,j = 0;
		
		for(i = 1; i <= iRow; i++)
		{
			for(j = 1; j <= iCol; j++)
			{
				System.out.print("*\t");
			}
			
			System.out.println();
			
		}
		
	}
	
}
