import java.lang.*;

class DL5
{
    public static void main(String arg[])
    {
        Derived dobj = new Derived();

        dobj.fun();
        dobj.sun();
        dobj.gun();
    }
}


class Base
{
    public Base()
    {
        System.out.println("Base Constructer");
    }

    public void fun()
    {
        System.out.println("Base Fun");
    }
    public void gun()
    {
        System.out.println("Base gun");

    }
    public void sun()
    {
        System.out.println("base sun method");
    }
}

class Derived extends Base
{
    public Derived()
    {
        System.out.println("Derived Constructer");
    }
    public void fun()
    {
        System.out.println("Derived Fun");
    }
    public void sun()
    {
        System.out.println("Derived sun Method");
    }

}
