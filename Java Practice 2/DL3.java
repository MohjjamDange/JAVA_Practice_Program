import java.lang.*;

class DL3
{
    public static void main(String arg[])
    {
        Derived dobj = new Derived();

        dobj.fun();
        dobj.gun();
        dobj.run();
        dobj.sun();
        
    }
}

class Base
{
    public int x;
    public int y;

    public Base()
    {
        System.out.println("Inside of Base Constructer");
        x = 11;
        y = 22;
    } 

    public void fun()
    {
        System.out.println("Inside of Base Fun");
    }
    public void gun()
    {
        System.out.println("inside of base gun");
    }

}

class Derived extends Base
{
    public int a;
    public int b;

    public Derived()
    {
        System.out.println("Inside of Derived counstructer");
        a = 10;
        b = 20;
    }

    public void run()
    {
        System.out.println("Inside of Derived Run method");

    }

    public void sun()
    {
        System.out.println("Inside of Derived Sun");
    }


}
