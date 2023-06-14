import java.lang.*;

class DL2
{
    public static void main(String arg[])
    {
        Hello hobj = new Hello();
        hobj.fun();
        Hello.gun();
    }

}

class Hello
{
    public int a;
    public int b;
    public static int c;

    public Hello()
    {
        System.out.println("Inside of Constructer");
        a = 10;
        b = 20;

    }

    static
    {
        System.out.println("Inside of static block");
        c = 30;
    }

    public void fun()
    {
        System.out.println("Inside of Fun Method");
        System.out.println(this.a);
        System.out.println(this.b);
        System.out.println(this.c);

    }

    public static void gun()
    {
        System.out.println("Inside of static gun Method");
        System.out.println(c);
    }

}

