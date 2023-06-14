import java.lang.*;

class PL120
{
	public static void main(String a[])
	{
		Hello hobj = new Hello();
		
		hobj.fun();
		hobj.gun();
		
	}
	
}

abstract class Demo
{
	public Demo()
	{
		System.out.println("Inside of Demo Constructer");
	}
	
	public void sun()
	{
		System.out.println("Inside Demo sun");
	}
	
	public void gun()
	{
		System.out.println("Inside Base gun");
	}
	
	abstract public void fun();
	
}

class Hello extends Demo
{
	public Hello()
	{
		System.out.println("Inside of Hello Constructer");
	}
	
	public void fun()
	{
		System.out.println("Inside of Hello fun");
	}
	
	
}

