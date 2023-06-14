import java.lang.*;

class DL8
{
    public static void main(String arg[])
    {
        Derived dobj = new Derived();

        dobj.fun();
        System.out.println(dobj.z);
    }
}

class Base
{
    public int x;
    public final int y = 10;
    public final int z;

    public Base()
    {
        z = 11;
    }

    public final void fun()
    {
        System.out.println("Base fun");
    }
}

class Derived extends Base
{
    public Derived()
    {
        System.out.println("Inside of Derived Constructer");
    }

}

