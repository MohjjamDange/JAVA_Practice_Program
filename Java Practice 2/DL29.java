import java.lang.*;

class DL29
{
    public static void main(String arg[])
    {
        Demo dobj = new Demo();

        Thread tobj1 = new Thread(dobj, "First");
        Thread tobj2 = new Thread(dobj,"Second");

        tobj1.start();
        tobj2.start();
    }
}

class Demo implements Runnable
{
    public void run()
    {
        System.out.println("Inside of:"+Thread.currentThread().getName());
    }

}

