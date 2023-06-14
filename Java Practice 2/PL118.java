import java.lang.*;

class PL118
{
	public static void main(String a[])
	{
		Derived dobj = new Derived();
		dobj.fun();
		dobj.fun(12);
		
		dobj.sun();
		
	}
	
}

class Base
{
	public int i;
	public int j;
	
	Base()
	{
		i = 10;
		j = 20;
	}
	
	public void fun()
	{
		System.out.println("Inside void Base fun");
	}
	
	public void fun(int iNo)
	{
		System.out.println("Inside Base Perametrised fun");
	}
	
}

class Derived extends Base
{
	public int x;
	public int y;
	
	public void sun()
	{
		System.out.println("Inside of Derived Sun");
	}
	
	
	
}
