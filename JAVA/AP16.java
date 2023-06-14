import java.lang.*;
import java.util.*;

class AP16
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Number");
        int iNo = sobj.nextInt();

        Arithamtic aobj = new Arithamtic();
        boolean bRet = aobj.ChkPerfect(iNo);
        if(bRet == true)
        {
            System.out.println("Given Number is Perfect");
        }
        else
        {
            System.out.println("Given Number in Not Perfect");
        }

    }

}

class Arithamtic
{
    public boolean ChkPerfect(int iValue)
    {
        int iSum = 0;
        for(int iCnt = 1; iCnt <= iValue/2; iCnt++)
        {
            if(iValue % iCnt == 0)
            {
                iSum = iSum + iCnt;
            }


        }
        if(iValue == iSum)
        {
            return true;
        }
        else
        {
            return false;
        }


    }


}

