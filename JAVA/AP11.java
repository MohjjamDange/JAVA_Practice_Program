import java.lang.*;
import java.util.*;

class AP11
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Number");
        int iNo = sobj.nextInt();

        Arithmatic aobj = new Arithmatic();
        int iRet = aobj.DisFactSum(iNo);
        System.out.println("Summetion of Factores is :"+iRet); 

    }

}

class Arithmatic
{
    public int DisFactSum(int i)
    {
        int iSum = 0;
        System.out.println("Factors is :");
        for(int iCnt = 1; iCnt <= i/2; iCnt++)
        {
            if(i% iCnt == 0)
            {
                iSum = iSum + iCnt;
               
            }

        }

        return iSum;
    }

}

