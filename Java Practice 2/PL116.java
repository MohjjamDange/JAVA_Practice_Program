import java.lang.*;

class PL116
{
	public static void main(String a[])
	{
		Demo dobj = new Demo();
		dobj.fun();
		dobj.gun();
		System.out.println(dobj.i);
		System.out.println(dobj.j);
		
		Demo dobj2 = new Demo(11,21);
		dobj.fun();
		dobj.gun();
		System.out.println(dobj2.i);
		System.out.println(dobj2.j);
		
		
	}
	
}

class Demo
{
	public int i;
	public int j;
	
	public Demo()
	{
		this.i = 10;
		this.j = 20;	
		
	}
	
	public Demo(int a,int b)
	{
		this.i = a;
		this.j = b;
	}
	
	public void fun()
	{
		System.out.println("Inside Fun");
	}
	public void gun()
	{
		System.out.println("Inside gun");
	}
	
}

