import java.lang.*;
import java.util.*;

class FB1
{
    public static void main(String a[])
    {
        Arithmatic aobj = new Arithmatic();

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Number");
        int iNo = sobj.nextInt();

        boolean bRet = aobj.ChkPerfect(iNo);
        if(bRet == true)
        {
            System.out.println("Given Number is Perfect");
        }
        else
        {
            System.out.println("Number in Non perfect");
        }

    }

}


class Arithmatic
{
    public boolean ChkPerfect(int iNo)
    {
        int iSum = 0;

        for(int iCnt = 1; iCnt < iNo; iCnt++)
        {
            if((iNo % iCnt) == 0)
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


