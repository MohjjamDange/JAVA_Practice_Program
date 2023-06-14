import java.lang.*;
import java.util.*;

class JL41
{
    public static void main(String arg[])
    {
        boolean bret = false;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Number:");
        int iValue = sobj.nextInt();

        Arithamtic aobj = new Arithamtic(iValue);
       bret = aobj.ChkPerfect();
       if(bret == true)
       {
            System.out.println("Given Number is perfect");

       }
       else
       {
            System.out.println("Given number is Not Perfect");
       }
       
    }

}


class Arithamtic
{
    public int iNo;
    public Arithamtic(int a)
    {
        this.iNo = a;

    }

    public boolean ChkPerfect()
    {
        int iSum = 0;
        for(int iCnt = 1; iCnt < iNo; iCnt++)
        {
            if(iNo % iCnt == 0)
            {
                iSum = iSum + iCnt;
            }

        }
        if(iSum == iNo)
        {
            return true;
        }
        else
        {
            return false;
        }


    }



}


