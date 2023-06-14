import java.lang.*;

class DL1
{
    public static void main(String arg[])
    {
        Demo dobj = new Demo(11,12);

        dobj.fun();
        dobj.gun();

        System.out.println(dobj.y);
      
    }
}

class Demo
{
    public int x;
    public int y;

    public Demo(int iNo1, int iNo2)
    {
        x = iNo1;
        y = iNo2;

    }

    public void fun()
    {
        System.out.println("Inside of Fun Method");
    }
    public void gun()
    {
        System.out.println("Inside of gun Method");
        System.out.println(x);
    }
}

