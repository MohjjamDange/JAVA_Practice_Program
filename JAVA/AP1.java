import java.lang.*;

class AP1
{
    public static void main(String a[])
    {
        Demo dobj = new Demo();
        dobj.fun();
        dobj.gun();
    }

}

class Demo
{
    public int x;
    public int y;
    
    public Demo()
    {
        System.out.println("inside of Demo");
        this.x = 11;
        this.y = 12;

    }

    public void fun()
    {
        System.out.println("Inside of Fun");
    }
    public void gun()
    {
        System.out.println("Inside of gun");
    }

}


