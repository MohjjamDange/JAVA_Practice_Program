import java.lang.*;

class DL28
{
    public static void main(String arg[])
    {
        Marvellous mobj = new Marvellous();
        
        Thread t1 = new Thread(mobj, "First");
        Thread t2 = new Thread(mobj, "Second");

        t1.start();
        t2.start();
    }
}

class Marvellous extends Thread
{
    public void run()
    {
        System.out.println("Inside of Run :"+Thread.currentThread().getName());
    }




}

