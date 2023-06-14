import java.lang.*;

class DL6
{
    public static void main(String arg[])
    {
        Base bobj = new Derived(); // upcasting

        bobj.fun();
        bobj.sun();
        bobj.gun();
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
