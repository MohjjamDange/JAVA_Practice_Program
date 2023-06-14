import java.lang.*;


class AP2
{
    public static void main(String a[])
    {
        Derived dobj = new Derived();

        dobj.fun(15);
        dobj.gun();



    }



}
class Base
{
    public int i;
    public int j;

    public Base()
    {
        System.out.println("Inside of Base Constructer");
        this.i = 10;
        this.j = 20;

    }

    public void fun()
    {
        System.out.println("Inside of Base fun method");
    }
    public void fun(int k)
    {
        System.out.println("Inside of Parameterised fun Base");
    }

}

class Derived extends Base
{
    public int m;
    public int n;

    public Derived()
    {
        System.out.println("Inside of Derived Constructer");
    }

    public void gun()
    {
        System.out.println("Derived Gun");
    }

    public void sun()
    {
        System.out.println("Inside of Sun method");
    }



}

