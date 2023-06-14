import java.lang.*;

class AP71
{

    public static void main(String a[])
    {

        Derived dobj = new Derived();
        dobj.gun();
    }



}

abstract class Base
{
    public int i;
    public int j;

    public void fun()
    {
        System.out.println("Inside of Fun method");
    }

    public abstract void gun();


}

class Derived extends Base
{

    public void gun()
    {
        System.out.println("Inside of Derived gun");
    }




}


