import java.lang.*;

class DL9
{
    public static void main(String arg[])
    {
        Base bobj = new Derived();

        bobj.fun();

    }
}

abstract class Base
{
    public Base()
    {
        System.out.println("Inside of Base Class");

    }

    public abstract void fun();
}

class Derived extends Base
{
    public Derived()
    {
        System.out.println("Inside of Derived Class");
    }

    public void fun()
    {
        System.out.println("Inside of Fun Method");
    }


}

