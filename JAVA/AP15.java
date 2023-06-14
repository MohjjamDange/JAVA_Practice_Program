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

        int iRet = aobj.AddNonEvenFact(iValue);
        System.out.println("Summetion of Non Even Factor is:"+iRet);
        
    }
}

class Arithamtic
{
    
    public int AddNonEvenFact(int iNo)
    {
        int iSum = 0, iCount = 0;
        for(int iCnt = 1; iCnt < iNo; iCnt++)
        {
            if(iNo % iCnt != 0)
            {
                iSum = iSum + iCnt;
                iCount++;
            }

        }
        System.out.println("Number of non Factor is:"+iCount);

        return iSum;
           
    }

}

