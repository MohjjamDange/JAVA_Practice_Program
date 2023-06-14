import java.lang.*;

class DL4
{
    public static void main(String arg[])
    {
        Derived dobj = new Derived();
        dobj.fun();
    }
}

class Base
{
    public int x;
    protected int y;

    public Base(int iNo1, int iNo2)
    {
        System.out.println("Inside of Constructer");
        x = iNo1;
        y = iNo2;
    }

    public void sun()
    {
        System.out.println("Inside of Base Sun method");
    }
}

class Derived extends Base
{
    public int a;
    public int b;

    public Derived()
    {
        super(11,21);
        System.out.println("Inside of Derived Constructer");
        a = 10;
        b = 20;
    }

    public void fun()
    {
        System.out.println(super.x);
        super.sun();
    }

}

