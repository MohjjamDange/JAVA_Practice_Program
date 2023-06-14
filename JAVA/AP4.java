import java.lang.*;

class AP4
{
    public static void main(String a[])
    {
        Hello hobj = new Demo();

        hobj.fun();
        hobj.gun();
      
    
    }


}

class Hello
{
    public void fun()
    {
        System.out.println("Inside of Hello fun");
    }

    public void gun()
    {
        System.out.println("Inside of Hello gun");
    }



}

class Demo extends Hello
{
    public void fun()
    {
        System.out.println("Inside of Demo fun");
    }

    public void sun()
    {
        System.out.println("Inside of Sun");
    }



}

