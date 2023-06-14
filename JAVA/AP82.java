import java.lang.*;

class AP82
{
    public static void main(String a[])
    {
        Marvellous mobj1 = new Marvellous();

        Thread t1 = new Thread(mobj1,"First");

        Marvellous mobj2 = new Marvellous();
        Thread t2 = new Thread(mobj2,"Second");

        t1.start();
        t2.start();

    }




}

class Marvellous implements Runnable
{

    public void run()
    {
        for(int iCnt = 0; iCnt < 1000; iCnt++)
        {
            System.out.println("Thread is :"+Thread.currentThread().getName()+iCnt);
        }

    }


}

