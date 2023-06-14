import java.lang.*;

class AP70
{
    public static void main(String a[])
    {

        Derived dobj = new Derived();
        dobj.gun();
    }

}

class Base
{
    public int i;
    public int j;

    public Base(int a, int b)
    {
        System.out.println("Inside of Base Constructer");
        i = a;
        j = b;
    }

    public void fun()
    {
        System.out.println("Inside of Base fun method");
    }





}


class Derived extends Base
{
    public int m;
    public int n;

    public Derived()
    {
        super(11, 22);
        System.out.println("Inside of Derived Constructer");
        m = 20;
        n = 25;
    }

    public void gun()
    {
        System.out.println("Inside of Derived Gun");
        System.out.println(super.i);
        super.fun();

    }



}

