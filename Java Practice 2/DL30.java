import java.lang.*;

class DL30
{
    public static void main(String a[])
    {
        Marvellous mobj = new Marvellous();

        Thread t1 = new Thread(mobj,"First");
        Thread t2 = new Thread(mobj,"Second");

        t1.start();
        t2.start();
   }

}


class Marvellous extends Thread
{
    public void run()
    {

        for(int iCnt = 0; iCnt < 100; iCnt++)
        {
            System.out.println(Thread.currentThread().getName()+":"+iCnt);
        }


    }
}

