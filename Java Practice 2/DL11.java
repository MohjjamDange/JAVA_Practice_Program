import java.lang.*;

class DL11
{
    public static void main(String arg[])
    {
        Base bobj = new Derived();

        bobj.gun();

    }
}

abstract class Base
{
    public abstract void gun();

}

class Derived extends Base
{
    public void gun()
    {
        System.out.println("Inside of Derived Class");
    }

}

