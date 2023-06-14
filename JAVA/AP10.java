import java.lang.*;
import java.util.*;

class AP10
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Number");
        int iNo = sobj.nextInt();

        Arithmatic aobj = new Arithmatic();
        aobj.DisFact(iNo);

    }

}

class Arithmatic
{
    public void DisFact(int i)
    {
        System.out.println("Factors is :");
        for(int iCnt = 1; iCnt <= i/2; iCnt++)
        {
            if(i% iCnt == 0)
            {
                System.out.println(iCnt);
            }

        }
    }

}

