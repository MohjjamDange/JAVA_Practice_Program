import java.lang.*;

class AP3
{
    public static void main(String a[])
    {
        Derived dobj = new Derived();

        dobj.fun();
    }



}

class Base
{
    public int i;
    public int j;
    public Base(int a, int b)
    {
        System.out.println("Inside of Base");
        this.i = a;
        this.j = b;

    }

    public void gun()
    {
        System.out.println("Inside of gun");
    }


}

class Derived extends Base
{
    public int x;
    public int y;

    Derived()
    {
        super(11,22);
        System.out.println("Inside of Derived Class");
    }

    public void fun()
    {
        System.out.println("Inside of Derived Fun");
        super.gun();
        System.out.println(super.j);

    }

}


