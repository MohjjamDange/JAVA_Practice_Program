import java.lang.*;
import java.util.*;


class AP25
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Base");
        int iValue1 = sobj.nextInt();

        System.out.println("Enter the Power");
        int iValue2 = sobj.nextInt();

        Arithmatic aobj = new Arithmatic();

        int iRet = aobj.power(iValue1, iValue2);
        System.out.println("Answer is :"+iRet);
    

    }
}


class Arithmatic
{
    public int power(int iBase,int iPower)
    {
        int iAns = 1;

        for(int iCnt = 1; iCnt <= iPower; iCnt++)
        {
            iAns = iAns * iBase;
        }
        return iAns;
    }
}


