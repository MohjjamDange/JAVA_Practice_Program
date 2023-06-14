import java.lang.*;

class PL119
{
	public static void main(String a[])
	{
		Derived dobj = new Derived();
		dobj.fun();
		
	}
	
}

class Base
{
	public int i;
	public int j;
	
	Base(int a, int b)
	{
		System.out.println("Inside of Base constracter");
		this.i = a;
		this.j = b;
	}
	public void gun()
	{
		System.out.println("Inside of Base Gun");
	}
	
	
	
}

class Derived extends Base
{
	public int x;
	public int y;
	
	Derived()
	{
		super(11,21);
		this.x = 15;
		this.y = 17;
		
	}
	
	public void fun()
	{
		super.gun();
		System.out.println("Value from base Class :"+super.i);
	}
}