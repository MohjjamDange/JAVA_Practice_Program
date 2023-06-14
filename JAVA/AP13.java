import java.lang.*;
import java.util.*;

class AP13
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the Number");
        int iValue = sobj.nextInt();

        Arithamtic aobj = new Arithamtic();

        int iRet = aobj.AddEvenFact(iValue);
        System.out.println("Summetion of Even Factor is:"+iRet);
        
    }
}

class Arithamtic
{
    public int AddEvenFact(int iNo)
    {
        int iSum = 0;

        for(int iCnt = 1; iCnt <= iNo/2; iCnt++)
        {
            if(iNo % iCnt == 0)
            {
                if(iCnt % 2 == 0)
                {
                 iSum = iSum + iCnt;
                }

            }

        }

        return iSum;
     
    }

}

