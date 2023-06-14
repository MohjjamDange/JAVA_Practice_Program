import java.lang.*;

class PL117
{
	public static void main(String a[])
	{
		Demo.gun();
		Demo dobj = new Demo();
		dobj.fun();
		
	}
	
}

class Demo
{
	public int i;
	public int j;
	public static int k;
	
	static
	{
		k = 12;
	}
	
	Demo()
	{
		
		i = 10; 
		j = 20;
	}
	
	public void fun()
	{
		System.out.println(this.i);
		System.out.println(this.j);
		System.out.println(this.k);
	}
	
	public static void gun()
	{
		System.out.println("Inside of gun");
		System.out.println(k);
	}
	
}

